package day04;

public class MainTest {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("None");
		}else {
			for (int i = 0; i < args.length; i++) {
				System.err.println(args[i]);
			}
		}
	}
}
