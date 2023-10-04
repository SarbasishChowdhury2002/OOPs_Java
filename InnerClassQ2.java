class OuterClass {
	private int outerField;
	public OuterClass() {
		this.outerField = 0;
	}
	public void outerMethod() {
		System.out.println("Outer methos is called. Outer field = " + this.outerField);
	}
	public void modifyField(int value) {
		this.outerField = value;
		System.out.println("Outer field is modified. Outer field = " + this.outerField);
	}
	
	class InnerClass {
		public void innerMethodModifyOuter(int n) {
			System.out.println("Inner method is called");
			modifyField(n);
		}
	}
}

public class InnerClassQ2 {
	public static void main(String args[]) {
		OuterClass obj = new OuterClass();
		obj.outerMethod();
		obj.modifyField(10);
		OuterClass.InnerClass obj2 = new OuterClass().new InnerClass();
		obj2.innerMethodModifyOuter(20);
	}
}
