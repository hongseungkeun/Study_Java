package day02;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
		// 3개의 정수를 한 번에 입력받은 후
		// 3개의 정수의 합 출력
		Scanner sc = new Scanner(System.in);
		int num, num1, num2, result = 0;
		System.out.println("3개의 정수를 입력하세요 : ");
		num = sc.nextInt();
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		result = num + num1 + num2;
				
//		num = Integer.parseInt(sc.next());
//		num1 = Integer.parseInt(sc.next());
//		num2 = Integer.parseInt(sc.next());
		System.out.println("3개의 정수의 합은 : " + result);
		
		
		
		
	}
}
