/*
* This method prints a sphere
*/

public class Sphere {

  //Data Attributes
	private final double pi = 3.14;
	private double radius;

  //Constructor
  /*
  *This constructor makes radius equal to r
  */
		public Sphere(double r)
  {
		radius = r;
	    }
  /*
*This returns the radius of the sphere
*/
		public double getRadius() 
		{
		
			return radius;
		}
		/*
* This returns the diameter of the sphere
*/
		public double getDiameter()
		{
			return radius*2;
		}
		/*
* This returns the circumference of the sphere
*/
		public double getCircum()
		{
			return 2 * pi * radius;
		}
		/*
* This returns the area of the sphere
*/
		public double getArea()
		{
			return 4 * pi * radius * radius;
		}
		/*
*This returns the volume of the sphere
*/
		public double getVolume()
		{
			return 4/3 * pi * radius * radius * radius;
		}
		/*
* This returns the shape being a sphere
*/
		
		public static String getShape()
		{
			return "Sphere";
		}
}
		
		



