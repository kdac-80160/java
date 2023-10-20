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
		Double [] arr = {11.12,33.14,55.56,11.15,33.34,22.25,90.89,11.12};
		int count = countIf(arr, 11.12, (x,y)-> x.equals(y));
		System.out.println("Number of times key repeated : "+count);
	}

}
