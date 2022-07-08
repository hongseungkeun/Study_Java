package day04;

public class MethodTask {

	// 아이언
	// 1~10까지 println()으로 출력하는 메소드
	void numpr() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}

	// "홍길동"을 n번 println()으로 출력하는 메소드
	void npr(int n) {

		for (int i = 0; i < n; i++) {
			System.out.println("홍길동");
		}
	}

	// 브론즈
	// 이름을 n번 println()으로 출력하는 메소드
	void namepr(String name, int n) {
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				System.out.println(i + 1 + "." + name);
			}
		} else
			System.out.println("0은 넣으실수 없습니다");
	}

	// 세 정수의 뺄셈을 해주는 메소드 **높은값부터 빼기를 못함
	int sub(int n, int n1, int n2) {
		int result = 0;
		result = n - n1 - n2;
		return result;
	}

	// 실버
	// 두 정수의 나눗셈을 해주는 메소드(몫과 나머지)
	void div(int n, int n1) {
		int result = 0, result1 = 0;
		if (n1 != 0) {
			result = n / n1;
			result1 = n % n1;
			System.out.println("몫 : " + result + "\n나머지 :" + result1);
		} else {
			System.out.println("두번째 인덱스에 0은 넣으실수없습니다");
		}
	}
//	int[] div(int num1, int num2) {
//		int[] result = null;
//		if(num2 != 0) {
//			result = new int[2];
//			result[0] = num1 / num2;
//			result[0] = num1 % num2;
//		}
//		return result;
//	}

	// 1~n까지의 합을 구해주는 메소드
	void nsum(int n) {
		int c = 0;
		for (int i = 0; i < n; i++) {
			c += i + 1;
		}
		System.out.println(c);

	}

	// 골드
	// 홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
	int ch(int n) {
		int result = 0;
		if (n == 0) {
			result = 0;
		} else if (n % 2 == 1) {
			result = n + 1;
		} else {
			result = n + 1;
		}
		return result;
	}

	// 문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	void strc(String name) { // **
		String input = "";
		String output = "";
		int temp;

		input = name;
		for (int i = 0; i < input.length(); i++) {
			temp = (int) input.charAt(i);

			if ((65 <= temp) && (temp <= 90)) {
				output += (char) (temp + 32);
			} else if (temp >= 97 && temp <= 122) {
				output += (char) (temp - 32);
			} else {
				output += temp;
			}
		}
		System.out.println(output);
	}

	String strch(String name) { // **return해결을 못함..
		String input = "";
		String output = "";
		int temp;

		input = name;
		for (int i = 0; i < input.length(); i++) {
			temp = (int) input.charAt(i);

			if ((65 <= temp) && (temp <= 90)) {
				output += (char) (temp + 32);
			} else if (temp >= 97 && temp <= 122) {
				output += (char) (temp - 32);
			} else {
				output += temp;
			}
		}
		System.out.println(output);
		return output;
	}

	// 플래티넘 **뭔가 쉽게 풀린느낌..어렵게가 잘 생각이안나 ***지금보니 문제 이해를 못한듯 문자의개수를 하지않음
	// 문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
	void strnum(String name) {
		int result = 0;
		for (int i = 0; i < name.length(); i++) {
			result = i + 1;
		}
		System.out.println(result);
	}

	// 5개의 정수를 입력받은 후 원하는 번째 값을 구해주는 메소드
	void f(int n, int n1, int n2, int n3, int n4, int n5) {
		if (n5 == 1) {
			System.out.println(n);
		} else if (n5 == 2) {
			System.out.println(n1);
		} else if (n5 == 3) {
			System.out.println(n2);
		} else if (n5 == 4) {
			System.out.println(n3);
		} else if (n5 == 5) {
			System.out.println(n4);
		}
	}

	// 다이아
	// 한글을 정수로 바꿔주는 메소드(일공이사 -> 1024) **어떻게 바꿀지 감이안오는예제
	void hangleToInt(String hangle) {
		String hangleText = "공일이삼사오육칠팔구";
		String result = "";
		
		for (int i = 0; i < hangle.length(); i++) {
			
		}
		
	}

	// 마스터
	// 5개의 정수를 입력받고 최대값과 최소값을 구해주는 void형 메소드(메소드 안에서 출력 금지, 리턴타입은 void)
	void maxmin(int n, int n1, int n2, int n3, int n4) {
		int[] arData = { n, n1, n2, n3, n4 };
		int[] results = new int[2];

		results[0] = arData[0];
		results[1] = arData[0];
		int[] result = { results[0], results[1] };

		for (int i = 0; i < arData.length; i++) {
			if (results[0] < arData[i]) {
				results[0] = arData[i];
			}
			if (results[1] > arData[i]) {
				results[1] = arData[i];
			}
		}
		System.out.println(results[0]);
		System.out.println(results[1]);
	}

	public static void main(String[] args) {
		MethodTask m = new MethodTask();
		m.hangleToInt("일공이사");
		m.maxmin(1, 2, 3, 4, 5);
//		System.out.println());
	}
}
