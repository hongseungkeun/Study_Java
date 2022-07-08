package ex;

@FunctionalInterface // 함수형 인터페이스
public interface MyMath {
	// 두 정수를 전달받은 후 int로 리턴하는 calc 추상메소드 선언
	public int calc(int num1, int num2);
}
