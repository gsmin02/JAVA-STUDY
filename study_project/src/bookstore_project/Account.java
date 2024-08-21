package bookstore_project;

import java.util.*;

class Account {
    private int index;
    private String name;
    private String id;
    private String password;

    public Account(int index, String name, String id, String password) {
        this.index = index;
        this.name = name;
        this.id = id;
        this.password = password;
    }
    
    public int getIndex() { return index; }
    public String getName() { return name; }
    public String getId() { return id; }
    public String getPassword() { return password; }
    
    public static Account signUp() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== 회원가입 ===");
        System.out.print("이름: ");
        String name = scanner.nextLine();
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();

        int newIndex = getNextAccountIndex();

        Account newAccount = new Account(newIndex, name, id, password);
        addAccount(newAccount);

        System.out.println("회원가입이 완료되었습니다.");

        return newAccount;
    }

    public static Account login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== 로그인 ===");
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();

        Account account = authenticate(id, password);

        if (account != null) {
        	return account;
        } else {
            return null;
        }
    }

    private static Account authenticate(String id, String password) {
        List<Account> accounts = getAllAccounts();
        for (Account account : accounts) {
            if (account.getId().equals(id) && account.getPassword().equals(password)) {
                return account;
            }
        }
        return null;
    }

    public static List<Account> getAllAccounts() {
        List<String> accountData = DBUtil.read("account");
        List<Account> accounts = new ArrayList<>();
        for (String data : accountData) {
            String[] fields = data.split(",");
            Account account = new Account(Integer.parseInt(fields[0]), fields[1], fields[2], fields[3]);
            accounts.add(account);
        }
        return accounts;
    }

    private static int getNextAccountIndex() {
        List<Account> accounts = getAllAccounts();
        return accounts.size();
    }

    private static void addAccount(Account account) {
        String accountData = account.getIndex() + "," + account.getName() + "," + account.getId() + "," + account.getPassword();
        DBUtil.create("account", accountData);
    }

    // 사용자 도서 목록 보기 및 선택 후 주문 기능
    public void browseAndOrder() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== 도서 목록 ===");
            List<Book> books = Book.getBooks();
            for (Book book : books) {
                System.out.println(book.getIndex() + ": " + book.getTitle() + " by " + book.getAuthor() + " - " + book.getPrice() + "원");
            }
            System.out.println("도서 상세 보기 또는 주문하려면 도서 인덱스를 입력하세요. (종료하려면 -1 입력)");
            int bookIndex = scanner.nextInt();
            scanner.nextLine();

            if (bookIndex == -1) {
                break; // 종료
            } else if (bookIndex >= 0 && bookIndex < books.size()) {
                Book selectedBook = books.get(bookIndex);
                System.out.println("\n=== 도서 정보 ===");
                System.out.println("제목: " + selectedBook.getTitle());
                System.out.println("저자: " + selectedBook.getAuthor());
                System.out.println("출판사: " + selectedBook.getCompany());
                System.out.println("가격: " + selectedBook.getPrice());
                System.out.println("소개: " + selectedBook.getPreview());

                System.out.println("\n=== 리뷰 ===");
                List<Review> reviews = Review.getReviewsByBook(bookIndex);
                for (Review review : reviews) {
                    System.out.println("작성자: " + review.getNick() + " - 별점: " + review.getStarPoint());
                    System.out.println("내용: " + review.getComment());
                }

                System.out.println("\n이 도서를 주문하시겠습니까? (y/n)");
                String orderChoice = scanner.nextLine();
                if (orderChoice.equals("y")) {
                    System.out.print("수량: ");
                    int amount = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("배송지: ");
                    String address = scanner.nextLine();
                    int totalPrice = selectedBook.getPrice() * amount;

                    // 주문 생성 및 저장
                    Order newOrder = new Order(Order.getNextOrderIndex(), selectedBook.getIndex(), this.index, amount, totalPrice, address);
                    Order.addOrder(newOrder);
                    System.out.println("주문이 완료되었습니다.");
                }
            } else {
                System.out.println("잘못된 인덱스입니다.");
            }
        }
    }
}
