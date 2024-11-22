public class Logic_quiz {

	public static void main(String[] args) {
		
		
	System.out.print(findIfIsLeapYear());
	
	}

public static boolean findIfIsLeapYear(int year) {
{
	if((year % 4 == 0 && year % 100!= 0) || (year % 100 ==0 && year %400 == 0))
	{
		return true;
	}
	else
	{
		return false;
	}		
}
}
}
