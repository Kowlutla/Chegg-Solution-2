package player;

public class FootballPlayer extends Player {

	private int ranking;

	public FootballPlayer(String name, int jerseyNum) {
		super(name, jerseyNum);
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	@Override
	public Object getRevisedRanking() {
		if(this.ranking<10)
		{
			return 2*this.ranking;
		}
		else
		{
			return 3*this.ranking;
		}
	}
}
