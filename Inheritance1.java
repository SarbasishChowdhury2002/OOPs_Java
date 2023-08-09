class Employee {
    public String name;
    public String address;
    public int age;

    public void setName(String s){
        this.name = s;
    }
    public String getName(){
        return name;    
    }

    public void setAddress(String ad){
        this.address = ad;
    }
    public String getAddress(){
        return address;    
    }

    public void setAge(int a){
        this.age = a;
    }
    public int getAge(){
        return age;    
    }
}

class Manager extends Employee {
    public String dept;
    public double salary;
    
    public void setDept(String d){
        this.dept = d;
    }
    public String getDept(){
        return dept;    
    }

    public void setSalary(double n){
        this.salary = n;
    }
    public double getSalary(){
        return salary;
    }
}

class Worker extends Employee {
    public int days;
    public double wages, salary;
    
    public void setDays(int d){
        this.days = d;
    }
    public int getDays(){
        return days;    
    }
    
    public void setWages(double w){
        this.wages = w;
    }
    public double getWages(){
        return wages;    
    }

    public double calSalary(){
        this.salary = this.days*this.wages;
        return salary;    
    }
}

public class Inheritance1 {
    public static void main(String[] args){
        Manager m = new Manager();
        Worker w = new Worker();
        m.setName("Mr. Chowdhury");
        m.setAddress("12/A JC Bose Lane, Kolkata");
        m.setAge(40);
        m.setDept("HR");
        m.setSalary(85000);
        System.out.println("Manager details:");
        System.out.println("Name: "+ m.getName());
        System.out.println("Age: "+ m.getAge());
        System.out.println("Address: "+ m.getAddress());
        System.out.println("Department: "+ m.getDept());
        System.out.println("Monthly Salary: "+ m.getSalary());

        w.setName("Mr. Pandey");
        w.setAddress("20/C ABC Road, Kolkata");
        w.setAge(30);
        w.setDays(22);
        w.setWages(1000);
        System.out.println("\nWorker details:");
        System.out.println("Name: "+ w.getName());
        System.out.println("Age: "+ w.getAge());
        System.out.println("Address: "+ w.getAddress());
        System.out.println("Monthly Salary: "+ w.calSalary());
    }
}




