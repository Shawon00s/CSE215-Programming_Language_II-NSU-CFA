
public class Triangle extends Figure {

	Triangle(double a, double b) {
		super(a, b);
	}

	@Override
	double area() {
		System.out.print("Triangle-> ");
		return (dim1*dim2)/2;
	}

}
