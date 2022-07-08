package day02;

import java.util.Scanner;

public class InputTask {
	public static void main(String[] args) {
		// 두 정수를 입력한 후 덧셈 결과 출력
		// 단, next()만 사용
		Scanner sc = new Scanner(System.in);
		String num = "";
		String num1 = "";
		
		System.out.println("두 정수를 입력하세요 : ");
		num = sc.next();
		num1 = sc.next();
		System.out.println("결과는" + (Integer.parseInt(num)+Integer.parseInt(num1)) + "입니다");
				
	}
}
