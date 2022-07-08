package day04;

import java.util.Scanner;

public class ArTask2 {
	public static void main(String[] args) {
		//사용자에게 입력받은 문자열 중 소문자는 모두 대문자로, 대문자는 모두 소문자로 변경한다.
//		Scanner sc = new Scanner(System.in);
		//아래에서 대입 연산자를 사용할 때에는 null,
		//연결을 할 때에는 ""로 초기화
//		String str = null, result = "";
	//강사님의 답
//		String str = null, result = "";
//		
//		System.out.println("문자열 : ");
//		str = sc.next();
//		
//		for (int i = 0; i < str.length(); i++) {
//			char c = str.charAt(i);
//			if(c >= 65 && c <= 90) {//대문자
//				result += (char)(c + 32);
//			}else if(c >= 97 && c <= 122) {//소문자
//				result += (char)(c - 32);
//			}else {//그 이외의 문자
//				result += c;
//			}
//		}	
//		System.out.println(result);
		
// 내가 푼것	
//		String input = "";
//		String output = "";
//		int temp = 0;
//		
//		System.out.println("문자열을 입력하시오 : ");
//		input = sc.nextLine();
//		
//		for (int i = 0; i < input.length(); i++) {
//			temp = (int)input.charAt(i);
//			
//			if((65 <= temp) && (temp <= 90)) {
//				output += (char)(temp + 32);
//			}else if(temp >= 97 && temp <= 122) {
//				output += (char)(temp - 32);
//			}else {
//				result += temp;
//		}
//		System.out.println(output);
	
		//정수를 한글로 변경 ***복습해야함
//		int num = 0;
//		String result = "";
// 		String hangle = "공일이삼사오육칠팔구";
//
//		System.out.println("정수를 입력하세요 : ");
//		// 사용자에게 정수 입력받은 후 num에 저장
//		num = sc.nextInt();
//		
//		while(num != 0) {
//			// num % 10 : 1의 자리 수 정수
//			// hangle의 인덱스 번호를 사용자가 입력한 각 자리수 정수로 사용한다.
//			// 1의 자리수부터 나누기 때문에 역순으로 한글이 연결된다.
//			// 따라서 result + 한글로 하면 역순이고, 한글 + result로 해야 정방향이다.
//			result = hangle.charAt(num % 10) + result;
//			num /= 10;	
//				
//		}
//		System.out.println(result);
	}
}
