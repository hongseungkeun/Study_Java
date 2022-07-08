package vo;

import dao.WholeDAO;

public class FemaleVo extends WholeDAO{
	private String name;
	private int ranking;
	private int names;
	
	public FemaleVo() {;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public int getNames() {
		return names;
	}

	public void setNames(int names) {
		this.names = names;
	}
	
	@Override
	public String toString() {
		String str = "F" + "\t" +  name + "\t" + ranking 
				+ "\t" + names; 
		return str;
	}
	
	
	
	
	
}
