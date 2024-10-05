/*
*This method prints a rectangle
*/
public class Rectangle {
  //Data attributes
	private double sideL;
	private double sideW;
	
	public Rectangle(double l, double w)

//Constructors
  /*
* This constructor makes sideL equal to l and sideW equal to w
*/
	{
	sideL = l;
	sideW = w;
}
	
	//functionality
  /*
* The functionality of this is to return the length of the rectangle
*/
	public double getLength() 
	{
	return sideL;
	}
  /*
* This returns the width of the rectangle
*/
	public double getWidth()
	{
	return sideW;
	}
  /*
* This returns the area of the rectangle
*/
	public double getArea()
	{
		return sideL * sideW;
	}
	/*
* This returns the perimeter of the rectangle
*/
	public double getPer()
	{
		return sideL + sideW + sideL + sideW;
	}
	/*
* This returns the shape which is a Rectangle
*/
	public static String getShape()
	{
		return "Rectangle";		
						
				
	}
}
