class Shape {
    public String color;
    public boolean filled;
    Shape(){
        this.color = "green";
        this.filled = true;    
    }
    Shape(String c, boolean f){
        this.color = c;
        this.filled = f;    
    }
    public void toString(){
        if (this.filled == true){
            System.out.println("A shape with color of " + this.color + "and filled");   
        }
        else {
            System.out.println("A shape with color of " + this.color + "and not filled");
        }
    }
}

class Circle extends Shape {
    public double radi, area, peri;
    Circle(){
        this.radi = 1.0;    
    }
    public void setRadi(double r){
        this.radi = r;    
    }
    public double getRadi(){
        return radi;    
    }

    public void calArea(){
        this.area = 3.14*this.radi*this.radi;
    }

    public void calPeri(){
        this.peri = 2.0*3.14*this.radi;
    }
    @Override
    public void toString(){
        System.out.println("A circle of radius " + this.radi + super.toString())
    }
}


