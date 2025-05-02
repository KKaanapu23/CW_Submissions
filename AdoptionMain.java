
public class Adoption_Main {

	public static void main(String[] args) {
		Dog LeBron = new Dog(2,"Lebron", true);
		PuppyDog James = new PuppyDog(3, "James", true, true);
		Dog Bob = new Dog(2,"Lebron", true);
		PuppyDog Zack = new PuppyDog(3, "James", true, true);
		
		
		
		System.out.println(LeBron.getAdoptionStatus());
		System.out.println(James.getAdoptionStatus());
		LeBron.stateAge();
		System.out.println();
		James.stateAge();
		LeBron.increaseAge();
		James.increaseAge();
		System.out.println();
		LeBron.stateAge();
		System.out.println();
		James.stateAge();
		System.out.println();
		System.out.println(LeBron.toString());
		System.out.println(James.toString());
		
		System.out.println();
		System.out.println();
		
		System.out.println(LeBron.equals(Bob));

	}

}
