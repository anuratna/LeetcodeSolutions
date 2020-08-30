package com.practice;
import java.util.*;

public class ReverseAndAddGFG {

	//Function to check if number is palindrome or not
	public boolean isPalindrome(int n)
	{
		int rev=0;
		rev = ReverseNum(n);
		if(rev==n)
		{
			return true;
		}
		return false;	
	}
	
	//Func to reverse the number
	public int ReverseNum(int n)
	{
		int rev=0;
		while(n>0)
		{
			rev = rev*10 + n%10;
			n = n/10;
			
		}
		return rev;
	  }
	
	//To reverse and add and check if number is palindrome or not
	public int reverseAndAdd(int n)
	{
		int count =0;
		int rev =0;
		while(count<1000)
		{
			rev = ReverseNum(n);
			n = n + rev;
			count++;
		
		if (isPalindrome(n))
		{
			System.out.println("Number is palindrome");
			System.out.println("Number is :" +n);
			break;
		}
		else if(count>=1000){
			System.out.println("Number is not palindrome");
			}
		}
		return n;
	}
	
	public static void main(String[] args) {
		
		ReverseAndAddGFG obj = new ReverseAndAddGFG();
		obj.reverseAndAdd(196);
		

	}

}
