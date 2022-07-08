package casting;

import java.util.Scanner;

//내가 한것
//넷플릭스
//애니메이션, 영화, 드라마 클래스를 선언한다.
//사용자가 선택한 영상이 애니메이션이라면 "자막지원"기능을 사용하고
//영화라면 "4D"기능을 사용하고
//드라마라면 "굿즈"기능을 사용한다.
class Netflix {
	void start() {
		System.out.println("영상 실행");
	}
}

class Animation extends Netflix {
	void start() {
		super.start();
		System.out.println("자막 지원");
	}
}

class Movie extends Netflix {
	void start() {
		super.start();
		System.out.println("4D");
	}
}

class Drama extends Netflix {
	void start() {
		super.start();
		System.out.println("굿즈");
	}
}

public class CastingTask {
//위 기능을 구현한 메소드 선언
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int click = 0;
		Netflix movie = new Netflix();
		Netflix option = new Animation();
		Netflix option1 = new Movie();
		Netflix option2 = new Drama();
		Animation op = (Animation) option;
		Movie op1 = (Movie) option1;
		Drama op2 = (Drama) option2;

		System.out.println("1.애니메이션\n2.영화\n3드라마");
		click = Integer.parseInt(sc.nextLine());

		if (click == 1) {
			op.start();
		} else if (click == 2) {
			op1.start();
		} else if (click == 3) {
			op2.start();

		}
	}
}
