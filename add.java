class Addition {
    public int a, b;
    public void sum(){
        int s = a+b;
        System.out.println("The sum is "+ s);  
    }
}

class add {
    public static void main(String args[]){
        Addition obj = new Addition();
        obj.a = 10;
        obj.b =20;
        obj.sum();    
    }
}

