package inheritance;

class Human {

	void eat() {
		System.out.println("먹기");
	}

	void sleep() {
		System.out.println("자기");
	}

	void walk() {
		System.out.println("두 발로 걷기");
	}

}

class Monkey extends Human{
	void eatLouse() {
		System.out.println("냠냠");		
	}
	
	@Override // @ 용어 :어노데이션
	void walk() {
		System.out.print("네 발 또는 ");
		super.walk();
	}
}

public class inheritanceTest2 {
	public static void main(String[] args) {
		Monkey kingkong = new Monkey();
		kingkong.walk();
	}
}
