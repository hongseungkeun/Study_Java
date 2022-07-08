package thread.threadtest2;

import java.util.Scanner;

public class ThreadTask implements Runnable{

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
}
	