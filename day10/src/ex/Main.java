package ex;

import java.util.Scanner;

public class Main {

	public static MyMath calculate(String oper) {
		MyMath math = null;

		switch (oper) {
		case "+": // +라면 math는 num1 + num2
			math = (num1, num2) -> num1 + num2;
			break;

		case "-": // -라면 math는 num1 - num2
			math = (num1, num2) -> num1 - num2;
			break;
		}
		return math;
	}

	public static void main(String[] args) {
		OperCheck operCheck = (expression) -> { // +-를 잘라주는 operCheck
			String temp = ""; // +-들을 넣어줄 공간
			for (int i = 0; i < expression.length(); i++) {
				char c = expression.charAt(i); // 전체식을 하나씩 쪼갠다
				if (c == 43 || c == 45) { // 만약 +(43) -(45)라면
					temp += c;			  // temp에 그 값을 넣어줌	
				}
			}
			return temp.split(""); // 그 넣어준 값들을 ""로 잘라서 하나하나 나눔
		};

		String msg = "정수의 덧셈, 뺄셈에 대한 식을 입력하세요";
		String exMsg = "예) 7 + 65 - 8";
		String temp = null;			// 전체식을 입력받을 공간
		String[] nums = null;		// 정수만 넣어줄 공간
		String[] opers = null;		// +-들을 넣어줄 공간
		int num1 = 0, num2 = 0;		// num1,num2를 넣을 변수
 		Scanner sc = new Scanner(System.in);
		
		System.out.println(msg);
		System.out.println(exMsg);
		temp = sc.next(); // 전체 식 입력받기
		
		nums = temp.split("\\+|\\-"); // 입력받은 전체 식을 nums배열에 넣어줌
		opers = operCheck.getOpers(temp); // 전체식을 operCheck로 +-들을 나눠서 opers배열에 넣어줌
		
		num1 = Integer.parseInt(nums[0].equals("") ? opers[0] + nums[1] : nums[0]); // num0이 ""이라면(만약 앞이 음수일때 num0은 비어있게됨) 
																					// opers[0]은 첫번째 연산, num[1]은 두번째 숫자, 두개를 더해 num1에 넣어준다
																					// num0이  ""이아니라면 그대로 num[0]을 num1에 넣어준다

        for (int i = 0; i < opers.length; i++) // 만약 1+3-5라면 연산은 1+3=4 한번, 4-5=-1 두번, 결국 연산자의 길이만큼 반복을 돌려주면 되므로 opers(+-들어있는)의 길이만큼 해준다
        {
              if (num1 < 0 && i == 0) // i == 0(첫번째 반복때) num1이 음수라면 아래를 실행시키면 안됨
              {
                 continue;	// 그래서 아래를 실행하지않고 다음 반복 실행
              }
			num2 = Integer.parseInt(nums[i + 1]); // 2+3이라면 첫번째 반복 때 num2는 배열의 2번째에 위치하기 때문에  nums[i + 1]로 해주고 정수로 바꿔준다
			num1 = calculate(opers[i]).calc(num1, num2); // cals함수형 인터페이스에 num1,num2를 calculate(opers[i])에 매개변수로 넣어줘서 num1에 넣어준다.

		}
		System.out.println(num1); // num1을 
	}
}
