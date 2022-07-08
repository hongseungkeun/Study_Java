package day05;

import java.util.Random;
import java.util.Scanner;

class Main {
	String result;
	String name;
	int age;
	String food;
	int feed;
	int hp;

	public Main(String name, int age, String food, int feed, int hp) {
		this.name = name;
		this.age = age;
		this.food = food;
		this.feed = feed;
		this.hp = hp;
	}

	public Main(int age, int feed, int hp) {
		this.age = age;
		this.feed = feed;
		this.hp = hp;
	}

	public void show() {
		System.out.println("고르신 동물 :" + this.name);
		System.out.println("현재 체력 :" + this.hp);
		System.out.println("남은 먹이의 수 :" + this.feed);

	}

	public void quiz() {	
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		String result = "";
		int random;
		String[] arData = { "원숭이의 음식은? :", "비행기를 최초로 발명한 사람은?(띄어쓰기없음) :", "3원색을 다 합치면? :", "녹말에 아이오딘 용액을 떨구면 나오는색은? :",
				"1+1은?(한글로) :", "바나나", "라이트형제", "검은색", "청남색", "이" };
		random = r.nextInt(5);
		System.out.println(arData[random]);
		result = sc.nextLine();
		if(random == 0) {
			if(result.equals(arData[random + 5])) {
				System.out.println("퀴즈정답!");
				this.feed += 2;
			}else {
				System.out.println("오답입니다. 답은 " + arData[random + 5] + " 입니다");
				this.hp -= 1;
			}
		}else if(random == 1){
			if(result.equals(arData[random + 5])) {
				System.out.println("퀴즈정답!");
				this.feed += 2;
			}else {
				System.out.println("오답입니다. 답은 " + arData[random + 5] + " 입니다");
				this.hp -= 1;
			}
		}else if(random == 2){
			if(result.equals(arData[random + 5])) {
				System.out.println("퀴즈정답!");
				this.feed += 2;
			}else {
				System.out.println("오답입니다. 답은 " + arData[random + 5] + " 입니다");
				this.hp -= 1;
			}
		}else if(random == 3){
			if(result.equals(arData[random + 5])) {
				System.out.println("퀴즈정답!");
				this.feed += 2;
			}else {
				System.out.println("오답입니다. 답은 " + arData[random + 5] + " 입니다");
				this.hp -= 1;
			}
		}else {
			if(result.equals(arData[random + 5])) {
				System.out.println("퀴즈정답!");
				this.feed += 2;
			}else {
				System.out.println("오답입니다. 답은 " + arData[random + 5] + " 입니다");
				this.hp -= 1;
			}
		}

	}

	public void eat() {
		if (this.feed == 0) {
			System.out.println("먹이가 존재하지 않습니다.");
		} else {
			this.feed -= 3;
			if (this.feed <= 0) {
				this.feed += 3;
				this.hp -= 2;
				System.out.println("먹이가 부족합니다");
			}
			this.hp += 2;
		}
		show();
	}

	public void rest() {
		System.out.print("휴식중");
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.print("~");
		}
		this.hp += 1;
		System.out.println();
		show();
	}

	public void walk() {
		if (hp <= 1) {
			System.out.println("체력이 없어 잠에 듭니다.");
			rest();
		}
		this.hp -= 1;
		System.out.println("산책하는동안 랜덤퀴즈를 맞춰주세요!!");
		quiz();
		this.feed += 2;
		show();
	}

}

public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("모여라 셀럽동물!!");
		System.out.println("[강아지] / [병아리] / [새]");
		System.out.println("키우고 싶은 동물을 입력해주세요 :");
		String name = sc.nextLine();

		if (name.equals("강아지")) {
			System.out.println("강아지를 선택하셨습니다");
			Main d = new Main("강아지", 1, "개껌", 10, 20);
			while (true) {
				System.out.println("1.먹기 2.잠자기 3.산책하기 4.작별인사하기");
				int choice = sc.nextInt();
				if (choice == 4) {
					break;
				} else if (choice == 1) {
					d.eat();
				} else if (choice == 2) {
					d.rest();
				} else if (choice == 3) {
					d.walk();
				} else {
					System.out.println("알맞은 번호를 입력하시오");
				}
			}
		} else if (name.equals("병아리")) {
			System.out.println("병아리를 선택하셨습니다");
			Main c = new Main("병아리", 1, "모이", 7, 5);
			while (true) {
				System.out.println("1.먹기 2.잠자기 3.산책하기 4.작별인사하기");
				int choice = sc.nextInt();
				if (choice == 4) {
					break;
				} else if (choice == 1) {
					c.eat();
				} else if (choice == 2) {
					c.rest();
				} else if (choice == 3) {
					c.walk();
				} else {
					System.out.println("알맞은 번호를 입력하시오");
				}
			}
		} else if (name.equals("새")) {
			System.out.println("새를 선택하셨습니다");
			Main b = new Main("새", 1, "잡곡", 15, 15);
			while (true) {
				System.out.println("1.먹기 2.잠자기 3.산책하기 4.작별인사하기");
				int choice = sc.nextInt();
				if (choice == 4) {
					break;
				} else if (choice == 1) {
					b.eat();
				} else if (choice == 2) {
					b.rest();
				} else if (choice == 3) {
					b.walk();
				} else {
					System.out.println("알맞은 번호를 입력하시오");
				}
			}
		}

	}
}