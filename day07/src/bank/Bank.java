package bank;

import java.util.Random;
import bank.Bank;

//모든 은행을 관리할 부모 클래스 선언

public class Bank { // - 모든 은행의 고객을 관리하는 저장소(DB) 선언(은행은 3개 각 은행별 최대 고객 수는 100명)
	static Bank[][] arrData = new Bank[3][100]; // 3행100열 2차원 배열
	static int[] arData = new int[arrData.length]; // 열의 길이만큼 배열, 고객수만큼
	// - 예금주, 계좌번호, 핸드폰번호, 비밀번호, 잔액
	String name; // 예금주
	int account; // 계좌 번호
	String phone; // 핸드폰 번호
	String pw; // 비밀번호
	int money; // 계좌 잔액

	// 계좌 개설

	public Bank() {

	}

	// - 계좌번호 중복검사 **
	static Bank checkaccount(int account) {

		Bank dupaccount = null;

		for (int i = 0; i < arrData.length; i++) {

			for (int j = 0; j < arData[i]; j++) {
				if (arrData[i][j].account == account) { // 배열만큼 반복

					dupaccount = arrData[i][j];

					break;
				}
			}
		}
		return dupaccount;
	}

	// - 핸드폰 중복검사
	static Bank phonecheck(String phone) {
		Bank check = null;

		for (int i = 0; i < arrData.length; i++) {
			for (int j = 0; j < arData[i]; j++) { // 배열만큼 반복
				if (arrData[i][j].phone == phone) {
					check = arrData[i][j];
					break;
				}
			}
		}
		return check;
	}

	// - 로그인(계좌번호와 비밀번호)
	static Bank login(int account, String pw) {
		Bank dupaccount = checkaccount(account); // 입력한 계좌가 있는지 확인
		if (dupaccount != null) { // null이 아니면 있는 계좌
			if (!dupaccount.pw.equals(pw)) { // 같지 않으면 틀린 패스워드
				dupaccount = null;
			}
		}
		return dupaccount;
	}

	// - 입금
	void deposit(int balance) {
		money += balance; // 입력한 잔액을 계좌에 넣음
	}

	// - 출금(잔액검사)
	void withdrawal(int balance) {
		if (money < balance) {
			return;
		} else {
			money = money - balance;
		}
	}

	// - 잔액조회
	void view() {

	}
}
