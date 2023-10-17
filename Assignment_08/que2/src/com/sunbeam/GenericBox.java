package com.sunbeam;

public class GenericBox<T> {
	T obj;
	
	public void setObject(T obj) {
		this.obj = obj;
	}
	
	public T get()
	{
		return obj;
	}
}
