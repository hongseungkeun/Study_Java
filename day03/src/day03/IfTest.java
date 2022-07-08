package day03;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		// 심리 테스트
		/*
		 * Q. 당신이 좋아하는 색을 선택하세요. 1. 빨간색 2. 노란색 3. 검은색 4. 흰색
		 * 
		 * 빨간색 : 불같고 열정적이고 적극적이다. 노란색 : 발랄하고 밝고 귀엽고 개성있고 유하다. 검은색 : 묵묵하고 든든하고 냉철하고 멋지다
		 * 그리고 강하다. 흰색 : 천사같고 깔끔하고 정지를 좋아하고 배려심이 많다.
		 * 
		 * 삼항 연산자 사용!
		 */

		// 사용자에게 출력할 메시지
		String msg = "Q. 당신이 좋아하는 색을 선택하세요.";
		String choiceMsg = "1.빨간색\n2.노란색\n3.검은색\n4.흰색";

		// 빨간색 선택 시 출력할 메시지
		String redMsg = "불같고 열정적이고 적극적이다.";

		// 노란색 선택 시 출력할 메시지
		String yellowMsg = "발랄하고 밝고 귀엽고 개성있고 유하다.";

		// 검은색 선택 시 출력할 메시지
		String blackMsg = "묵묵하고 든든하고 냉철하고 멋지다 그리고 강하다.";

		// 흰색 선택 시 출력할 메시지
		String whiteMsg = "천사같고 깔끔하고 정지를 좋아하고 배려심이 많다.";

		String errorMsg = "다시 시도해주세요";
		String resultMsg = null;

		int choice = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println(msg + "n" + choiceMsg);
		choice = sc.nextInt();

		if (choice == 1) {
			resultMsg = redMsg;
		} else if (choice == 2) {
			resultMsg = yellowMsg;
		} else if (choice == 3) {
			resultMsg = blackMsg;
		} else if (choice == 4) {
			resultMsg = whiteMsg;
		} else {
			resultMsg = errorMsg;
		}

		System.out.println(resultMsg);

	}
}