 package bookstore_project;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=== 서점 시스템 ===");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 관리자 로그인");
            System.out.println("4. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거

            if (choice == 1) {
                Account newAccount = Account.signUp();
                if (newAccount != null) {
                    System.out.println("회원가입이 완료되었습니다. 로그인해 주세요.");
                }

            } else if (choice == 2) {
                Account account = Account.login();
                if (account != null) {
                    System.out.println("로그인 성공! 환영합니다, " + account.getName());
                    account.browseAndOrder(); // 도서 탐색 및 주문 기능 호출
                } else {
                    System.out.println("로그인 실패. ID 또는 비밀번호를 확인하세요.");
                }

            } else if (choice == 3) {
                // 관리자 로그인 및 관리 기능 호출
                System.out.print("관리자 ID: ");
                String adminId = scanner.nextLine();
                System.out.print("비밀번호: ");
                String adminPassword = scanner.nextLine();
                
                String admin_id = "admin";
                String admin_pw = "admin";

                if (adminId.equals(admin_id) && adminPassword.equals(admin_pw)) {
                    System.out.println("관리자 로그인 성공!");
                    while (true) {
                        System.out.println("\n=== 관리자 페이지 ===");
                        System.out.println("1. 도서 관리");
                        System.out.println("2. 회원 관리");
                        System.out.println("3. 주문 관리");
                        System.out.println("4. 로그아웃");
                        System.out.print("선택: ");
                        int adminChoice = scanner.nextInt();
                        scanner.nextLine();

                        if (adminChoice == 1) {
                            Admin.manageBooks();
                        } else if (adminChoice == 2) {
                            Admin.manageAccounts();
                        } else if (adminChoice == 3) {
                            Admin.manageOrders();
                        } else if (adminChoice == 4) {
                            break; // 로그아웃
                        } else {
                            System.out.println("잘못된 선택입니다.");
                        }
                    }
                } else {
                    System.out.println("관리자 로그인 실패.");
                }

            } else if (choice == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }
        scanner.close();
    }
}
