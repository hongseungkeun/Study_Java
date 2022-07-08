package bank;

public class GiupBank extends Bank {
	public GiupBank() {
	}

	// 3번 은행 : 입금 시 수수료 50%
	void deposit(int balance) {
			this.money = money + (balance / 2); //입금하는 금액의 절반을 수수료로
		
	}
}
