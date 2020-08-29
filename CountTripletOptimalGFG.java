/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

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

            for(int j=n-1;j>=2;j--)
            {
                int a=0;
                int b=j-1;
                while(a<b){
                    if(arr[b]+arr[a]==arr[j])
                    {
                        a++;
                        b--;
                        count++;
                        
                    }
                    else if(arr[b]+arr[a]<arr[j])
                    {
                        a++;
                    }
                    else
                    {
                        b--;
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
