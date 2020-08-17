class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        lastzero=0
        
        #pushing every non zero element to front
        for i in range(0,len(nums)):
            if nums[i] !=0:
                nums[lastzero]=nums[i]
                lastzero+=1
        #appending zero to the end of list
        for i in range(lastzero,len(nums)):
            nums[i]=0
