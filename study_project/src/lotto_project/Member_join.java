package lotto_project;

import java.time.LocalDate;
import java.util.Scanner;

public class Member_join {
    Member member = new Member();
    Scanner sc_join;

    public Member_join(Scanner sc_join) {
        this.sc_join = sc_join;
        try {
            System.out.println("==============================");
            System.out.println("로또 추첨을 위해 회원가입이 필요합니다. [1] 예 / [2] 아니오");
            System.out.println("==============================");
            String chk = sc_join.next();

            if (chk.equals("1") || chk.equals("예")) {
                System.out.println("이름 : ");
                member.setMember_name(sc_join.next());
                System.out.println("태어난 연도 : ");
                member.setMember_yy(sc_join.next());
                System.out.println("태어난 월 : ");
                member.setMember_mm(sc_join.next());
                System.out.println("태어난 일 : ");
                member.setMember_dd(sc_join.next());
                System.out.println("이메일 : ");
                member.setMember_email(sc_join.next());
                System.out.println("주소 : ");
                member.setMember_address(sc_join.next());
                System.out.println("결제 비밀번호 : ");
                member.setMember_pay(sc_join.next());
                System.out.println("==============================");
                System.out.println("회원가입이 완료되었습니다.");
                System.out.println("==============================");
                return;
            } else if (chk.equals("2") || chk.equals("아니오")) {
                System.out.println("종료합니다.");
                return;
            } else {
                System.out.println("잘못된 값을 입력했습니다.");
            }
        } catch (NullPointerException e) {
            System.err.println("에러 : 입력 값이 Null 입니다.");
        } catch (Exception e) {
            System.err.println("알 수 없는 오류가 발생했습니다.");
            e.printStackTrace();
        }
    }

    public void Member_Auth() {
        // 현재 날짜 확인
        LocalDate currentDate = LocalDate.now();

        int yy = Integer.parseInt(member.getMember_yy());
        int mm = Integer.parseInt(member.getMember_mm());
        int dd = Integer.parseInt(member.getMember_dd());
        // 생일 날짜 조합
        LocalDate birthDate = LocalDate.of(yy, mm, dd);

        // 날짜와 비교하여 현재 나이를 측정
        int age = currentDate.getYear() - birthDate.getYear();

        if (age < 19) {
            System.out.println("==============================");
            System.out.println("미성년자는 이용할 수 없습니다.");
            System.out.println("==============================");
            return;
        }
    }

    public boolean checkPaymentPassword() {
        System.out.println("결제 비밀번호를 입력해주세요:");
        String inputPassword = sc_join.next();
        if (inputPassword.equals(member.getMember_pay())) {
            return true;
        } else {
            System.out.println("결제 비밀번호가 일치하지 않습니다.");
            return false;
        }
    }
}
