package bookstore_project;

import java.util.*;

class Book {
    private int index;
    private String title;
    private String author;
    private String company;
    private int price;
    private String preview;

    public Book(int index, String title, String author, String company, int price, String preview) {
        this.index = index;
        this.title = title;
        this.author = author;
        this.company = company;
        this.price = price;
        this.preview = preview;
    }

    public int getIndex() { return index; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getCompany() { return company; }
    public int getPrice() { return price; }
    public String getPreview() { return preview; }

    public static List<Book> getBooks() {
        List<String> bookData = DBUtil.read("book");
        List<Book> books = new ArrayList<>();
        for (String data : bookData) {
            String[] fields = data.split(",");
            Book book = new Book(
        		Integer.parseInt(fields[0]),
                fields[1],
                fields[2],
                fields[3],
                Integer.parseInt(fields[4]),
                fields[5]
            );
            books.add(book);
        }
        return books;
    }

    public static Book getBookDetails(int bookIndex) {
        List<String> booksData = DBUtil.read("book");
        for (String bookData : booksData) {
            String[] data = bookData.split(",");
            if (Integer.parseInt(data[0]) == bookIndex) {
                return new Book(Integer.parseInt(data[0]), data[1], data[2], data[3], Integer.parseInt(data[4]), data[5]);
            }
        }
        return null;
    }

    public static void addBook(String title, String author, String company, int price, String preview) {
        List<String> books = DBUtil.read("book");
        int index = books.size(); // 새로운 인덱스는 기존 데이터 수를 기반으로 계산
        String newBookData = index + "," + title + "," + author + "," + company + "," + price + "," + preview;
        DBUtil.create("book", newBookData);
    }

    public static void updateBook(int index, String title, String author, String company, int price, String preview) {
        String updatedBookData = index + "," + title + "," + author + "," + company + "," + price + "," + preview;
        DBUtil.update("book", index, updatedBookData);
    }

    public static void deleteBook(int index) {
        DBUtil.delete("book", index);
    }
}
