class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for(int i = nums.length-1; i>=0;i--)
        {
            if(nums[left]*nums[left]<nums[right]*nums[right])
            {
                arr[i] = nums[right]*nums[right];
                right--;
            }
            else{
                arr[i] = nums[left]*nums[left];
                left++;
            }
        }
        
        return arr;
    }
}
