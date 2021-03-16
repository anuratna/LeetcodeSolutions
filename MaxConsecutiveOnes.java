class Solution {
    int length = 0;
    int maxLength=0;
    public int findMaxConsecutiveOnes(int[] nums) {
        
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]==1)
            {
                length++;
                maxLength = Math.max(length,maxLength);
            }
            else{
                length = 0;
            }
            
        }
        return maxLength;
    }
}
