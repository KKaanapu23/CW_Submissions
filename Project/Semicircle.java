/*
* This method prints out a Semi Circle
*/

public class SemiCircle {
	//data attributes
		private final double pi = 3.14;
		private double rad;

  //Constructors
  /*
  * This constructor declares rad as r
  */
			public SemiCircle(double r)
			{
			rad = r;
		    }
			//functionality
  /*
  * This returns the set radius of the semi circle
  */
			public double setRadius()
			{
				return rad;
			}
			 /*
  * This returns the radius of the semi circle
  */
			public double getRadius() 
			{
			
				return rad;
			}
			 /*
  * This returns the diameter of the semi circle
  */
			public double getDiameter()
			{
				return rad*2;
			}
			 /*
  * This returns the area of the semi circle
  */
			public double getArea()
			{
				return pi * rad * rad / 2;
			}
			 /*
  * THis returns the shape which is a Semi Circle
  */
			public static String getShape()
			{
				return "SemiCircle";
			}
	}

