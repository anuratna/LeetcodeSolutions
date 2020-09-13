class Solution {
    public boolean isMonotonic(int[] A) {
        int inc=0,dec=0;
        for(int i=0;i<A.length-1;i++)
        {
            if(A[i]>=A[i+1])
            {
                dec++;
            }
            if((A[i]<=A[i+1]))
            {
                inc++;
            }
        }
        if(inc==A.length-1 || dec == A.length-1){
         return true;}
        return false;
    }
}
