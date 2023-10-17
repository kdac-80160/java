package com.sunbeam.box;

import com.sunbeam.*;

public class GenericBox<T extends Employee> {
	private T obj;
	
	public void setObject(T obj)
	{
		this.obj = obj;
	}
	public double getSalary()
	{
		return obj.getSal();
	}
}
