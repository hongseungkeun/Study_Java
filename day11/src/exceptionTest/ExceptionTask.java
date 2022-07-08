package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
		
		//5개의 정수만 입력받기
		//- 무한 입력 가능
		//- q를 입력하면 나가기
		//- 5개의 정수는 배열에 담기
		//- if문은 딱 한번만 사용하기
		
		Scanner sc = new Scanner(System.in);
		String msg = "번째 정수 입력[q:나가기]";
		String temp = null;
		int idx = 0;
		int[] arData = new int[5];

		while(true) {
			System.out.println(++idx + msg);
			temp = sc.next();
			// toLowerCase()는 String 클래스에 선언된 메소드이다.
			// 대문자를 모두 소문자로 바꿔주는 기능을 한다.
			if(temp.toLowerCase().equals("q")) { 
				break;
			}
			try {
			arData[idx-1] = Integer.parseInt(temp);
			}catch(NumberFormatException e) {
				System.out.println("다시 생각해보고 입력해봐요[정수만 입력]");
				idx--;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("아 진짜 킹받네..5개만 입력하라니까요");
				for (int i = 0; i < arData.length; i++) {
					System.out.println(arData[i] + " ");				
				}
				break;
			}
		}		
	}
}
