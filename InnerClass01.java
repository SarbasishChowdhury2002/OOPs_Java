class Outer {
	private void outerMethod() {
		System.out.println("I am Outer Class Method");
	}
	
	class Inner {
		public void innerMethod() {
			System.out.println("I am Inner Class Method");
			// accessing outerMethod()
			outerMethod();
		}
	}
	
}

public class InnerClass01 {
	public static void main(String args[]) {
		Outer.Inner x = new Outer().new Inner();
		x.innerMethod();
	}
}
