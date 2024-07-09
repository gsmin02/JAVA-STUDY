package best_lunch;

public class Menu {
	
	// 메뉴판 작성
	// 규칙 : 마지막 원소는 항상 다중 입력 (예: 2개 입력, n 개 입력 등등)
	// 이유 : Process 클래스에서 마지막 원소만 다중으로 입력 받도록 설계
	String[] menu = new String[] { "",
			"한식", "중식", "일식",
			"양식", "해장", "간편식",
			"탕, 찌개", "기타", "2개 입력"
		};
	
	// 메뉴판 분할 상수 : 몇개 단위로 줄바꿈 할지 설정
	int line = 3;
	
	// 메뉴 목록 출력 함수
	public void printMenu() {
		// 목록 출력
		System.out.println("==============================");
		for(int i = 1; i < menu.length; i++) {
			System.out.print(i + ". " + menu[i] + "   ");
			if(i % line == 0) { System.out.print("\n"); }
		}
		System.out.println("원하는 메뉴(1~" + (menu.length - 1) + ")를 선택하세요.(종료: 0)");
		System.out.println("==============================");
	}
	
	// 메뉴판 갯수 반환 함수
	public int getMenu() {
		return menu.length;
	}
}
