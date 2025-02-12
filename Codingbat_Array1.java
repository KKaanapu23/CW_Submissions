//firstLast6
public boolean firstLast6(int[] nums) {
  //check first element if it's equal to 6
  if(nums[0] == 6 || nums[nums.length-1] == 6)
  {
    return true;
  }
  else
  {
    return false;
  }
}

//sameFirstLast
public boolean sameFirstLast(int[] nums)
{
  //check if first and last element are the same and if arr is length 1 or more
  if(nums.length >= 1)
  {
    if(nums[0] == nums [nums.length-1])
    {
      return true;
    }
    
    return false;
    
  }
  else
  {
    return false;
  }
}

//makePi
public int[] makePi() 
{
  //return an array as long as 3 with 3 1 4
  int[] Pi = {3, 1, 4};
  return Pi;
}

//Common end
public boolean commonEnd(int[] a, int[] b) 
{
  //Check if the first element or last element of both is the same they have a length of 1
  if(a[0] == b[0] || a[a.length-1] == b[b.length-1])
  {
    return true;
  }
  return false;
}

//sum3
public int sum3(int[] nums) 
{
  //An array with a length of 3, and return the sum of the elements.
  return nums[0] + nums[1] + nums[2];
   
}
