//rotateLeft3
public int[] rotateLeft3(int[] nums) 
{
  //length 3, make an array that switches going left
  int temp1 = nums[0];
  int temp2 = nums[1];
  int temp3 = nums[2];
  
  nums[0] = temp2;
  nums[1] = temp3;
  nums[2] = temp1;
  
  return nums;
}

//Reverse 3
public int[] reverse3(int[] nums) {
  //array length 3, give an array backwards
    int temp1 = nums[0];
  int temp2 = nums[1];
  int temp3 = nums[2];
  
  nums[0] = temp3;
  nums[1] = temp2;
  nums[2] = temp1;
  
  return nums;
}


//maxEnd3
public int[] maxEnd3(int[] nums) {
  //array length 3, find whats the biggest and make everything that big and return that
  if(nums[0] >= nums[2])
  {
    nums[2] = nums[0];
    nums[1] = nums[0];
  }
  
  else if(nums[2] >= nums[0])
  {
    nums[1] = nums[2];
    nums[0] = nums[2];
  }
 return nums; 
}

//Sum2
public int sum2(int[] nums) {
  //add the first two elements together but if there's one element then just return 0
  if(nums.length == 0)
  {
    return 0;
  }
  
  if(nums.length == 1)
  {
    return nums[0];
  }
  else
  {
    return nums[0] + nums[1];
  }
}


//middleWay
public int[] middleWay(int[] a, int[] b) {
  //2 int arrays a and b as long as 3, return it as a length with 2 
  int[] temp = {a[1], b[1]};
  return temp;
}


//makeEnds
public int[] makeEnds(int[] nums) 
{
    //make a new array out of another array with the first and last elements.
  int[] temp = {nums[0], nums[nums.length-1]};
  return temp;
}

