
public class Alt_arr {

	public static void main(String[] args) 
	{
		int[] nums = {5, 10, 15, 20};
		subtract5FromAll4(nums);
		

	}
	public static int[] subtract5FromAll4(int[]sub) 
	{
		int[] copyArr = {sub[0], sub[1], sub[2], sub[3]};
		copyArr[0] = copyArr[0]-5;
		copyArr[1] = copyArr[1]-5;
		copyArr[2] = copyArr[2]-5;
		copyArr[3] = copyArr[3]-5;
		System.out.print(copyArr[0]);
		System.out.print(copyArr[1]);
		System.out.print(copyArr[2]);
		System.out.print(copyArr[3]);
		
		return copyArr;
	}
}
