class Avg {
    public int a,b,c;
    public void avg(int a, int b, int c){
        float res;
        res = (a+b+c) / 3;
        System.out.println("The average of "+a+", "+b+", and "+c+" is "+res);
    }
}

public class average {
    public static void main(String args[]){
        Avg obj = new Avg();
        obj.a = 10;
        obj.b = 20;
        obj.c = 30;
        obj.avg(obj.a,obj.b,obj.c);    
    }
}
