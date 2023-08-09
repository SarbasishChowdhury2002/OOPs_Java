class Person {
    public String name;
    public void setName(String s){
        this.name = s;
    }
    public String getName(){
        return name;    
    }
}

class Employee extends Person {
    public double salary;
    public int yr;
    public String ins;
    
    public void setSalary(double s){
        this.salary = s;
    }
    public double getSalary(){
        return salary;    
    }

    public void setYear(int y){
        this.yr = y;
    }
    public int getYear(){
        return yr;    
    }

    public void setInsurance(String i){
        this.ins = i;
    }
    public String getInsurance(){
        return ins;    
    }
}

public class Inheritance2 {
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.setName("Sarbasish Chowdhury");
        e1.setSalary(600000);
        e1.setYear(2023);
        e1.setInsurance("AJP108216K");
        System.out.println("Employee Details:");
        System.out.println("Name: " + e1.getName());
        System.out.println("Annual Salary: " + e1.getSalary());
        System.out.println("Joining year: " + e1.getYear());
        System.out.println("Insurance Id: " + e1.getInsurance());
    }
}
