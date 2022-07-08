package bank;

public class WooriBank extends Bank {
	public WooriBank() {

	}
	// 1번 은행 : 잔액 조회 시 재산 반토막
	void view() {
		this.money = money/2; 

	}
}
