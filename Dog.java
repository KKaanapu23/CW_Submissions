
public class Dog {
	boolean isAdopted;
	int age;
	String name;
	
	public Dog(int a, String name, boolean ad)
	{
		age = a;
		this.name = name;
		isAdopted = ad;
	}
	
	public boolean getAdoptionStatus()
	{
		return isAdopted;
	}
	
	public void stateAge()
	{
		System.out.print(name + " is " + age + " years old");
	}
	
	public void increaseAge()
	{
		age++;
	}
	
	public String toString()
	{
		stateAge();
		if(isAdopted)
		{
			System.out.println();
			return "He's adopted, good boy";
		}
		return "I haven't found a home yet :(";
	}
	
	public boolean equals(Dog doggy)
	{
		if(this.age == doggy.age && this.name == doggy.name && this.isAdopted == doggy.isAdopted)
		{
			return true;
		}
		return false;
	}

}
