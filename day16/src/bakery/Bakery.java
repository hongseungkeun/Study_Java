package bakery;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Bakery {
	public static void main(String[] args) {
		BreadMaker maker = new BreadMaker();
		BreadPlate plate = BreadPlate.getInstance();
		Thread makerThread = new Thread(maker);

		String[] btns = { "빵 먹기", "나가기" };

		ImageIcon icon = new ImageIcon("src/img/bread.gif"); // 이미지를 불러오는 클래스

		makerThread.start();

		int choice = 0;
		while (true) {
			choice = JOptionPane.showOptionDialog(null, "", "빵집", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
					icon, btns, null);

			if (choice == 0) {
				plate.eatBread();
			} else {
				// 빵 만들기 쓰레드 종료하기(변수로 해결)
//            maker.setExit(true);
//            makerThread.interrupt();
				//진행중인 쓰레드 모두를 무조건 종료시킬수있는 메소드
				System.exit(0);
				break;
			}
		}
	}
}