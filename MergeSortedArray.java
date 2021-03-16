class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        int i = 0;
        int k = 0;
        
        int[] copy = nums1.clone();
        while(k<m+n)
        {
            if(j>=n||(i<m && copy[i]<nums2[j]))
            {
                nums1[k] = copy[i];
                i++;
            }
            else{
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }
        
        
    }
}
