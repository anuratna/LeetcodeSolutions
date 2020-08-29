/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

//O(n^2)log n- with binary search

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    
		    for(int j=0;j<n;j++)
		    {
		        arr[j]=sc.nextInt();
		    }
		    //Sort array for binary search
		     Arrays.sort(arr);
		     int count = 0;
		     for(int j=0;j<n;j++)
		     {
		         for(int l=j+1;l<n;l++)
		         {
		            int sum = 0;
		            sum=arr[j]+arr[l];
		            //To find sum if it exists.
	                int lo=j+1;int h=n-1;int mid;
        		           while(lo<=h)
        		           {
        		             mid = (lo+h)/2;
        		             if(sum==arr[mid])
        		             {
        		                 count++;
        		                 break;
        		             }
        		             else if(sum<arr[mid])
        		             {
        		                 h=mid-1;
        		             }
        		             else{
        		                 lo=mid+1;
        		             }
        		            }
		         }
		     }
		     if(count==0){
                System.out.println(-1);}
            else{
                System.out.println(count);
            }
        
		}
  
	}
}
