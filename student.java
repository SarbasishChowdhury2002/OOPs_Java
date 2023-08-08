class Student {
  public String name, address;
  public int age;
  Student () {
    this.name = "unknown";
    this.age = 0;
    this.address = "not available";
  }
  public void setInfo1(String s, int a){
    this.name = s;
    this.age = a;
  }
  public void setInfo2(String s, int a, String ad){
    this.name = s;
    this.age = a;
    this.address = ad;
  }
  public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
    System.out.println(this.address);
  }
}


public class student {
  public static void main(String[] args) {
    Student a = new Student();
    a.setInfo2("Sarbasish Chowdhury", 21, "Bally, Howrah");
    a.printInfo();
  }
}
