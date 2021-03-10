// Given list of integers, create sequence of 3 elements in decreasing order.
package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenceInversions {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(2);
		list.add(2);
		//list.add(2);
		list.add(1);
		
		System.out.println(maxInversions(list));
		System.out.println(maxInversion(list));
	}
	//Approach One
	//Brute Force
	public static long maxInversions(List<Integer> list)
	
	{
		long count = 0;
		
		for(int i=0; i<list.size()-2; i++)
		{
			for(int j=i+1; j<list.size()-1;j++)
			{
				if(list.get(i)>list.get(j))
				{
					for(int k=j+1; k<list.size();k++)
					{
						if(list.get(j)>list.get(k))
						{
							count++;
						}
						
					}
					
				}
				
			}			
		}
		
		return count;
	}
	
	//Approach Two
	//Considering ith as middle element and counting all smaller and greater elements than the ith element and multiplying them and adding to count.
	public static long maxInversion(List<Integer> list)
	{
		long count = 0;
		
		for(int i = 0; i<list.size()-1; i++)
		{
			int greater = 0;
			for(int j = i-1;j>=0;j--)
			{
				if(list.get(j)>list.get(i))
				{
					greater++;
					
				}
				
			}
			int smaller = 0;
			for(int k = i+1;k<list.size();k++)
			{
				if(list.get(k)<list.get(i))
				{
					smaller++;
				}
			}
			count = count + (greater*smaller);
		}
		return count;
	}

}
