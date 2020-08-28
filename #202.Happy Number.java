class Solution {
    
    private int getNum(int n){
        int sum=0;
        while(n>0)
        {
          int digit = n%10;
          n =n/10;
         sum =sum + digit*digit;
        }
    return sum;
    }
    
    public boolean isHappy(int n) {
        Set<Integer> newset = new HashSet<>();
        while(n!=1){
            newset.add(n);
            n=getNum(n);
        }
       return n==1 ;
    }
}
