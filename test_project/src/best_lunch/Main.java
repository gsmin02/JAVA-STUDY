package best_lunch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		try {
			// 메뉴판 불러오기
			menu.printMenu();
			// 입력 받기
			int input = sc.nextInt();
			// 입력받은 값 넘겨주기
			new Process(input);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("0~" + (menu.getMenu() - 1) + "번까지 입력해주세요.");
		} catch (InputMismatchException e) {
			System.out.println("숫자로 입력해주세요.");
		} catch (Exception e) {
			System.out.println("알 수 없는 예외가 발생했습니다.");
			System.out.println("원인 : " + e.getMessage());
		} finally {
            sc.close();
        }
	}

}
