package marker;


public class Lab {
	// 동물을 받아와서 초식동물인지 육식동물인지 그리고 잡식동물인지 구분하는 메소드
	// instanceof 를 사용한다.
	// Animal클래스는 모든 동물의 부모 클래스이므로, up casting할 수 있다.
	public void checkKind(Animal[] animal) {
		// 외부에서 Animal 타입의 배열을 전달받고
		// 각 동물을 가져와야 하기 때문에 반복문을 사용한다.
		for (int i = 0; i < animal.length; i++) {
			// 각 동물을 인덱스번호로 가져와서 초식동물타입인지 instanceof로 비교한다.
			if(animal[i] instanceof Herbivore)	{
				System.out.println("초식동물입니다.");
			}else if(animal[i] instanceof Carnivore) {
				// 각 동물을 인덱스번호로 가져와서 육식동물타입인지 instanceof로 비교한다.
				System.out.println("육식동물입니다.");
			}else {
				// 만약 인덱스로 가져온 동물이 육식, 초식동물들이 아니면 잡식동물로 판단한다.
				System.out.println("잡식동물입니다.");
			}
		}
		
	}
	
	public static void main(String[] args) {		
		Animal[] animal = {new Dog(), new Tiger(), new Bear(), new Cow()};
		Lab l = new Lab();
		l.checkKind(animal);
		// new Lab().checkKind(animals);
	}
}
