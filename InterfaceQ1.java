interface CalculateArea {
	void rectangleArea(double l, double b);
	void circleArea(double r);
}

class AreaClass implements CalculateArea {
	double area = 0.0;
	public void rectangleArea(double l, double b) {
		this.area = l * b;
		System.out.println("Area of rectangle = " + this.area);
	}
	public void circleArea(double r) {
		this.area = 3.14 * r * r;
		System.out.println("Area of circle = " + this.area);
	}
}

public class InterfaceQ1 {
	public static void main(String args[]) {
		AreaClass obj = new AreaClass();
		obj.rectangleArea(10, 5.5);
		obj.circleArea(7.0);
	}
}
