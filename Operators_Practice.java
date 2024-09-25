
public class Operators_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PART ONE: MODULUS
		//What would each of the following 1-6 lines including the modulo operator cause to be printed?
		     System.out.println(14 % 13); = 1
		     System.out.println(8 % 11); = 8
		     System.out.println(6 % 2); = 0
		     System.out.println(7 % 2); = 1
		     System.out.println(274 % 10); = 4
		     System.out.println(881 % 2); = 1

		//PART TWO: COMPOUND OPERATORS AND SHORTCUTS (credits to runestone.academy)

		    int x = 0;
		    int y = 1;
		    int z = 2;
		    x--; // x followed by the double minus sign
		    y++; y = 2
		    z+=y; z(2)+y(2) = 4
		//After the above code runs, what are x, y, and z equal to?

		    int a = 3;
		    int b = 5;
		    int c = 2;
		    a = c * 2; 2 * 2 = 4
		    b = b / 2; 2
		    c++; c+1 3
		//After the above code runs, what are a, b, and c equal to?

		//PART THREE: CASTING

		    int total = 5 + 7 + 2;
		    (double) (total / 3); = 4.0//Option A
		    total / 3; 4//Option B
		    (double) total / 3;  //Option C
// Option C is correct because if you cast 14 as a double first then it turns to 14.0 and then that takes over and turns 3 to3.0 and gives a decimal
//The other two are incorrect because they give whole numbers that are incorrect
		//Which of the above options correctly computes the average of total? Why do the other options not work?
	}

}
