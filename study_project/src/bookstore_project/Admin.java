package bookstore_project;

import java.util.*;

class Admin {
    // 도서 관리: 도서 조회, 추가, 수정, 삭제
    public static void manageBooks() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== 도서 관리 ===");
            System.out.println("1. 도서 목록 보기");
            System.out.println("2. 도서 추가");
            System.out.println("3. 도서 수정");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 돌아가기");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                List<Book> books = Book.getBooks();
                for (Book book : books) {
                    System.out.println(book.getIndex() + ": " + book.getTitle());
                }
            } else if (choice == 2) {
                System.out.print("제목: ");
                String title = scanner.nextLine();
                System.out.print("저자: ");
                String author = scanner.nextLine();
                System.out.print("출판사: ");
                String company = scanner.nextLine();
                System.out.print("가격: ");
                int price = scanner.nextInt();
                scanner.nextLine();
                System.out.print("소개: ");
                String preview = scanner.nextLine();

                Book.addBook(title, author, company, price, preview);
                System.out.println("도서가 추가되었습니다.");
            } else if (choice == 3) {
                System.out.print("수정할 도서의 인덱스: ");
                int index = scanner.nextInt();
                scanner.nextLine();
                System.out.print("제목: ");
                String title = scanner.nextLine();
                System.out.print("저자: ");
                String author = scanner.nextLine();
                System.out.print("출판사: ");
                String company = scanner.nextLine();
                System.out.print("가격: ");
                int price = scanner.nextInt();
                scanner.nextLine();
                System.out.print("소개: ");
                String preview = scanner.nextLine();

                Book.updateBook(index, title, author, company, price, preview);
                System.out.println("도서가 수정되었습니다.");
            } else if (choice == 4) {
                System.out.print("삭제할 도서의 인덱스: ");
                int index = scanner.nextInt();
                scanner.nextLine();
                Book.deleteBook(index);
                System.out.println("도서가 삭제되었습니다.");
            } else if (choice == 5) {
                break; // 돌아가기
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }

    // 회원 관리: 회원 조회, 수정, 삭제
    public static void manageAccounts() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== 회원 관리 ===");
            System.out.println("1. 회원 목록 보기");
            System.out.println("2. 회원 정보 수정");
            System.out.println("3. 회원 삭제");
            System.out.println("4. 돌아가기");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                List<Account> accounts = Account.getAllAccounts();
                for (Account account : accounts) {
                    System.out.println(account.getIndex() + ": " + account.getName() + " (" + account.getId() + ")");
                }
            } else if (choice == 2) {
                System.out.print("수정할 회원의 인덱스: ");
                int index = scanner.nextInt();
                scanner.nextLine();
                System.out.print("새 이름: ");
                String newName = scanner.nextLine();
                System.out.print("새 비밀번호: ");
                String newPassword = scanner.nextLine();

                // 회원 정보를 수정하기 위해 파일을 수정합니다.
                List<Account> accounts = Account.getAllAccounts();
                if (index >= 0 && index < accounts.size()) {
                    Account account = accounts.get(index);
                    account = new Account(index, newName, account.getId(), newPassword);
                    DBUtil.update("account", index, index + "," + newName + "," + account.getId() + "," + newPassword);
                    System.out.println("회원 정보가 수정되었습니다.");
                } else {
                    System.out.println("잘못된 인덱스입니다.");
                }

            } else if (choice == 3) {
                System.out.print("삭제할 회원의 인덱스: ");
                int index = scanner.nextInt();
                scanner.nextLine();
                DBUtil.delete("account", index);
                System.out.println("회원이 삭제되었습니다.");
            } else if (choice == 4) {
                break; // 돌아가기
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }

    // 주문 관리: 주문 조회, 수정, 삭제
    public static void manageOrders() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== 주문 관리 ===");
            System.out.println("1. 주문 목록 보기");
            System.out.println("2. 주문 정보 수정");
            System.out.println("3. 주문 삭제");
            System.out.println("4. 돌아가기");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                List<String> ordersData = DBUtil.read("order");
                List<Order> orders = new ArrayList<>();
                
                for (String data : ordersData) {
                    String[] fields = data.split(",");
                    Order order = new Order(
                		Integer.parseInt(fields[0]),
                        Integer.parseInt(fields[1]),
                        Integer.parseInt(fields[2]),
                        Integer.parseInt(fields[3]),
                        Integer.parseInt(fields[4]),
                        fields[5]
                    );
                    orders.add(order);
                }
                
                for (Order order : orders) {
                    System.out.println(order.getIndex() + ": 책 번호 " + order.getBookIndex() + ", 총 가격: " + order.getTotalPrice() + ", 배송지: " + order.getAddress());
                }
            } else if (choice == 2) {
                System.out.print("수정할 주문의 인덱스: ");
                int index = scanner.nextInt();
                scanner.nextLine();
                System.out.print("새 배송지: ");
                String newAddress = scanner.nextLine();

                List<String> ordersData = DBUtil.read("order");
                List<Order> orders = new ArrayList<>();
                
                for (String data : ordersData) {
                    String[] fields = data.split(",");
                    Order order = new Order(
                		Integer.parseInt(fields[0]),
                        Integer.parseInt(fields[1]),
                        Integer.parseInt(fields[2]),
                        Integer.parseInt(fields[3]),
                        Integer.parseInt(fields[4]),
                        fields[5]
                    );
                    orders.add(order);
                }
                if (index >= 0 && index < orders.size()) {
                    Order order = orders.get(index);
                    order = new Order(order.getIndex(), order.getBookIndex(), order.getAccountIndex(), order.getAmount(), order.getTotalPrice(), newAddress);
                    DBUtil.update("order", index, index + "," + order.getBookIndex() + "," + order.getAccountIndex() + "," + order.getAmount() + "," + order.getTotalPrice() + "," + newAddress);
                    System.out.println("주문 정보가 수정되었습니다.");
                } else {
                    System.out.println("잘못된 인덱스입니다.");
                }

            } else if (choice == 3) {
                System.out.print("삭제할 주문의 인덱스: ");
                int index = scanner.nextInt();
                scanner.nextLine();
                DBUtil.delete("order", index);
                System.out.println("주문이 삭제되었습니다.");
            } else if (choice == 4) {
                break; // 돌아가기
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
