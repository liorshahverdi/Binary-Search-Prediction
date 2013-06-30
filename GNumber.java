package g1;

public class GNumber {
	
	private int minLimit;
	private int maxLimit;
	
	public GNumber()
	{
		minLimit = 1;
		maxLimit = 101;
	}

	public int getMin()
	{
		return minLimit;
	}
	
	public int getMax()
	{
		return maxLimit;
	}
	
	public void	setMinLimit(int limit)
	{
		minLimit = limit;
	}
	
	public void setMaxLimit(int limit)
	{
		maxLimit = limit;
	}
	
	
}
