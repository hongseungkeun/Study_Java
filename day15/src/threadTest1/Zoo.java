package threadTest1;

public class Zoo {
	public static void main(String[] args) {
		Runnable dog = new Animal();
		Runnable tiger = new Animal();
		Runnable duck = new Animal();
		
		Thread[] animals = new Thread[3];
		Thread dogs = new Thread(dog, "멍멍");
		Thread tigers = new Thread(tiger, "어흥");
		Thread ducks = new Thread(duck, "꽥꽥");
		
		dogs.start();
		ducks.start();
		try {
			dogs.join();
			ducks.join();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		tigers.start();
	}
}
