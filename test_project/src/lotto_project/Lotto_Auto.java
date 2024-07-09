package lotto_project;

import java.util.Arrays;
import java.util.Random;

public class Lotto_Auto {
	public Lotto_Auto() {
		
	}
	public int[] Auto_arr() {
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
		
		return lottoNumbers;
	}
}
