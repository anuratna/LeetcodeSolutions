class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        result =[]
        set1 = set(nums1)
        set2=set(nums2)
        
        if(len(set1)<len(set2)):
            for each in set1:
                if each in set2:
                     result.append(each)
            return result
        else:
            for each in set2:
                if each in set1:
                    result.append(each)
            return result
                
