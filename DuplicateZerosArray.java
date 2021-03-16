class Solution {
    public void duplicateZeros(int[] arr) {
        int[] arr2 = new int[arr.length];
        int j = 0;
        for(int i = 0; i< arr.length && j<arr2.length; i++)
        {
            if(arr[i] == 0 && j<arr2.length-1)
            {
                arr2[j] = 0;
                arr2[j+1] =0;
                j=j+2;
            }else{
                arr2[j] = arr[i];
                j++;
            } 
        }
        for(int i =0;i<arr.length;i++)
        {
            arr[i] = arr2[i];
        }
    }
}
