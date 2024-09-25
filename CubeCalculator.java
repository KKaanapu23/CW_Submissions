/*
 * What this code will do is print the side length of a cube as well as the surface area and volume.
 */
public class CubeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This declares x as a double and 7
		double x = 7.0;
		//This code declares the surface area of a cube
		double surfArea = 6.0 * x * x;
		//This code declares the volume of a cube
		double volume = x * x * x;
		
		//This code will print the surface area of a cube as well as the side length
		System.out.print("The surface area of a cube with a side length of ");
		System.out.print((int) x);
		System.out.print(" is ");
		System.out.print((int)surfArea);
		//This spaces everything out
		System.out.println();
		System.out.println();
		//This prints the volume of a cube as well as the side length
		System.out.print("The volume of a cube with a side length of ");
		System.out.print((int) x);
		System.out.print(" is ");
		System.out.print((int) volume);
		
		
		

	}

}
