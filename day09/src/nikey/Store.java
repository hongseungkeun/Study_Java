package nikey;

import anonymous.Form;

public class Store {
	public static void main(String[] args) {
		Nikey[] stores = { new Jamsil(), new Hongdae(), new Gangnam() };
		stores[0].clothing = "잠실점";
		stores[1].clothing = "홍대점";
		stores[2].clothing = "강남점";

//		for (int i = 0; i < stores.length; i++) { //** 하나로 묶어서 하고싶었는데 안된다...
//			stores[i].register(new Form() {
//
//				@Override
//				public void sell(String order) {
//					String[] menus = getMenu();
//
//					if (stores[i] instanceof Free) {
//						System.out.println("무료나눔 직영점");
//					} else {
//						for (int j = 0; j < menus.length; j++) {
//							if (menus[j].equals(order)) {
//								System.out.println(order + "주문 완료");
//							}
//
//						}
//					}
//
//				}
//
//				@Override
//				public String[] getMenu() {
//					String[] menus = { "추리닝", "신발", "옷" };
//					return menus;
//				}
//			});
//		}
//	}
//}

		stores[0].register(new Form() {

			@Override
			public void sell(String order) {
				String[] menus = getMenu();

				if (stores[0] instanceof Free) {
					System.out.println("무료나눔 직영점");
				} else {
					for (int i = 0; i < menus.length; i++) {
						if (menus[i].equals(order)) {
							System.out.println(order + "주문 완료");
						}

					}
				}

			}

			@Override
			public String[] getMenu() {
				String[] menus = { "추리닝", "신발", "옷" };
				return menus;
			}
		});

		stores[1].register(new Form() {

			@Override
			public void sell(String order) {
				String[] menus = getMenu();

				if (stores[1] instanceof Free) {
					System.out.println("무료나눔 직영점");
				} else {
					for (int i = 0; i < menus.length; i++) {
						if (menus[i].equals(order)) {
							System.out.println(order + "주문 완료");
						}

					}
				}

			}

			@Override
			public String[] getMenu() {
				String[] menus = { "추리닝", "신발", "옷" };
				return menus;
			}
		});

		stores[2].register(new Form() {

			@Override
			public void sell(String order) {
				String[] menus = getMenu();

				if (stores[2] instanceof Free) {
					System.out.println("무료나눔 직영점");

				} else {
					for (int i = 0; i < menus.length; i++) {
						if (menus[i].equals(order)) {
							System.out.println(order + "주문 완료");
						}

					}
				}

			}

			@Override
			public String[] getMenu() {
				String[] menus = { "추리닝", "신발", "옷" };
				return menus;
			}
		});

	}
}
