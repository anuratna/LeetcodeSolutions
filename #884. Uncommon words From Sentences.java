class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        
        HashMap<String, Integer> wordCount = new HashMap<String,Integer>();
        String[] a = A.split(" ");
        String[] b = B.split(" ");
        
        for(String s1 : a){
            if(wordCount.containsKey(s1))
            { wordCount.put(s1,wordCount.get(s1) + 1);}
            else{
                wordCount.put(s1,1);
            }
        }
        for(String s2:b){
            if(wordCount.containsKey(s2)){
            wordCount.put(s2,wordCount.get(s2) + 1);}
        else{
             wordCount.put(s2,1);
        }
        }
        
        ArrayList<String> arr = new ArrayList<String>();
        for(String s : wordCount.keySet())
        {
            if(wordCount.get(s)==1)
            {
                arr.add(s);
            }
        }
        return arr.toArray(new String[arr.size()]);
        
    }
}
