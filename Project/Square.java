/*
* This method prints a square
*/
public class Square {
	//Data Attributes
	private double side;
	
		public Square(double x)
	//Constructor
  /**
  *This constructor assigns side to equal the variable x
  */
	
		{
		side = x;
	}
		//functionality
  /**
  *Returns the side of the square
  */
		public double getSide() 
		{
		return side;
		}
		/**
  *Returns the area of the square with the area formula side * side
  */
		public double getArea()
		{
			return side * side;
		}
		/**
  *Returns the perimeter of the square with the perimeter formula 4 * side
  */
		public double getPer()
		{
			return side + side + side + side;
		}
		/**
  *Returns the shape which is a square
  */
		public static String getShape()
		{
			return "Square";
   }
}

		

