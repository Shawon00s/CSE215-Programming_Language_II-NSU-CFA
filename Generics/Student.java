package Generics;

public class Student implements Comparable<Student> {
	String name;
	int ID;
	double CGPA;
	Student(){}
	Student(String s,int i,double d){
		name = s;
		ID = i;
		CGPA = d;
	}
	public String toString() {
		return name+" "+ID+" "+CGPA;
	}
	@Override
	public int compareTo(Student o) {
		if(ID>o.ID) return 1;
		else if(ID<o.ID) return -1;
		else return 0;
	}
}
