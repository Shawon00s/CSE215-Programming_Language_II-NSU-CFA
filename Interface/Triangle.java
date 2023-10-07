package Interface;

public class Triangle extends Figure implements AreaIntFc,VolumeIntFc {
	
	Triangle(){
		super();
	}
	Triangle(double a, double b, double c){
		super(a,b,c);
	}

	@Override
	public double area() {
		return (width*height)/2;
	}
	
	@Override
	public double volume() {
		return (width*height*depth)/2;
	}
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", depth=" + depth + ", area()=" + area()
				+ ", volume()=" + volume() + "]";
	}
}
