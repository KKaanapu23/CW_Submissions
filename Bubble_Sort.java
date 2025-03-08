public class Bubble_Sort {

	public static void main(String[] args) 
	{
		int[] bubs = {2, 1, 4, 6, 0};
		bubbleSort(bubs);
	}
	public static void bubbleSort(int[] arr)
	{
			for(int g = 0;g <+ arr.length-1; g++)
		{
			
			for(int i = 0; i <= arr.length-2; i++)
			{
				if(arr[i] > arr [i+1])
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
			
			for(int i = 0; i< arr.length ; i++)
			{
				System.out.print(arr[i]);
			}
		
	}
}
