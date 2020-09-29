class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer,Integer> hmap = new HashMap<Integer, Integer>();
        
        for(int i : nums)
        {
            if(hmap.containsKey(i))
            {
                hmap.put(i,hmap.get(i)+1);
            }
            else{
                hmap.put(i,1);
            }
        }
        
        for(int i : hmap.keySet())
        {
            if(hmap.get(i)==1){
                return i;}
        }
        return 0;
        
    }
}
