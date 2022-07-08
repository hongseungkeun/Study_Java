package lambda;

public class LambdaTest {
	public static void main(String[] args) {
		
		LambdaInter lambda1 = (int number) -> number % 10 == 0;
		boolean check = lambda1.checkMultipleOf10(10);
		System.out.println(check);

		//10의 배수 검사를 출력하고 리턴한다.
		LambdaInter lambda2 = (int number) -> {System.out.println("10의배수 검사");return number % 10 == 0;};
		boolean check2 = lambda2.checkMultipleOf10(10);
		System.out.println(check2);
		
//		new LambdaInter() {
//			
//			@Override
//			public boolean checkMultipleOf10(int number) {
//				return number % 10 == 0;
//			}
//		}.checkMultipleOf10(10);
//			
	}
}
