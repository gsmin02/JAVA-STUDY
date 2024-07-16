package lotto_project;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto_Result {
    Scanner sc_Result;
    Member_join member;

    public Lotto_Result(Scanner sc_Result, Member_join member) {
        this.sc_Result = sc_Result;
        this.member = member;
    }

    public boolean Lotto_chk() {
        if (!member.checkPaymentPassword()) {
            return false;
        }

        boolean result = true;
        try {
            System.out.println("==============================");
            System.out.println("추첨하시겠습니까? [1] 예 / [2] 아니오");
            System.out.println("==============================");
            String chk = sc_Result.next();
            if (chk.equals("1") || chk.equals("예")) {
                result = true;
            } else if (chk.equals("2") || chk.equals("아니오")) {
                System.out.println("종료합니다.");
                result = false;
            } else {
                System.out.println("잘못된 값을 입력했습니다.");
            }
        } catch (NullPointerException e) {
            System.err.println("에러 : 입력 값이 Null 입니다.");
        } catch (Exception e) {
            System.err.println("알 수 없는 오류가 발생했습니다.");
            e.printStackTrace();
        }
        return result;
    }

    public void Result(int[] input_numbers) {
        // 로또 번호를 담을 배열 생성
        int[] lottoNumbers = new int[6];
        Random rand = new Random();

        // 배열에 6개의 로또 번호 생성
        for (int i = 0; i < 6; i++) {
            int randNumber;
            boolean duplicate;
            do {
                randNumber = rand.nextInt(45) + 1;
                duplicate = false;

                // 배열에서 중복 확인
                for (int j = 0; j < i; j++) {
                    if (lottoNumbers[j] == randNumber) {
                        duplicate = true;
                        break;
                    }
                }
            } while (duplicate);

            lottoNumbers[i] = randNumber;
        }

        // 생성된 로또 번호 정렬
        Arrays.sort(lottoNumbers);
        
        // 사용자 번호와 당첨 번호 출력
        System.out.println("==============================");
        System.out.println("사용자의 로또 번호는 " + Arrays.toString(input_numbers) + " 입니다.");
        System.out.println("당첨 번호는 " + Arrays.toString(lottoNumbers) + " 입니다.");
        System.out.println("==============================");
        
        int count = 0;
        for (int ele1 : lottoNumbers) {
            for (int ele2 : input_numbers) {
                if (ele1 == ele2) {
                    count++;
                }
            }
        }
        System.out.println("==============================");
        switch (count) {
            case 6:
                System.out.println("축하합니다! 1등입니다!");
                break;
            case 5:
                System.out.println("축하합니다! 2등입니다!");
                break;
            case 4:
                System.out.println("축하합니다! 3등입니다!");
                break;
            case 3:
                System.out.println("축하합니다! 4등입니다!");
                break;
            default:
                System.out.println("아쉽지만 당첨되지 않았습니다.");
        }
        System.out.println("==============================");
    }
}
