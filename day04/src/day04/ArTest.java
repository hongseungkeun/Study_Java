package day04;

public class ArTest {
	public static void main(String[] args) {
		// 5 4 3 2 1 넣고 출력
		int[] arData = {3,5,1,9,7};
		
		for (int i = 0; i < arData.length; i++) {
			arData[i] = 5 - i;
		}
		for (int i = 0; i < arData.length; i++) {
			System.out.print(arData[i]);			
		}
			
//		예제		
//		System.out.println(arData);
		// [I@7d6f77cc 앞에 I : int이기 때문, double이면 맨앞에 D가 나옴
//		System.out.println(arData.length);
		
//		System.out.println(arData[0]);
//		System.out.println(arData[1]);
//		System.out.println(arData[2]);
//		System.out.println(arData[3]);
//		System.out.println(arData[4]);
		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);		
//		}

		
		
		
	}
}
