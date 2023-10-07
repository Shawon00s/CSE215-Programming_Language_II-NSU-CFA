
public class AbstractClassDemo {

	public static void main(String[] args) {
		Rectangle R1 = new Rectangle(9,5);
		Rectangle R2 = new Rectangle(7,10);
		Triangle T1 = new Triangle(20,8);
		Triangle T2 = new Triangle(10,9);
		
		CompareObjects comp = new CompareObjects();
		
		comp.compareFigures(R1, R2);
		comp.compareFigures(T1, T2);
		comp.compareFigures(R1, T1);
		comp.compareFigures(T1, R2);
		comp.compareFigures(R1, T2);

	}

}
