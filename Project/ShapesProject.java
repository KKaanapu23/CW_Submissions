/*
 * This code prints out 6 shapes which are a Square, Circle, Rectangle
 * , Cube, Sphere and a SemiCircle
 */
public class Main {

	public static void main(String[] args) {
		//Circle Main
		Circle circOne = new Circle(3.0);
		Circle circTwo = new Circle (20.0);
		Circle circThree = new Circle (-4.0);
		System.out.println(circOne.getRadius());
		System.out.println(circTwo.getRadius());
		System.out.println(circThree.getRadius());	
		System.out.println(circOne.getDiameter());
		System.out.println(circTwo.getDiameter());
		System.out.println(circThree.getDiameter());
		System.out.println(circOne.getCircum());
		System.out.println(circTwo.getCircum());
		System.out.println(circThree.getCircum());
		System.out.println(circOne.getArea());
		System.out.println(circTwo.getArea());
		System.out.println(circThree.getArea());
		String Ball = Circle.getShape();
		System.out.println(Ball);
		System.out.println();
		
		//Square Main
		Square squaOne = new Square(5.0);
		Square squaTwo = new Square(10.0);
		Square squaThree = new Square(15.0);
		System.out.println(squaOne.getSide());
		System.out.println(squaTwo.getSide());
		System.out.println(squaThree.getSide());
		String Squad = Square.getShape();
		System.out.println(Squad);
		System.out.println();
		
		//Rectangle Main
		Rectangle recOne = new Rectangle(8.0, 16.0);
		Rectangle recTwo = new Rectangle(15.0, 30.0);
		Rectangle recThree = new Rectangle(13.0, 26.0);
		System.out.println(recOne.getLength());
		System.out.println(recTwo.getLength());
		System.out.println(recThree.getLength());
		System.out.println(recOne.getWidth());
		System.out.println(recTwo.getWidth());
		System.out.println(recThree.getWidth());
		String Rect = Rectangle.getShape();
		System.out.println(Rect);
		System.out.println();
		
		//SemiCircle Main
		SemiCircle semOne = new SemiCircle(2.0);
		SemiCircle semTwo = new SemiCircle(3.0);
		SemiCircle semThree = new SemiCircle(4.0);
		System.out.println(semOne.getRadius());
		System.out.println(semTwo.getRadius());
		System.out.println(semThree.getRadius());
		System.out.println(semOne.getDiameter());
		System.out.println(semTwo.getDiameter());
		System.out.println(semThree.getDiameter());
		String Half = SemiCircle.getShape();
		System.out.println(Half);
		System.out.println();
		
		//Sphere Main
		Sphere sphOne = new Sphere(6.0);
		Sphere sphTwo = new Sphere(7.0);
		Sphere sphThree = new Sphere(8.0);
		System.out.println(sphOne.getRadius());
		System.out.println(sphTwo.getRadius());
		System.out.println(sphThree.getRadius());
		System.out.println(sphOne.getDiameter());
		System.out.println(sphTwo.getDiameter());
		System.out.println(sphThree.getDiameter());
		System.out.println(sphOne.getCircum());
		System.out.println(sphTwo.getCircum());
		System.out.println(sphThree.getCircum());
		System.out.println(sphOne.getArea());
		System.out.println(sphTwo.getArea());
		System.out.println(sphThree.getArea());
		System.out.println(sphOne.getVolume());
		System.out.println(sphTwo.getVolume());
		System.out.println(sphThree.getVolume());
		String Earth = Sphere.getShape();
		System.out.println(Earth);
		System.out.println();
		
		//Cube Main
		Cube cubOne = new Cube(4.0);
		Cube cubTwo = new Cube(5.0);
		Cube cubThree = new Cube(2.0);
		System.out.println(cubOne.getSide());
		System.out.println(cubTwo.getSide());
		System.out.println(cubThree.getSide());
		System.out.println(cubOne.getArea());
		System.out.println(cubTwo.getArea());
		System.out.println(cubThree.getArea());
		System.out.println(cubOne.getPer());
		System.out.println(cubTwo.getPer());
		System.out.println(cubThree.getPer());
		System.out.println(cubOne.getVol());
		System.out.println(cubTwo.getVol());
		System.out.println(cubThree.getVol());
		String Flat = Cube.getShape();
		System.out.println(Flat);
		System.out.println();
	}
	
}
