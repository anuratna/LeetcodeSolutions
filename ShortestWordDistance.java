class Solution {
    
    int index1 = -1 , index2 = -1, dist =Integer.MAX_VALUE;
    public int shortestDistance(String[] wordsDict, String word1, String word2) {    
        for(int i = 0; i<wordsDict.length; i++)
        {
            if(wordsDict[i].equals(word2))
            {
                index2 = i;
      
            }
            else if(wordsDict[i].equals(word1))
            {
                index1 = i;  
         
            } 
            
           if (index1 != -1 && index2 != -1) {
           dist = Math.min(dist,Math.abs(index2-index1));}
        }

        return dist;
    }
}
