package Interface;


public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,7,5);
		Triangle t  = new Triangle(5,6,4); 
		
		System.out.println(r);
		System.out.println(t);
		
		CompareObjects comp = new CompareObjects(); 
		comp.compareArea(r, t);
		comp.compareVolume(r, t);

	}

}
