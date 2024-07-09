package lotto_project;

import java.util.Scanner;

public class Lotto {
    String chk1;
    String auto;

    public Lotto(Scanner sc_Lotto, Lotto_Nums lotto_nums) {        
        System.out.println("==============================");
        System.out.println("로또를 구매하시겠습니까? [1] 예 / [2] 아니오");
        System.out.println("==============================");
        try {
            chk1 = sc_Lotto.next();
        } catch(NullPointerException e) {
            System.err.println("에러 : 입력 값이 Null 입니다.");
        } catch (Exception e) {
            System.err.println("알 수 없는 오류가 발생했습니다.");
            e.printStackTrace();
        }
        
        if (chk1.equals("1") || chk1.equals("예")) {
            System.out.println("==============================");
            System.out.println("자동으로 구매하시겠습니까?(아닌 경우 직접입력) [1] 예 / [2] 아니오");
            System.out.println("==============================");
            try {
                auto = sc_Lotto.next();
            } catch(NullPointerException e) {
                System.err.println("에러 : 입력 값이 Null 입니다.");
            } catch (Exception e) {
                System.err.println("알 수 없는 오류가 발생했습니다.");
                e.printStackTrace();
            }
            
            if (auto.equals("1") || auto.equals("예")) {
                // 자동 로또 프로그램 실행
                Lotto_Auto auto_num = new Lotto_Auto();
                // 번호 저장
                lotto_nums.setNums(auto_num.Auto_arr());
            } else if (auto.equals("2") || auto.equals("아니오")) {
                // 수동 로또 프로그램 실행
                Lotto_Typing typing_num = new Lotto_Typing(sc_Lotto);
                // 번호 저장
                lotto_nums.setNums(typing_num.Typing_arr());
            } else {
                System.out.println("잘못된 값을 입력했습니다.");
            }
        } else if (chk1.equals("2") || chk1.equals("아니오")) {
            System.out.println("종료합니다.");
            return;
        } else {
            System.out.println("잘못된 값을 입력했습니다.");
        }
    }
}
