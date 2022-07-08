package myApi;

import api.Calc;

public class ApiTest {
	public static void main(String[] args) {
		Calc c = new Calc();
		MyMath math = new MyMath();
		c.div(10, 3);
		math.mul(10, 3);
	}
}
