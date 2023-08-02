import java.util.Scanner;

class S {
    String name;
    S(){
        name = "Unknown";    
    }
    S(String n){
        name = n;    
    }
    public void printName(){
        System.out.println("The name of the Student is "+name);    
    }
}

public class studentName {
    public static void main(String args[]){
        Scanner y = new Scanner(System.in);
        S obj1 = new S();
        obj1.printName();
        System.out.println("Enter student's name: ");
        String name = y.next();
        S obj2 = new S(name);
        obj2.printName();
    }
}
