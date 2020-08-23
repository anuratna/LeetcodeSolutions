class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        result = []
        for each in nums1:
            if(each in nums2) & ( each not in result): 
                # if each not in result:
                result.append(each)
                
        return result      
