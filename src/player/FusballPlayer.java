package player;

public class FusballPlayer extends Player {

	private int ranking;

	public FusballPlayer(String name, int jerseyNum) {
		super(name, jerseyNum);
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	@Override
	public Object getRevisedRanking() {
		if(this.ranking<10)
		{
			return 4*this.ranking;
		}
		else
		{
			return 5*this.ranking;
		}
	}
}
