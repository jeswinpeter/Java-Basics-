//This code checks if the number entered by the user is odd or even
import java.util.Scanner;

class Check {
    void input(int n){
        if(n % 2 == 0){
            System.out.print(n + " is even");
        }
        else {
            System.out.print(n + " is odd");
        }
    }
}

public class OddorEven {
    public static void main(String[] args) {
        Check toCheck = new Check();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter any number: ");
        int a = scan.nextInt();
        toCheck.input(a);
    }
}


