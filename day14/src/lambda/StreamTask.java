package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StreamTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		ArrayList<Integer> datas = new ArrayList<>();
		//1~10까지 ArrayList에 담고 출력
//		IntStream.rangeClosed(1, 10).forEach(i->datas.add(i));
//		System.out.println(datas);
		
		//1~100까지 중 짝수만 ArryaList에 담고 출력
//		IntStream.rangeClosed(1, 100).forEach(i -> datas.add(i));
//		datas.stream().filter(i->i%2 == 0).forEach(System.out::println);
		
//		ArrayList<Character> datas = new ArrayList<>();		
		//A~F까지 ArrayList에 담고 출력
//		IntStream.range(0, 6).map(i -> i += 65).forEach(i -> datas.add((char)i));
//		System.out.println(datas);
		
		//A~F까지 중 D 제외하고 ArrayList에 담은 후 출력
//		IntStream.range(0, 6).map(i -> i += 65).filter(i -> i != 68).forEach(i -> datas.add((char)i));
//		System.out.println(datas);
		
		//5개의 정수를 입력받은 후 ArrayList에 담고 최대값과 최소값 출력(구글링)(sorted 또는 mapToint)
//		int[] data = new int[5];		
//		System.out.println("최대값과 최소값을 구할 정수 5개를 입력해주세요 : ");
//		ArrayList<Integer> datas = new ArrayList<>();
//		for (int i = 0; i < data.length; i++) {
//			data[i] = sc.nextInt();
//			datas.add(data[i]);
//		}
//		int min = datas.isEmpty() ? -1 : Collections.min(datas);
//		int max = datas.isEmpty() ? -1 : Collections.max(datas);;
	
		
//		int min = datas.stream().sorted().collect(Collectors.toList()).get(0);
//		int max = datas.stream().sorted().collect(Collectors.toList()).get(4);
//		System.out.println("최솟값 : " + min);
//		System.out.println("최댓값 : " + max);
		
//		System.out.println("최대값 :" + datas.get((4)));
//		System.out.println("최솟값 :" + datas.get((0)));
		//문자열을 5개 입력받고 모두 소문자로 변경(입력 : IntStream, map)
		String[] ar = new String[5];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.next();
//			IntStream.rangeClosed(0, ar[i]).map(String::toLowerCase).forEach(c -> System.out.println(c));
		}
		
		
		//Apple,banana,Melon 중 첫번째 문자가 대문자인 문자열 출력(Arrays.asList(), filter, collect)
		ArrayList<String> datas = new ArrayList<>(Arrays.asList("Apple", "banana", "Melon"));
	    datas.stream().filter(c -> c.charAt(0) >= 65 && c.charAt(0) <= 90).forEach(System.out::println);
		
		
		//한글을 정수로 변경(map)
		String[] data = {"1,2,3,4,5,6,7,8,9"};
		
		
	}
}
