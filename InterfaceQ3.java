
interface RegularPolygon {
	int getNumSides();
	double getSideLength();
	
	default double getPerimeter() {
		return (getNumSides() * getSideLength());
	}
	
	default double getInteriorAngle() {
		return (getNumSides() - 2) * Math.PI / getNumSides();
	}
}


class EquilateralTriangle implements RegularPolygon {
	int sides;
	double length;
	EquilateralTriangle(double l) {
		this.sides = 3;
		this.length = l;
	}
	
	public int getNumSides() {
		return this.sides;
	}
	
	public double getSideLength() {
		return this.length;
	}
}

class Square implements RegularPolygon {
	int sides;
	double length;
	Square(double l) {
		this.sides = 4;
		this.length = l;
	}
	
	public int getNumSides() {
		return this.sides;
	}
	
	public double getSideLength() {
		return this.length;
	}
}

public class InterfaceQ3 {

	public static int totalSides(RegularPolygon[] arr) {
		int sum = 0;
		for(RegularPolygon i : arr) {
			sum += i.getNumSides();
		}
		return sum;
	}

	public static void main(String[] args) {
		EquilateralTriangle triangle = new EquilateralTriangle(5.0);
        	Square square = new Square(4.0);

        	RegularPolygon[] polygons = {triangle, square};

        	System.out.println("Total sides: " + totalSides(polygons));
        	System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
        	System.out.println("Triangle Interior Angle: " + triangle.getInteriorAngle() + " radians");
        	System.out.println("Square Perimeter: " + square.getPerimeter());
        	System.out.println("Square Interior Angle: " + square.getInteriorAngle() + " radians");
	}
}
