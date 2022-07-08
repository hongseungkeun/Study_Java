package day03;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//      브론즈
//      1 ~ 100까지 출력
//		int end = 100;
//		for (int i = 0; i < end; i++) {
//			System.out.println(i + 1);
//		}
//		System.out.println();
//      100 ~ 1까지 출력
//		for (int i = 0; i < end; i++) {
//			System.out.println(end - i);
//		}
//		System.out.println();
//      1 ~ 100까지 중 짝수만 출력
//		for (int i = 0; i < end; i++) {
//			if(i % 2 == 1) {
//				System.out.println(i + 1);
//			}
//		}
//		System.out.println();
//		//for (int i = 0; i < 50; i++) {
//		
//			System.out.println((i + 1) * 2);
//		}
//	}
//				
//      실버
//      1 ~ 10까지 합 출력
//		int sum = 0;
//		for(int i = 0; i < 10; i++) {
//			sum += i + 1;
//		}

//		System.out.println(sum);
//		System.out.println();
//      1 ~ n까지 합 출력	
//		int n = 0, x = 0;
//		n = sc.nextInt();
//		for (int i = 0; i < n; i++) {
//			x += i + 1;
//		}

//		System.out.println(x);
//		System.out.println();
//      골드
//      A ~ F까지 출력

//		for (int i = 0; i < 6; i++) {
//			System.out.println((char)(i + 65));
//		}

//      A ~ F중 C제외하고 출력
//		for (int i = 0; i < 5; i++) {
//			System.out.println((char)(i + (i > 1 ? 66 : 65)));

//		}
		
//      다이아
//      0 1 2 3 0 1 2 3 0 1 2 3 출력
//		for (int i = 0; i < 12; i++) {
//			System.out.print(i%4 + " ");
//		}
		
//      aBcDeFg....Z 출력
		for (int i = 0; i < 26; i++) {
			System.out.print((char)(i + (i % 2 == 0 ? 97 : 65)));
		}
		
		
		
		
		
	}
}
