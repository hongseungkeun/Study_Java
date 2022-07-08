package thread.threadtest2;

import java.util.Scanner;

public class ThreadTask extends Thread{

	public static int cnt;

	public ThreadTask() {
		;
	}

	public void printFirst(Runnable first) {
		first.run(); // 수정 금지
	}

	public void printsecond(Runnable second) {
		second.run(); // 수정 금지
	}

	public void printthird(Runnable third) {
		third.run(); // 수정 금지
	}

	public void run() {
		// 이 자원에 어떤 쓰레드가 들어왔는지에 따라서 알맞는 걸 출력해야한다.
		String name = Thread.currentThread().getName(); // 쓰레드만의 이름을 입력한걸로 받아야 한다.
		switch (name) { // name이 뭔지에 따라서 구현해야 할 run메소드가 다르기 때문에 switch문을 사용하여 구별한다.
		case "1":
			printFirst(() -> System.out.println(++cnt + "번 쓰레드 : first"));
			break;
		case "2":
			printsecond(() -> System.out.println(++cnt + "번 쓰레드 : second"));
			break;
		case "3":
			printthird(() -> System.out.println(++cnt + "번 쓰레드 : third"));
			break;

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arInput = new int[3]; // 입력 받을 숫자를 배열에 담는다

		Thread[] arThread = new Thread[3]; // 세개의 쓰레드를 배열에 담는다
		ThreadTask tt = new ThreadTask(); // 하나의 자원(ThreadTask)을 사용한다.

		for (int i = 0; i < arThread.length; i++) {
			arThread[i] = new Thread(tt); // 자원을 각각 할당한다.
		}

		System.out.print("입력 : ");
		for (int i = 0; i < arInput.length; i++) { // 사용자가 입력한 숫자 3개를 3번 반복 둘린다.
			arInput[i] = sc.nextInt();
			arThread[i].setName(arInput[i] + ""); // 하나 담고 이름 하나 출력, 하나 담고 이름 하나 출력
		}

		for (int i = 0; i < arThread.length; i++) { // 입력에 맞춰서 스타트
			arThread[i].start();
			try {
				arThread[i].join();
			} catch (InterruptedException e) {
				;
			} // join메소드를 사용하여
				// 하나의 쓰레드가 끝날때까지 대기 시킨 후 다음 쓰레드를 실행 시킨다.
		}
	
	}
}