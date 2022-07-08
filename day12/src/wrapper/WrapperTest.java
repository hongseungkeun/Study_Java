package wrapper;

public class WrapperTest {
	public static void main(String[] args) {
		int data_i = 10;
		//boxing
//		Integer data_I = new Integer(data_i);
		//4버전부터는 auto를 지원하기 때문에 쓰지 않는걸 권장
		
		//auto boxing
		Integer data_I = data_i;
		
		//unboxing
//		data_i = data_I.intValue();
		
		//auto unboxing
		data_i = data_I;
		
		
	}
}
