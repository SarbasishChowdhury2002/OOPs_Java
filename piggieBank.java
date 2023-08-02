import java.util.Scanner;

class AddAmount {
    int amount = 50;
    AddAmount(){
        System.out.println("No amount is added\nCurrent Balance = " + amount+"$");    
    }
    AddAmount(int a){
        amount += a;
        System.out.println(a+"$ is added\nCurrent Balance = "+amount+"$");    
    }
}

public class piggieBank {
    public static void main(String args[]){
        AddAmount obj1 = new AddAmount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to add: ");
        int x = sc.nextInt();
        AddAmount obj2 = new AddAmount(x);  
    }
}
