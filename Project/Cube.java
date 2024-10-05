/*
* This method prints out a cube
*/

public class Cube {
	private double sidel;
	//data attributes
	public Cube(double l)
//constructor
  /*
* This constructor declares sidel as l
*/
	{
    sidel = l;
}
	//functionality
  /*
* The functionality of this returns the side of the cube
*/
	public double getSide()
	{
		return sidel;
	}
	/*
*This returns the area of a cube
*/
	public double getArea()
	{
		return 6 * sidel * sidel;
	}
	/*
* this returns the perimeter of a cube
*/
	public double getPer()
	{
		return sidel * sidel * sidel * sidel * sidel * sidel * sidel * sidel * sidel * sidel * sidel * sidel;
	}
	/*
* THis returns the volume of a cube
*/
	public double getVol()
	{
		return sidel * sidel * sidel;
	}
  /*
* This returns the shape which is a cube
*/
	public static String getShape()
	{
		return "Cube";
    }
}


