package day03;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
		// 두 정수 입력받고 대소비교
		Scanner sc = new Scanner(System.in);
//		int num, num1, result = 0;
//		num = sc.nextInt();
//		num1 = sc.nextInt();
//		result = num > num1 ? num : num1;
//		System.out.println(result);

		int num = 0, num1 = 0;
		String result = null;
		String n1Msg = "첫번째 정수 :", n2Msg = "두번째 정수";

		System.out.println(n1Msg);
		num = sc.nextInt();
		System.out.println(n2Msg);
		num1 = sc.nextInt();

		result = num > num1 ? "큰 값 : " + num : num == num1 ? "두 수가 같습니다." : "큰 값 : " + num1;
		System.out.println(result);
	}
}
