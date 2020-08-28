/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t= Integer.parseInt(br.readLine());
		
		for(int i=0;i<t;i++)
		{
		    int n = Integer.parseInt(br.readLine());
		    int[] arr = new int[n];
		    String str[] = br.readLine().split(" ");
		    for(int j=0;j<n;j++)
		    {
		        arr[j]=Integer.parseInt(str[j]);
		    }
		    
		    int max = Integer.MIN_VALUE;
		    int sum=0;
		    for(int k=0;k<n;k++)
		    {
		           sum=sum+arr[k];
		           if(sum>max)
		            {
		                max=sum;
		            }
		            if(arr[k]>sum)
		            {
		                if(arr[k]>max){
		                max=arr[k];
		                }
		                sum=arr[k];
		            }
		        
		        }
		            
		    System.out.println(max);
	}
	
    
}
}
