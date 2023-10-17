package tester;

import java.util.Arrays;

import com.sunbeam.CustomSort;
import com.sunbeam.Student;

public class Tester {

	public static void main(String[] args) {
		Student arr[] = new Student[6];
		arr[0] = new Student(12,"Mahendra","Karad",97);
		arr[5] = new Student(19,"Devesh","Karad",97);
		arr[1] = new Student(16,"Naman","Mumbai",85);
		arr[2] = new Student(9,"Pratyush","Karad",87);
		arr[3] = new Student(10,"Joyna","Delhi",82);
		arr[4] = new Student(7,"Naman","Delhi",85);
		
		CustomSort c1 = new CustomSort();
		Arrays.sort(arr,c1);
		
		for(Student s: arr)
			System.out.println(s);
			
	}
}
