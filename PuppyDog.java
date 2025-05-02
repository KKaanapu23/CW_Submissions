
public class PuppyDog extends Dog{
	boolean isFed;
	
	public PuppyDog(int a, String n, boolean ad, boolean f)
	{
		super(a,n,ad);
		isFed = f;
	}
	
	public void stateAge()
	{
		System.out.print(name + " is "+ age + " months old.");
	}
	
	public void feedDog()
	{
		isFed = true;
	}
	
	public String toString()
	{
		if(isFed)
		{
			
			return super.toString() + "I'm fed!";
		}
		
		return super.toString() + "I must be fed.";
	}
	
	public boolean equals(PuppyDog lilDoggy)
	{
		if(super.equals(lilDoggy) && this.isFed == lilDoggy.isFed)
		{
			return true;
		}
		return false;
	}
}
