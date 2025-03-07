
public class Search_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fore = {4,2,4,4, 4, 3};
		System.out.print(checkFor4(fore));
		System.out.println(countFor4(fore));
		System.out.println(checkForFour(fore));

	}
	
	/**
	 * Create a method checkFor4() that is 
	 * passed an int array and returns 
	 * true if that array has a 4 and false 
	 * if that array has no 4's.
	 */
	public static boolean checkFor4(int[] arr) 
	{
		//this loops from index 0 to the very end
		//that way i can keep track of where we are in the arr
		for(int i = 0; i <= arr.length-1; i++)
		{
			//checks to see if current element is 4
			if(arr[i] == 4)
			{
				return true;
			}	
		}
		//if we got here, that means we traversed the 
		//entire arr without seeing a 4, so we return false
		return false;
	}
	
	/**
	 * This method basically counts how many fours
	 * there are in the array 
	 * @param Arr
	 * @return
	 */
	
	public static int countFor4(int[] Arr)
	{
		//This is the counter keeping track of how many
		//4's there were
		int counter = 0;
		//Goes through the whole array to look for 4's
		for(int i = 0; i <= Arr.length-1; i++)
		{
			//This is what adds to the counter of 4's
			if(Arr[i] == 4)
			{
				counter++;
			}
		}
		//returns how many 4's were counted
		return counter;
	}
	
	/**
	 * Create a method checkForFour4() 
	 * that is passed an int array and return true 
	 * if the array has exactly four 4's in it. 
	 * @param Air
	 * @return
	 */
	public static boolean checkForFour(int[] Air)
	{
		//This is the counter of 4's
		int count = 0;
		//Goes through the whole array looking for 4's
		for(int i = 0; i <= Air.length-1; i++)
		{
			//Adds to the counter for every 4
			if(Air[i] == 4)
			{
				count++;
			}	
		}
		//Checks if there's exactly 4 fours
		//if not then it returns false
		if(count == 4)
		{
			return true;
		}	
		return false;
	}
	
}
