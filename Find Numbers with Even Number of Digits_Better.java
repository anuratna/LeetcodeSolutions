class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        
        for(int i = 0;i<nums.length;i++)
        {
          int count = 1;
          int n = nums[i];
          while(n/(Math.pow(10,count))>=1)
          {  
              count++;
              
          }
            System.out.println(count); 
          if(count%2 == 0)
          {
               even++;
          }
        }
        return even;
    }
}
