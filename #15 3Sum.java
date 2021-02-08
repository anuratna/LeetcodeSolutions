class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        //Sorting array
        //fixing one element using one for loop and trying to find other two elements , which sums upto -fixed         element. While loop till start<end. 
        Arrays.sort(nums);     
        
        List<List<Integer>> listOfLists = (List)new ArrayList<ArrayList<String>>();
        
        for(int i=0;i<nums.length;i++)
        {
             int start = i+1;
             int end = nums.length-1;
            //Skip if the fixed element is same(It will anyway give the same result)
              if(i>1 && nums[i]==nums[i-1])
              {
                  continue;
              }
            
               while(start<end){

                 int sum = nums[start]+nums[end];

                 if(sum<(-nums[i]))
                 {
                       start = start+1;
                      
                 }
                 else if(sum >(-nums[i])){

                       end = end-1;
                      
                  }
                   else
                   {
                       List<Integer> list = new ArrayList<Integer>();
                       list.add(nums[i]);
                       list.add(nums[start]);
                       list.add(nums[end]);

                        if(!listOfLists.contains(list)){
                             listOfLists.add(list); }
                       
                           start = start+1;
                           end=end-1;  
                   }
                   
                }
           }
    
         return listOfLists;
   }
}
