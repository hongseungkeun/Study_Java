package day03;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
		// 두 정수를 입력받고 대소비교 하기
		// if문 사용
		
		Scanner sc = new Scanner(System.in);
		int num = 0, num1 = 0;	
		String nmsg = "첫번째 정수";
		String n1msg = "두번째 정수";
	
		System.out.println(nmsg);
		num = sc.nextInt();
		System.out.println(n1msg);
		num1 = sc.nextInt();
		
		if(num > num1) {
			System.out.println(num);
		}else if(num != num1){
			System.out.println(num1);
		}else {
			System.out.println("두 수가 같습니다");
		}
	
	}
}
