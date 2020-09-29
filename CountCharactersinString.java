public class Main {
    public static void main(String[] args) {
        String str = "mississipi";
        
        HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();
        char[] ch = str.toCharArray();
        
        for(char c : ch)
        {
            if(charCount.containsKey(c))
            {
                charCount.put(c,charCount.get(c)+1);
            }
            else{
                charCount.put(c,1);
            }
        }
         System.out.println(charCount);
    }
}
