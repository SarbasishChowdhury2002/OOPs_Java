// Using BufferedReader

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee {
    String name;
    int age;
    int id;
    Employee (String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public void display(){
        System.out.println(this.name);
        System.out.println(+this.age);
        System.out.println(+this.id);
    }
}

public class BufferReaderTutorial {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name: ");
        String name = reader.readLine();
        System.out.println("Enter age: ");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("Enter id: ");
        int id = Integer.parseInt(reader.readLine());
        Employee obj = new Employee(name,age,id);
        obj.display();
    }   
}

