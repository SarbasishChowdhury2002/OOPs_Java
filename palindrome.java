import java.util.Scanner;

class Pld {
    public void checkPalindrome(int n){
        int rem,temp=n,res=0;
        while (n>0){
            rem = n % 10;
            res = (res*10)+rem;
            n =n/10;
        }
        if (temp == res){
            System.out.println(temp + " is Palindrome");        
        }
        else {
            System.out.println(temp + " is not Palindrome");
        }
    }
}

public class palindrome {
    public static void main(String args[]){
        Pld obj = new Pld();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        obj.checkPalindrome(n);
    }
}
