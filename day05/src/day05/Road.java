package day05;

class Car {
	// 전역 변수 : 전체영역에서 사용가능한 변수
	// 인스턴스 변수
	String brand;
	String color;
	int price;
	boolean check;
	
	public Car(/* 매개변수 */String brand, String color, int price){
		this.brand = brand;	// 전역 변수 = 매개 변수
		this.color = color;
		this.price = price;
		// this : 필드에 접근한 객체가 누구인지 알아야 하기 때문에 써줌
	}
	public Car(int price){
		this.price = price;
	}
	
	// 오버로딩 단축키 Alt + Shift S -> O
	public Car(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	
	void engineStart() {
		// 지역변수 
		// int data = 10;
		System.out.println(this);
		System.out.println(this.brand + "시동 켜기");
	}
	
	void engineStop() {
		System.out.println(brand + "시동 끄기"); // 여기에선 this 생략가능
	}
	
}

public class Road {
	public static void main(String[] args) {
		Car momCar = new Car("Benz", "Black", 10_000); 
		Car dadyCar = new Car("BMW", "Blue", 8_000);
		Car myCar = new Car(600);
//		Car myCar = new Car(); 기본생성자가 없어져서 오류가남
		
		momCar.engineStart();
		dadyCar.engineStart();
		
//		System.out.println(momCar);
//		System.out.println(dadyCar);
//		System.out.println(myCar);
		
		
		
		
		
		
		
	
		
	}
}
