package day04;

import java.util.Scanner;

public class arTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 브론즈
		// 1~10까지 배열에 담고 출력
//    int[] arData = {1,2,3,4,5,6,7,8,9,10};
//	for (int i = 0; i < arData.length; i++) {
//		System.out.print(arData[i]);
//		
//	}

//		int[] arData = new int[10];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//			System.out.println(arData[i]);
//		}

		// 10~1까지 중 짝수만 배열에 담고 출력
//		for (int i = 0; i < 5; i++) {
//			System.out.println((5 - i) * 2);
//			
//	}

//		int[] arData = new int[5];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (5 - i) * 2;
//			System.out.println(arData[i]);
//		}
//		

		// 1~100까지 배열에 담은 후 홀수만 출력
//    	int[] arData = new int[100];
//    for (int i = 0; i < arData.length; i++) {
//    	if((i + 1) % 2 == 0) {
//    		continue;
//    	}
//    	arData[i] = i + 1;		
//		System.out.println(arData[i]);
//	}
//    
		// 실버
		// 1~100까지 배열에 담은 후 짝수의 합 출력
//		int[] arData = new int[100];
//		int total = 0;
//	    for (int i = 0; i < arData.length; i++) {
//	    	arData[i] = i + 1;
//    	if(arData[i] % 2 == 0) {
//    		total += arData[i];
//    	}	
//    	System.out.println(arData[i]);    		
//	}
		// A~F까지 배열에 담고 출력
//	    char[] arData = new char[6];
//	    for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i + 65);
//			System.out.println(arData[i]);
//		}

		// A~F까지 중 C 제외하고 배열에 담은 후 출력
//	    char[] arData = new char[5];
//	    for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i > 1 ? i + 66 : i + 65);
//			System.out.println(arData[i]);
//		}
//		

		// 골드
		// 5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
		int[] arData = new int[5];
		int[] results = new int[2];
		for (int i = 0; i < arData.length; i++) {
			System.out.println(i + 1 + "번째 정수 :");
			arData[i] = sc.nextInt();
			
		}
		//최댓값
		results[0] = arData[0];
		//최솟값
		results[1] = arData[0];
		
		for (int i = 0; i < arData.length; i++) {
			if(results[0] < arData[i]) { results[0] = arData[i];}
			if(results[1] > arData[i]) { results[1] = arData[i];}
		}
		System.out.println(results[0]);
		System.out.println(results[1]);

		// 다이아
		// 사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
//		int[] arData = null;
//		int length = 0;
//		int total = 0;
//		double avg = 0.0;
//
//		System.out.println("몇개의 정수를 입력하시오");
//		length = sc.nextInt();
//		arData = new int[length];
//
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = sc.nextInt();
//			total += arData[i];
//		}
//
//		avg = (double) total / arData.length;
//		System.out.println("평균 : " + avg);
	}
}
