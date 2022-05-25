package player;

public class Player {
	
	private String name;
	private int jerseyNum;
	public Player(String name, int jerseyNum) {
		this.name = name;
		this.jerseyNum = jerseyNum;
	}
	public String getName() {
		return name;
	}
	public int getJerseyNum() {
		return jerseyNum;
	}
	
	public Object getRevisedRanking()
	{
		return 0;
	}
}

