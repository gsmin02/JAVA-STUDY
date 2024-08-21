package bookstore_project;

import java.util.*;

class Review {
    private int index;
    private int bookIndex;
    private int accountIndex;
    private int starPoint;
    private String nick;
    private String comment;

    public Review(int index, int bookIndex, int accountIndex, int starPoint, String nick, String comment) {
        this.index = index;
        this.bookIndex = bookIndex;
        this.accountIndex = accountIndex;
        this.starPoint = starPoint;
        this.nick = nick;
        this.comment = comment;
    }

    public int getIndex() { return index; }
    public int getBookIndex() { return bookIndex; }
    public int getAccountIndex() { return accountIndex; }
    public int getStarPoint() { return starPoint; }
    public String getNick() { return nick; }
    public String getComment() { return comment; }

    public static List<Review> getReviewsByBook(int bookIndex) {
        List<String> reviewData = DBUtil.read("review");
        List<Review> reviews = new ArrayList<>();
        
        for (String data : reviewData) {
            String[] fields = data.split(",");
            Review review = new Review(
        		Integer.parseInt(fields[0]),
                Integer.parseInt(fields[1]),
                Integer.parseInt(fields[2]),
                Integer.parseInt(fields[3]),
                fields[4],
                fields[5]
        		);
            if(review.getBookIndex() == bookIndex) {
            	reviews.add(review);
            }
        }
        return reviews;
    }

    public static void addReview(int bookIndex, int accountIndex, int starPoint, String nick, String comment) {
        List<String> reviews = DBUtil.read("review");
        int index = reviews.size(); // 새로운 인덱스는 기존 데이터 수를 기반으로 계산
        String newReviewData = index + "," + bookIndex + "," + accountIndex + "," + starPoint + "," + nick + "," + comment;
        DBUtil.create("review", newReviewData);
    }

    public static void deleteReview(int index) {
        DBUtil.delete("review", index);
    }

}
