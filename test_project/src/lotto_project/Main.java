package lotto_project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 회원가입
        Member_join member = new Member_join(scanner);
        // 성인여부
        member.Member_Auth();
        
        // 로또 입력
        Lotto_Nums nums = new Lotto_Nums();
        new Lotto(scanner, nums);
        
        Lotto_Result lotto = new Lotto_Result(scanner, member);
        if (lotto.Lotto_chk()) {
            lotto.Result(nums.getNums());
        }
        
        scanner.close();
    }
}
