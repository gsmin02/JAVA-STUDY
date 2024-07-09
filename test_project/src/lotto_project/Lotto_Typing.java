package lotto_project;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto_Typing {
    Scanner sc_Typing;

    public Lotto_Typing(Scanner sc_Typing) {
        this.sc_Typing = sc_Typing;
    }

    public int[] Typing_arr() {
        // 로또 번호를 담을 배열 생성
        int[] lottoNumbers = new int[6];
        try {
            // 배열에 6개의 로또 번호 생성
            for (int i = 0; i < 6; i++) {
                while (true) {
                    System.out.print((i + 1) + "번째 번호: ");
                    int num = sc_Typing.nextInt();

                    // 입력된 번호가 유효한 범위인지 확인
                    if (num < 1 || num > 45) {
                        System.out.println("유효한 범위의 숫자(1부터 45)를 입력해주세요.");
                        continue;
                    }

                    // 중복 체크
                    boolean duplicate = false;
                    for (int j = 0; j < i; j++) {
                        if (lottoNumbers[j] == num) {
                            duplicate = true;
                            break;
                        }
                    }
                    if (!duplicate) {
                        lottoNumbers[i] = num;
                        break; // 유효하고 중복되지 않은 번호이므로 반복문 종료
                    } else {
                        System.out.println("이미 입력된 번호입니다. 다시 입력해주세요.");
                    }
                }
            }
            // 생성된 로또 번호 정렬
            Arrays.sort(lottoNumbers);

        } catch(NullPointerException e) {
            System.err.println("에러 : 입력 값이 Null 입니다.");
        } catch (Exception e) {
            System.err.println("알 수 없는 오류가 발생했습니다.");
            e.printStackTrace();
        }
        return lottoNumbers;
    }
}
