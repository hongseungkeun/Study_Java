package nikey;

import anonymous.Form;

public class Nikey { // 본사
	public String clothing;

	public void register(Form form) {
		String[] menus = form.getMenu();
		System.out.println("=======" + clothing + "" + "=======");
		for (int i = 0; i < menus.length; i++) {
			System.out.println(i + 1 + "." + menus[i]);
		}

		form.sell("추리닝");

	}
}
