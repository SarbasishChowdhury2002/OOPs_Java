import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student {
    String name;
    int roll;
    double ygpa;
    Student (String name, int roll, double ygpa){
        this.name = name;
        this.roll = roll;
        this.ygpa = ygpa;
    }
    public void display(){
        System.out.println(this.name);
        System.out.println("Roll: "+this.roll);
        System.out.println("YGPA: "+this.ygpa);
    }
}

public class Stu {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name: ");
        String name = reader.readLine();
        System.out.println("Enter roll: ");
        int roll = Integer.parseInt(reader.readLine());
        System.out.println("Enter ygpa: ");
        double ygpa = Double.parseDouble(reader.readLine());
        Student obj = new Student(name,roll,ygpa);
        System.out.println("Student Details:");
        obj.display();
    }   
}
