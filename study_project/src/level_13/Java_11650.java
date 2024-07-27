package level_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// import java.util.Arrays;
// import java.util.Scanner;

public class Java_11650 {
	// 풀이 1 - 람다식을 이용한 풀이
    /*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[][] arr = new int[num][2];
		
		for(int i = 0; i < num; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		Arrays.sort(arr, (a, b) -> {
			if(a[0] == b[0]) {
				return a[1] - b[1];
			} else {
				return a[0] - b[0];
			}
		});
		
		for(int i = 0; i < num; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
		sc.close();
	}
    */
	// 풀이 2 - 직접 구현
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
        int arrX[] = new int[num];
        int arrY[] = new int[num];

        StringTokenizer st;
        for (int i = 0; i < num; i++) {
        	st = new StringTokenizer(br.readLine());
            arrX[i] = Integer.parseInt(st.nextToken());
            arrY[i] = Integer.parseInt(st.nextToken());
        }

        Sort(arrX, arrY, 0, num - 1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
        	sb.append(arrX[i]).append(' ').append(arrY[i]).append('\n');
        }
        System.out.println(sb);
    }

    private static void Sort(int[] arrX, int[] arrY, int min, int max) {
    	while (min < max) {
            int mid = Cut(arrX, arrY, min, max);
            if (mid - min < max - mid) {
            	Sort(arrX, arrY, min, mid - 1);
            	min = mid + 1;
            } else {
            	Sort(arrX, arrY, mid + 1, max);
            	max = mid - 1;
            }
        }
    }

    private static int Cut(int[] arrX, int[] arrY, int min, int max) {
        int mid = min + (max - min) / 2;
        int pX = arrX[mid];
        int pY = arrY[mid];
        Swap(arrX, arrY, mid, max);
        int save = min;

        for (int i = min; i < max; i++) {
            if (arrX[i] < pX || (arrX[i] == pX && arrY[i] < pY)) {
            	Swap(arrX, arrY, i, save);
                save++;
            }
        }
        Swap(arrX, arrY, save, max);
        return save;
    }

    private static void Swap(int[] arrX, int[] arrY, int i, int j) {
        int tempX = arrX[i];
        int tempY = arrY[i];
        arrX[i] = arrX[j];
        arrY[i] = arrY[j];
        arrX[j] = tempX;
        arrY[j] = tempY;
    }
}
