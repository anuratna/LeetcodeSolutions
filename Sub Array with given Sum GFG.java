import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    for(int i=0;i<t;i++)
	    {
	        int n = sc.nextInt();
	        int s = sc.nextInt();
	        int[] arr = new int[n];
	        for(int j=0;j<n;j++)
	        {
	            arr[j]=sc.nextInt();
	        }
	        funcSubArray(n,s,arr);
	    }
	       
	    }
	    
	    public static void funcSubArray(int n, int s, int[] arr)
	    {
	        int a=0;
	        int i=0;
	        int b=0;
	        int result = 0;
	        
	        for(i=0;i<n;i++)
	        {
	            if(result==s){
	                 b=i;
	                break;}
	                
	            else if(result>s){
	                result = result-arr[a];
	                i--;
	                a++;}
	                
	            else {
	                result =result+arr[i];}
	                
	                b=i+1;
	        }
	        while(result>s){
	                result = result-arr[a];
	                a++;
	                b=n;
	        }
	        if(result!=s)
	        {
	            
	            System.out.println(-1);
	        }
	        else
	        {
	            System.out.println((a+1)+" "+b);
	        }
	        
	    }
	    
	}
