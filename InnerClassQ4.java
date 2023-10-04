class FirstClass {
    public class FirstInnerClass {
        public String message;

        public FirstInnerClass(String message) {
            this.message = message;
        }

        public void displayMessage() {
            System.out.println("FirstInnerClass message: " + message);
        }
    }
}

class SecondClass {
    public class SecondInnerClass extends FirstClass.FirstInnerClass {
        public SecondInnerClass(FirstClass firstClassInstance, String message) {
            firstClassInstance.super(message);
        }

        public void displayMessage() {
            System.out.println("SecondInnerClass message: " + super.message);
        }
    }
}

public class InnerClassQ4 {
	public static void main(String args[]) {
		FirstClass firstInstance = new FirstClass();
        	FirstClass.FirstInnerClass firstInnerInstance = firstInstance.new FirstInnerClass("Hello from FirstInnerClass");
        	firstInnerInstance.displayMessage();

        	SecondClass secondInstance = new SecondClass();
        	SecondClass.SecondInnerClass secondInnerInstance = secondInstance.new SecondInnerClass(firstInstance, "Hello from SecondInnerClass");
        	secondInnerInstance.displayMessage();
	}
}
