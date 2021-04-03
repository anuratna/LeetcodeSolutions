class Solution {
    
    //******Brute Force*****///
    
//     public int[] dailyTemperatures(int[] T) {
//         int[] temp = new int[T.length];
//         int count = 0;
        
//        for(int i = 0;i<T.length;i++)
//        {
//            for(int j = i+1; j<T.length; j++)
//            {
//                //comparing elements and adding to temp array if jth elemen is bigger and then breaking the loop, if not inc the count and continue loop.
//                if(T[j]>T[i])
//                {
//                    count++;
//                    temp[i] = count; 
//                    count = 0;
//                    break;
//                }
//                count++;
//            }
//            count = 0;
//        }
//         return temp;
    
    
    //*******Stack********
    public int[] dailyTemperatures(int[] T) {
        
    Stack<Integer> stack = new Stack<Integer>();
     int[] temp = new int[T.length];
    
    for(int i = T.length-1; i>=0;i--)
    {
        while(!stack.isEmpty()&&T[stack.peek()]<=T[i])
        {
             stack.pop();
        }
        if(stack.isEmpty()){
                temp[i]=0;
        }else{
            temp[i] = stack.peek()-i;
            }
           stack.push(i);
        }
        
    
    return temp;
    }
}
