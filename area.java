import java.util.Scanner;

class Rectangle{
    int length, breadth;
    Rectangle(){
        length = breadth = 0;
    }
    Rectangle(int d){
        length = breadth = d;    
    }
    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
    public void calArea(){
        int a = length * breadth;
        System.out.println("The area of the rectangle is " + a);    
    }
}

public class area {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        r1.calArea();
        System.out.println("Enter single parameter for length and breadth: ");
        int n = s.nextInt();
        Rectangle r2 = new Rectangle(n);
        r2.calArea();
        System.out.println("Enter length: ");
        int l = s.nextInt();
        System.out.println("Enter breadth: ");
        int b = s.nextInt();
        Rectangle r3 = new Rectangle(l,b);
        r3.calArea();
    }
}
