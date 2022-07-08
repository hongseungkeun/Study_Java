package job;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Thief[] thiefs = new Thief[3];
		thiefs[0] = new Thief("Normal", 200, 10, 1, 0, 100000, 0);
		thiefs[1] = new Thief("Hard", 100, 10, 1, 0, 40000, 0);
		thiefs[2] = new Thief("God", 10, 5, 1, 0, 20000, 0);

		Scanner sc = new Scanner(System.in);

		String title = "★★★★★★THE THIEFS (체험판)★★★★★★";
		String menuMsg = "시작하실 난이도를 선택해주세요\n1.Normal\n2.Hard\n3.God\n4.Exit";
		String actionMsg = "1.훔치기\n2.상점\n3.정보보기\n4.메인메뉴로";
		int choice = 0;
		int charNum = 0;
		int actionChoice = 0;

		while (true) { // 메뉴에서 4번을 고르면 나가기
			System.out.println(title);
			System.out.println(menuMsg);
			charNum = sc.nextInt();
			if (charNum == 4) {
				break;
			}

			while (true) {
				System.out.println(actionMsg);
				actionChoice = sc.nextInt();
				if (actionChoice == 4) { // 4를 누르면 
					break;
				}

				Thief thief = thiefs[charNum - 1];

				switch (actionChoice) {
				case 1:// 훔치기
					System.out.print("훔치는중.");
		               for (int i = 0; i < 3; i++) {
		                  System.out.print(".");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							;
						}
					}
		            if(thief.steal() == true) {
		            	System.out.println("도둑질에 성공하셨습니다");
		            }else {
		            	System.out.println("도둑질에 실패하셨습니다");
		            }
                    System.out.println("체력 :" + thief.hp);
                    System.out.println("티어 :" + thief.tier);
                    System.out.println("계급 :" + thief.caste);
                    System.out.println("돈 :" + thief.money);
					break;
				case 2: // 상점
					System.out.println("상점에 오신걸 환영합니다");
					while(true){
						System.out.println("물건을 골라주세요\n1.포션 : 1만원\n2.확률업그레이드 : 4만원\n3.뒤로가기");
						choice = sc.nextInt();
						if(choice == 3) {
							break;
						}else if(choice == 1) {
							if(thief.money < 10000) {
								System.out.println("돈이 부족합니다");
								System.out.println("돈을 확인해주세요\n현재 돈 :" + thief.money);
								break;
							}
							thief.potion++;
							thief.money -= 10000;
							System.out.println("돈 :" + thief.money);
							System.out.println("확률 :" + thief.probability);
							System.out.println("포션의 개수 :" + thief.potion);
						}else if(choice == 2) {
							if(thief.money < 30000) {
								System.out.println("돈이 부족합니다");
								System.out.println("돈을 확인해주세요\n현재 돈 :" + thief.money);
								break;
							}
							thief.probability += 50;
							thief.money -= 30000;
							System.out.println("돈 :" + thief.money);
							System.out.println("확률 :" + thief.probability);
							System.out.println("포션의 개수 :" + thief.potion);

						}
					}
					
				case 3: // 정보보기
					System.out.println("체력 :" + thief.hp);
					System.out.println("돈 :" + thief.money);
					System.out.println("티어 :" + thief.tier);
					System.out.println("계급 :" + thief.caste);
					System.out.println("확률 :" + thief.probability);
					System.out.println("포션의 개수 :" + thief.potion);
					break;
				}
				if(thief.hp == 0) {
					System.out.println("Game Over");
					break;
				}
			}
			
		}
	}
}
