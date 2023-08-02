class V {
    double length, breadth, height, radius;
    public void vol(double s){
        length = s;
        System.out.println("The vloume of the cube is "+(length*length*length));
    }
    public void vol(double l, double b, double h){
        length = l;
        breadth = b;
        height = h;
        System.out.println("The vloume of the rectangular box is "+(length*breadth*height));
    }
    public void vol(double r, double h){
        radius = r;
        height = h;
        System.out.println("The vloume of the cylinder is "+(3.14*radius*radius*height));
    }
    public void area(double s){
        length = s;
        System.out.println("The total surface area of the cube is "+(6*length*length));
    }
    public void area(double l, double b, double h){
        length = l;
        breadth = b;
        height = h;
        System.out.println("The total surface area of the rectangular box is "+(2*((length*breadth)+(breadth*height)+(height*length))));
    }
    public void area(double r, double h){
        radius = r;
        height = h;
        System.out.println("The total surface area of the cylinder is "+(2*3.14*radius*(radius+height)));
    }
}

public class volume {
    public static void main(String args[]){
        V obj = new V();
        obj.vol(5.2);
        obj.vol(10.0,5.2,6.6);
        obj.vol(6.0,10.0);
        obj.area(5.2);
        obj.area(10.0,5.2,6.6);
        obj.area(6.0,10.0);    
    }
}
