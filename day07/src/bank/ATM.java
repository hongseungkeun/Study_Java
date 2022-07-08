package bank;

import java.util.Random;
import java.util.Scanner;

//3개의 은행 클래스(자식) 선언
//- 1번 은행 : 잔액 조회 시 재산 반토막
//- 2번 은행 : 출금 시 수수료 50%
//- 3번 은행 : 입금 시 수수료 50%

//모든 은행을 관리할 부모 클래스 선언
//- 모든 은행의 고객을 관리하는 저장소(DB) 선언(은행은 3개 각 은행별 최대 고객 수는 100명)
//- 예금주, 계좌번호, 핸드폰번호, 비밀번호, 잔액
//- 계좌번호 중복검사
//- 핸드폰 중복검사
//- 로그인(계좌번호와 비밀번호)
//- 입금
//- 출금(잔액검사)
//- 잔액조회

public class ATM {
	public static void main(String[] args) {
		// 은행 선택
		// 1. 1번 은행
		// 2. 2번 은행
		// 3. 3번 은행
		// 4. 4번 나가기
		String msg = "1.우리은행\n2.국민은행\n3.기업은행\n4.나가기";
		String mainmenu = "1.계좌 개설\n2.입금하기\n3.출금하기\n4.잔액조회\n5.계좌번호 찾기\n6.계좌내역\n7.나가기";
		String[] bankName = { "우리은행", "국민은행", "기업은행" }; // 은행 3개를 배열에 담아주기

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		Bank[] arData = { new WooriBank(), new GookminBank(), new GiupBank() };
		int account = 0; // 계좌
		int choice = 0, menuchoice = 0, balance = 0; // 은행선택,메뉴선택,잔액
		String phone = "", name = "", pw = "";

		// 검사한 객체를 담을 저장공간
		Bank user = null;

		while (true) {
			System.out.println(msg);
			choice = sc.nextInt();

			if (choice == 4) { // 나가기
				break;
			} else if (choice == 1) {
				System.out.println("안녕하세요! " + bankName[choice - 1] + " 입니다~");
				while (true) {
					System.out.println("무엇을 도와드릴까요?");
					System.out.println(mainmenu); // 메인 메뉴
					menuchoice = sc.nextInt();
					if (menuchoice == 7) { // 7. 나가기(은행 다시 선택)
						break;
					}
					switch (menuchoice) { // 1. 계좌 개설
					case 1:
						System.out.println("본인의 이름을 입력해주세요 : "); // **이름 입력이 안됨
						arData[choice - 1].name = sc.next();
						while (true) {
							account = r.nextInt(999999) + 100000; // - 6자리 랜덤 계좌번호 **이렇게하면 맨앞숫자가 1부터시작으로 고정..
							if (Bank.checkaccount(account) == null) { // - 기존 고객의 계좌번호와 중복이 없는 번호로 개설해야 한다.
								break;
							}
//							for (int i = 0; i < arData.length; i++) { 
//								arData[i] = r.nextInt(10);
//								account += arData[i]
//							}
						}
						arData[choice - 1].account = account; // choice-1을 해서 선택한 은행의 배열번호와 맞춰준다
						// - 핸드폰 번호는 숫자만 입력하도록 하고, 문자가 포함되면 안되며, 0~9사이의 정수여야 한다.
						while (true) {
							System.out.println("-를 제외한 핸드폰 번호를 입력해주세요 : ");
							phone = sc.next();
							int i = 0;
							for (i = 0; i < phone.length(); i++) {
								if (phone.charAt(i) < 48 || phone.charAt(i) > 57) { // 48부터 57사이의 숫자가 아니면 다시 입력받을수 있게
																					// 문자를 포함하지 않기위해
									break;
								}
							}
							if (i == phone.length()) {
								break;
							}
						}
						arData[choice - 1].phone = phone;
						while (true) { // - 비밀번호는 4자리로만 입력하도록 한다
							System.out.println("비밀번호 4자리를 입력해주세요 : ");
							pw = sc.next();
							if (pw.length() == 4) {
								break;
							}
						}
						arData[choice - 1].pw = pw;
						// **배열에 저장이 없는듯하다
						System.out.println("계좌가 개설되었습니다\n계좌번호를 확인해주세요!");
						System.out.println("내 계좌번호 : " + account);
						Bank.arData[choice - 1]++; // 은행의 인원수++
						break;
					case 2: // **
						// 2. 입금하기
						// - 로그인(계좌번호, 비밀번호)
						System.out.println("계좌번호를 입력해주세요 : ");
						account = sc.nextInt();
						System.out.println("비밀번호를 입력해주세요 : ");
						pw = sc.next();

						user = Bank.login(account, pw); // **오류
						// - 계좌를 개설한 은행에서만 입금 가능 **hard..
						if (user != null) {
							System.out.println("로그인 되었습니다");
							System.out.println("입금할 액수를 입력해주세요 :");
							balance = sc.nextInt();
							user.deposit(balance);
							System.out.println(balance + "원이 성공적으로 입금되었습니다");
							System.out.println("잔액 : " + user.money);
						} else {
							System.out.println("다시 로그인 해주세요");
						}
					case 3:
						// 3. 출금하기
						// - 로그인(계좌번호, 비밀번호)
						System.out.println("계좌번호를 입력해주세요 : ");
						account = sc.nextInt();
						System.out.println("비밀번호를 입력해주세요 : ");
						pw = sc.next();

						user = Bank.login(account, pw);
						if (user != null) {
							System.out.println("로그인 되었습니다");
							System.out.println("출금할 액수를 입력해주세요 :");
							balance = sc.nextInt();
							user.withdrawal(balance);
							System.out.println(balance + "원이 성공적으로 출금되었습니다");
							System.out.println("잔액 : " + user.money);
						} else {
							System.out.println("다시 로그인 해주세요");
						}
					case 4:
						// 4. 잔액조회
						// - 로그인(계좌번호, 비밀번호)
						System.out.println("계좌번호를 입력해주세요 : ");
						account = sc.nextInt();
						System.out.println("비밀번호를 입력해주세요 : ");
						pw = sc.next();

						user = Bank.login(account, pw);
						user.view();
						System.out.println("잔액은 : " + user.money + "원 입니다");
					case 5:
						// 5. 계좌번호 찾기
						// - 휴대폰 번호, 비밀번호 입력
						System.out.println("휴대폰 번호를 입력해주세요 : ");
						phone = sc.next();
						System.out.println("비밀번호를 입력해주세요 : ");
						pw = sc.next();
						// - 새로운 계좌번호 부여
						while (true) {
							account = r.nextInt(999999) + 100000;
							if (Bank.checkaccount(account) == null) {
								break;
							}
						}
						user.account = account;
						System.out.println(user.name + "님의 새 계좌번호입니다 : " + account);
					case 6: // **보류
						// 6. 계좌내역(거래내역) - 연결 (+=)
						// - 계좌번호, 예금주, 입금인지 출금출금인지, 입금액 또는 출금액, 현재 잔액 출력
						// - 만약 계좌번호 변경 시 이전 거래 내역에서 계좌번호를 신규 계좌번호로 수정(split())

					}
				}
			} else if (choice == 2) { // **위를 완성하고 동일하게
				System.out.println(mainmenu);
				menuchoice = sc.nextInt();
			} else if (choice == 3) { // **위를 완성하고 동일하게
				System.out.println(mainmenu);
				menuchoice = sc.nextInt();
			} else {
				System.out.println("다시 입력해주세요");
			}
		}
	}
}
