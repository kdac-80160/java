package com.sunbeam;


interface Check<T>{
	boolean compare(T a, T b);
}
public class CheckUtility {
	public static <T> int countIf(T[]arr, T key, Check<T> ab )
	{
		int count = 0;
		for(T element: arr)
		{
			if(ab.compare(element, key))
					count++;
		}
		return count;
			
	}
	public static void main(String[] args) {
		Integer [] arr = {11,33,55,67,33,22,90,11};
		int count = countIf(arr, 23, (x,y)->x>y);
		System.out.println("Number greater than key : "+count);
	}

}
