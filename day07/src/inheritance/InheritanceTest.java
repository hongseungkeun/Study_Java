package inheritance;

class A{
	String nameA = "A";
	int data = 10;
	
	public A() {
		System.out.println("부모 생성자 호출");
	}
	
	
}
class B extends A{
	String nameB = "B"; //부모에 있는 변수와 같은 이름을 쓰면 부모에 있는 변수는 사용 불가능
	
	public B() {
		super();
		System.out.println("자식 생성자 호출");
	}
	
	void printData() {
		System.out.println(data);
	}
}


public class InheritanceTest {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.nameA);
		b.printData();
	}
}
