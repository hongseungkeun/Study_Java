package anonymous;

//Nike[] nikes = new Nike[3];
//String[] names = {"잠실점", "강남점", "신촌점"};
//Form[] forms = {new Form() {
//   
//   @Override
//   public void sell(String order) {
//	   String[] menus = getMenu();
//		for (int i = 0; i < menus.length; i++) {
//			if (menus[i].equals(order)) {
//				System.out.println(order + "주문 완료");
//			}
//		}
//      
//   }
//   
//   @Override
//   public String[] getMenu() {
//	   String[] menus = { "티셔츠", "신발", "바지", "가방" };
//		return menus;
//	}
//}, new FormAdapter() {
//   
//   @Override
//   public String[] getMenu() {
//      // TODO Auto-generated method stub
//      return null;
//   }
//}};


public class DepartmentStore {
	public static void main(String[] args) {
		

		Nike jamsil = new Nike();
		Nike gangnam = new Nike();
		jamsil.branchName = "잠실점";
		gangnam.branchName = "강남점";
		jamsil.register(new Form() {

			@Override
			public void sell(String order) {
				String[] menus = getMenu();
				for (int i = 0; i < menus.length; i++) {
					if (menus[i].equals(order)) {
						System.out.println(order + "주문 완료");
					}
				}
			}

			@Override
			public String[] getMenu() {
				String[] menus = { "티셔츠", "신발", "바지", "가방" };
				return menus;
			}
		});

		gangnam.register(new FormAdapter() {
			@Override
			public String[] getMenu() {
				String[] menus = { "티셔츠", "신발", "바지", "가방" };
				return menus;
			}
		} );	
	}
}
