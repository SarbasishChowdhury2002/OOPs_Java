import java.util.Scanner;

class Area {
    public int l, w;
    public void setDim(int a, int b){
        this.l = a;
        this.w =b;    
    }
    public int getArea(int a, int b){
        int area;
        area = a *b;
        return area;    
    }
}

public class Rectangle {
    public static void main(String args[]){
        Area obj = new Area();
        Scanner sc =  new Scanner(System.in);
        obj.l = sc.nextInt();
        obj.w = sc.nextInt();
        System.out.println("The area = " + obj.getArea(obj.l, obj.w));
    }
}
