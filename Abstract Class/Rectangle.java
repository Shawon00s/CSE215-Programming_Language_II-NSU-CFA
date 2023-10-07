
public class Rectangle extends Figure{

	Rectangle(double a, double b) {
		super(a, b);
	}

	@Override
	double area() {
		System.out.print("Rectangle-> ");
		return dim1*dim2;
	}

}
