
public class CompareObjects {
	
	public void compareFigures(Figure A, Figure B) {
		double a = A.area();
		System.out.println("Area: "+a);
		double b = B.area();
		System.out.println("Area: "+b);
		
		if(a>b) 
			System.out.println("First object is larger than second object.");
		else if(b>a)
			System.out.println("Second object is larger than first object.");
		else
			System.out.println("Two objects are equal.");
	}

}
