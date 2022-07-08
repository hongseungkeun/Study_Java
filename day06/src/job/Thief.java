package job;

import java.util.Random;

public class Thief {
	// 이름, 확률, 체력, 티어
	String rank;
	int probability;
	int hp;
	int caste;
	int tier;
	int money;
	int potion;

	public Thief(int money, int potion) {
		super();
		this.money = money;
		this.potion = potion;
	}

	public Thief(String rank, int probability, int hp, int tier, int caste, int money, int potion) {

		this.rank = rank;
		this.probability = probability;
		this.hp = hp;
		this.caste = caste;
		this.tier = tier;
		this.money = money;
		this.potion = potion;
	}

	boolean steal() {
		int[] arData = new int[100];
		Random r = new Random();

		for (int i = 0; i < probability / 10; i++) {
			arData[i] = 1;
		}
		if (arData[r.nextInt(100)] == 1) {
			money += 40000;
			tier++;
			rank();
			return true;
		}
		hp -= 1;
		return false;
	}

	void rank() {
		if (tier == 4) {
			caste++;
			tier = 1;
		}

	}

}
