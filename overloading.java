class A {
    public void sum(int a, int b){
        System.out.println(a+b);    
    }
    public void sum(int a){
        System.out.println(a+a);    
    }
    public void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void sum(double a, double b){
        double c = a+b;
        System.out.println(c);        
    }
}

public class overloading {
    public static void main(String args[]){
        A obj = new A();
        obj.sum(2);
        obj.sum(6,4);
        obj.sum(5.5,10.2);
    }
}
