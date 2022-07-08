package day05;

class A {
	int data = 100;

	void printData() {
		System.out.println(data);
	}
}

public class ClassTest { // 메인클래스 (main메소드는 여기에만)
	public static void main(String[] args) {
		A a = new A();
		// System.out.println(a); //주소가 나오는걸 확인
		a.data = 200;
		a.printData();
	}
}
