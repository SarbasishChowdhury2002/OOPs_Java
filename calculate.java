import java.util.Scanner;

class Cal {
    public int a,b;
    public int add(int a, int b){
        return (a+b);    
    }
    public int sub(int a, int b){
        return (a-b);    
    }
    public int mul(int a, int b){
        return (a*b);    
    }
    public float div(int a, int b){
        return (a/b);    
    }
    public int rem(int a, int b){
        return (a%b);    
    }
}

public class calculate {
    public static void main(String args[]){
        Cal obj = new Cal();
        Scanner sc = new Scanner(System.in);
        obj.a = sc.nextInt();
        obj.b = sc.nextInt();
        System.out.println("Addition = " + obj.add(obj.a,obj.b));
        System.out.println("Subtraction = " + obj.sub(obj.a,obj.b));
        System.out.println("Multiplication = " + obj.mul(obj.a,obj.b));
        System.out.println("Division = " + obj.div(obj.a,obj.b));
        System.out.println("Remainder = " + obj.rem(obj.a,obj.b));
    }
}
