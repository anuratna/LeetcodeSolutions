#1051
class Solution {
    public int heightChecker(int[] heights) {
        
        int count=0;
        int[] copyArr = new int[heights.length];
        
        //Cloning array
        for(int i=0;i<heights.length;i++)
        {
            copyArr[i] = heights[i];     
        }
        //sorting new array
        Arrays.sort(copyArr);
        
        //Comparing 2 array, if element is diff then ince count.
        for(int i = 0;i<heights.length;i++)
        {
            if(heights[i]!=copyArr[i])
            {
                count++;
            }    
        }
       return count; 
    }
}
