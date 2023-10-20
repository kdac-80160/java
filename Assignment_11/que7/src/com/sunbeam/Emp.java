package com.sunbeam;

public interface Emp {
double getSal();
default double calcIncentives()
{
	return 0.0;
}
static double CalculateTotalSalary(Emp arr[])
{
	double total = 0;
	for(Emp e:arr)
		total = total + e.getSal()+e.calcIncentives();
	return total;
}
}
