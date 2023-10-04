class Outer1 {
	public void outShow() {
		System.out.println("I am Outer method");
	}
	
	class Inner1 {
		public void inShow() {
			System.out.println("I am Inner1 method");
		}
		
		class Inner2 {
			public void inShow2() {
				System.out.println("I am Inner2 method");
			}
		}
	}
}

public class InnerClassQ3 {
	public static void main(String args[]) {
		Outer1 a = new Outer1();
		Outer1.Inner1 b = new Outer1().new Inner1();
		Outer1.Inner1.Inner2 c = new Outer1().new Inner1().new Inner2();
		a.outShow();
		b.inShow();
		c.inShow2();
	}
}
