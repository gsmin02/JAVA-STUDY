package level_6;

import java.util.Scanner;

public class Java_25206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double result = 0; // 학점 * 성적
		double sum = 0; // 학점 총합
		char c;
		
		for(int i = 0; i < 20; i++) {
			double credit = 0; // 과목 학점
			double grade = 0; // 성적
			
			String str[] = sc.nextLine().split(" "); // 띄어쓰기로 구분
			credit += Double.parseDouble(str[1]); // 학점
			c = str[2].charAt(0); // 알파벳 등급 추출
			
			switch(c) {
			case 'A' :
				if(str[2].charAt(1) == '+') grade += 4.5; // A+ 인 경우
				else grade += 4.0; // 그냥 A 인 경우
				break;
			case 'B' :
				if(str[2].charAt(1) == '+') grade += 3.5;
				else grade += 3.0;
				break;
			case 'C' :
				if(str[2].charAt(1) == '+') grade += 2.5;
				else grade += 2.0;
				break;
			case 'D' :
				if(str[2].charAt(1) == '+') grade += 1.5;
				else grade += 1.0;
				break;
			case 'F' :
				grade += 0;
				break;
			case 'P' :
				grade += 0;
				credit = 0;
				break;
			}
			sum += credit;
			result += credit * grade;
		}
		System.out.println(result/sum); // 평균 학점
		sc.close();
	}

}
