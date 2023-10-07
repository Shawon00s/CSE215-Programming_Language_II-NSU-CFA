package Interface;


public class CompareObjects {
	
	public void compareArea(AreaIntFc A, AreaIntFc B) {
		double a = A.area();
		double b = B.area();
		
		System.out.print("Area comparison: ");
		if(a>b) 
			System.out.println("First object is larger than second object.");
		else if(b>a)
			System.out.println("Second object is larger than first object.");
		else
			System.out.println("Two objects are equal.");
	}
	
	
	public void compareVolume(VolumeIntFc A, VolumeIntFc B) {
		double a = A.volume();
		double b = B.volume();
		
		System.out.print("Volume comparison: ");
		if(a>b) 
			System.out.println("First object is larger than second object.");
		else if(b>a)
			System.out.println("Second object is larger than first object.");
		else
			System.out.println("Two objects are equal.");
	}
	

}
