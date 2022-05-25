package supermarket;

public class Trolley {
	
	private final int _ID;
	
	
	public Trolley()
	{
		_ID=(int)(Math.random()*(100-1)+1);
	}
	
	public int getTrolleyID()
	{
		return _ID;
	}
}
