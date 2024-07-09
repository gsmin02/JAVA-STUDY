package lotto_project;

import java.util.Scanner;

public class Member_join {
	public Member_join() {
		Scanner sc = new Scanner(System.in);
		try {
			Member member = new Member();
			
			System.out.println("이름 : ");
			member.setMember_name(sc.next());
			System.out.println("태어난 연도 : ");
			member.setMember_yy(sc.next());
			System.out.println("태어난 월 : ");
			member.setMember_mm(sc.next());
			System.out.println("태어난 일 : ");
			member.setMember_dd(sc.next());
			System.out.println("이메일 : ");
			member.setMember_email(sc.next());
			System.out.println("주소 : ");
			member.setMember_address(sc.next());
			System.out.println("결제 비밀번호 : ");
			member.setMember_pay(sc.next());
			
		} catch(NullPointerException e) {
			System.err.println("에러 : 입력 값이 Null 입니다.");
		} catch (Exception e) {
            System.err.println("알 수 없는 오류가 발생했습니다.");
            e.printStackTrace();
        } finally {
            sc.close();
        }
	}

}
