package bank;

public class GookminBank extends Bank {
	public GookminBank() {

	}

	// 2번 은행 : 출금 시 수수료 50%
	void withdrawal(int balance) {
		if (money < balance + (balance/2)) {
			return;
		} else {
			this.money = money - (balance + balance / 2); // 출금하는 금액의 반만큼을 수수료로 더 빼준다
		}
	}
}
