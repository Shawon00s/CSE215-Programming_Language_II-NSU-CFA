package Interface;


public class Rectangle extends Figure implements AreaIntFc,VolumeIntFc {
	
	Rectangle(){
		super();
	}
	Rectangle(double a, double b, double c){
		super(a,b,c);
	}

	@Override
	public double area() {
		return width*height;
	}
	
	@Override
	public double volume() {
		return width*height*depth;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", depth=" + depth + ", area()=" + area()
				+ ", volume()=" + volume() + "]";
	}
	
	

}
