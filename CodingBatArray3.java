//has23
public boolean has23(int[] nums) 
{
//look for 2 and 3 in the array and say if its true if it has it
  if(nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3)
  {
    return true;
  }
  else
  {
    return false;
  }
}



//no23
public boolean no23(int[] nums) {
  //return true if theres no 2 or 3
  if(nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3)
  {
    return false;
  }
  else
  {
    return true;
  }
}



//makeLast
public int[] makeLast(int[] nums) 
{
  //make a new array with double its current length but the last 
  //element is the same number and make the other numbers 0
  int[] Arr = new int[nums.length + nums.length];
  Arr[Arr.length-1] = nums[nums.length-1];
  return Arr;
}



//double23
public boolean double23(int[] nums) 
{
  //return true if there's 2 & 3 two times
  if(nums.length == 2)
  {
    if(nums[0] == 2 && nums[1] == 2)
    {
      return true;
    }
    else if(nums[0] == 3 && nums[1] == 3)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  return false;
}



//fix23
public int[] fix23(int[] nums) {
  //find if 2 is followed by three and change the 3 to 0 then return the new array
  if(nums[0] == 2 && nums[1] == 3)
  {
    nums[1] = 0;
    return nums;
  }
  else if(nums[1] == 2 && nums[2] == 3)
  {
    nums[2] = 0;
    return nums;
  }
  return nums;
}



//start1
public int start1(int[] a, int[] b) 
{
  //check how many of them have 1 as the first element, there's 2 arrays
  int ab = 0;
  if(a.length > 0)
  {
    if(a[0] == 1)
    {
      ab++;
    }
  }
  if(b.length > 0)
  {
    if(b[0] == 1)
  {
    ab++;
  }
}
  return ab;
}



//biggerTwo
public int[] biggerTwo(int[] a, int[] b) {
  //get their sums and return the biggest one, if tie then return 'a'
  int a2 = a[0] + a[1];
  int b2 = b[0] + b[1];
  if(a2 > b2)
  {
    return a;
  }
  else if(b2 > a2)
  {
    return b;
  }
  else
  {
    return a;
  }
  
}




//makeMiddle
public int[] makeMiddle(int[] nums) {
  //return a new array 2 with the mid 2 elements from the first array original has to be as long as 2
  int middle = nums.length / 2;
  return new int[] {nums[middle-1], nums[middle]};
}


//plusTwo
public int[] plusTwo(int[] a, int[] b) {
  //2 arrays size 2 return a new one size 4 but with the elements from both arrays
  int[] pTwo = new int[]{a[0], a[1], b[0], b[1]};
  return pTwo;
}



//swapEnds
public int[] swapEnds(int[] nums) 
{
  int temp1 = nums[0];
  int temp2 = nums[nums.length-1];

  nums[0] = temp2;
  nums[nums.length-1] = temp1;
  
  return nums;
}

//midThree
public int[] midThree(int[] nums) {
  //the length will be odd, return an array of 3 with the middle elements. Array at least 3
  int middle = nums.length / 2;
  return new int[]{nums[middle-1], nums[middle], nums[middle+1]};
}



//maxTriple
public int maxTriple(int[] nums) {
  //an odd array, find the biggest number and return it from the last, first, or mid\
  int first = nums[0];
  int middle = nums[nums.length / 2] ;
  int last = nums[nums.length-1];
  if(middle > last && middle > first)
  {
    return middle;
  }
  else if(first > last && first > middle)
  {
    return first;
  }
  else
  {
    return last;
  }
}



//frontPiece
public int[] frontPiece(int[] nums) {
  //return a new array with the first two numbers but if theres only one number return that one
  
  if(nums.length < 2)
  {
  return nums;
  }
  else
  {
    int[] Arr = {nums[0], nums[1]};
    return Arr;
  } 
}


//unlucky1
public boolean unlucky1(int[] nums) {
  //if 1 is followed by 3 it's unlucky. Find that one and return true if not then else
  if(nums.length < 2)
  {
    return false;
  }
  if(nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3)
  {
    return true;
  }
  if(nums[nums.length-2] == 1 && nums[nums.length-1] == 3)
  {
    return true;
  }
  else
  {
    return false;
  }
}


//make2
public int[] make2(int[] a, int[] b) {
  //2 arrays, grab the first two numbers combining both arrays
  if(a.length == 0)
  {
    return new int[] {b[0], b[1]};
    
  }
  else if(a.length >= 2)
  {
    return new int[] {a[0] , a[1]};
  }
  else if(a.length == 1)
  {
    return new int[] {a[0], b[0]};
  }
     return new int[] {a[0], b[0]};
}


//front1 1
public int[] front11(int[] a, int[] b) {
  //2 int arrays get the first number ignore it if it is blank
  if(a.length == 0 && b.length == 0)
  {
    return a;
  }
  if(a.length == 0)
  {
    return new int[] {b[0]};
  }
  if(b.length == 0)
  {
    return new int[] {a[0]};
  }
  if (a.length == 1 && b.length == 1)
  {
    return new int[] {a[0] , b[0]};
  }
     return new int[] {a[0] , b[0]};
}
