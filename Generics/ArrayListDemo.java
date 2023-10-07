package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
        ArrayList <Integer> values = new ArrayList<>();
		
        values.add(20);values.add(10);values.add(30);
		
		//ArrayList <Integer> values = new ArrayList<>() {{add(20);add(10);add(30);}};
		
		System.out.println(values);
		Collections.sort(values);
		System.out.println(values);
		Collections.reverse(values);
		System.out.println(values);
		System.out.println(values.get(2));
		values.set(1, 40);
		System.out.println(values);
		
		String ct[] = {"Dhaka","Chittagong","Rajshahi","Khulna"};
		ArrayList <String> city = new ArrayList<>(Arrays.asList(ct));
	    
		System.out.println(city);
	    city.remove(2);
	    System.out.println(city);
		city.add(1,"Rajshahi");
	    System.out.println(city);
	    city.remove("Chittagong");
	    System.out.println(city);
	    city.add("Chittagong");
	    System.out.println(city);
	    Collections.sort(city);
	    System.out.println(city);
	    
	    ArrayList<Student> stuList = new ArrayList<>();
	    stuList.add(new Student("Monir",2,3.7));
		stuList.add(new Student("Faisal",1,3.8));
		stuList.add(new Student("Bashar",3,3.6));
		
		System.out.println(stuList);
		
		stuList.add(new Student("Nasif",4,3.76));
		System.out.println(stuList);
		
		stuList.set(2, new Student("Arman",3,3.5));
		System.out.println(stuList);
		
		Student stu = new Student("Zakaria",5,3.82);
		stuList.add(3,stu);
		System.out.println(stuList);
		System.out.println(stuList.indexOf(stu));
		
		stuList.remove(2);
		System.out.println(stuList);
		stu = new Student("Arman",3,3.5);
		System.out.println(stuList.indexOf(stu));

		Collections.sort(stuList);
		System.out.println(stuList);

	}
	
}
