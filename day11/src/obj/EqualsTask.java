package obj;

public class EqualsTask {
	public static void main(String[] args) {
		Student std = new Student(1, "홍승근");
		// 학생의 번호가 같다면 true가 나올 수 있도록 equals()를 재정의 하기
		System.out.println(std.equals(new Student(1, "홍승근")));
		System.out.println(std.equals(new Student(1, "홍재근")));
		System.out.println(std.equals(new Student(2, "홍승근")));
		System.out.println(std.equals(new Student(1, "홍승근")));
	}
}
