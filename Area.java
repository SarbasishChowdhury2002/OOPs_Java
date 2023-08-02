class A {
    int length, breadth;
    public void a(int s){
        length = s;
        System.out.println("The area of the square is "+(length*length));    
    }
    public void a(int l, int b){
        length = l;
        breadth = b;
        System.out.println("The area of the rectangle is "+(length*breadth));    
    }
}

public class Area {
    public static void main(String args[]){
        A obj = new A();
        obj.a(10);
        obj.a(20,10);
    }
}
