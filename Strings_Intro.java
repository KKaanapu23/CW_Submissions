import java.util.Scanner;

public class Strings_Intro {

	public static void main(String[] args) {
		Scanner myReader = new Scanner(System.in);
		String myInput = new String(myReader.next());
		myReader.close();
		printSecondAndLastLetter(myInput);
		findThatE(myInput);
		getLength(myInput);
		printFirstAndLastThree(myInput);
		

	}
	
	public static void printSecondAndLastLetter(String str)
	{
		System.out.println("the second letter of this word is "+ str.charAt(1));
		System.out.println("the last letter of this word is "+ str.charAt(str.length()-1));
	}
	
	public static void findThatE(String str)
	{
		System.out.println("The index of e is " + str.indexOf('e'));
	}
	
	public static void getLength(String str)
	{
		System.out.println("The length of this word is "+ str.length());
	}
	
	public static void printFirstAndLastThree(String str)
	{
		System.out.println("The first three letters of this word is "+ str.substring(0, 3));
		System.out.println("The last three letters of this word is "+ str.substring(str.length()-3));
	}


}
