package ex;

@FunctionalInterface //함수형 인터페이스
public interface OperCheck { // 전체 식을 전달받은 후 String[]로 리턴하는 getOper 추상 메소드 선언
	public String[] getOpers(String expresstion); // 전체 식을 받아올것이므로 String배열로 받아준다
}
