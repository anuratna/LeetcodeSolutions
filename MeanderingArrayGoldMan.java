// Arranging elelmts of list/array in maximum, minimum, maximum, minimum format

package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class MeanderingArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		list.add(-1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(-5);
		list.add(4);
		System.out.println(meanderingArray(list));
		
	}
	
	public static List<Integer> meanderingArray(List<Integer> list)
	{
		Collections.sort(list);
		List<Integer> newList = new ArrayList<>();
		int len = list.size();
		
		for(int i=0;i<len/2;i++)
		{	
			newList.add(list.get(len-(i+1)));
			newList.add(list.get(i));
		}
		if(len%2!=0)
		{
			newList.add(list.get(len/2));
		}
		
		return newList;
	}

}
