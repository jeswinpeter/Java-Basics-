//This code checks if the number entered by the user is odd or even (Level 00)
import java.util.Scanner;

class Check {
    //Method to check if the input is odd or even
    void inputCheck(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int a = scan.nextInt();
        scan.close();

        if(a % 2 == 0){
            System.out.print("---- " + n + " is even ----");
        }
        else {
            System.out.print("---- " + n + " is odd ----");
        }
    }
}

public class OddorEven {
    public static void main(String[] args) {

        //Creating object for class Check
        Check toCheck = new Check();

        //Calling inputCheck method
        toCheck.inputCheck();
    }
}


