package FileIO;


public class Student {
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
}
