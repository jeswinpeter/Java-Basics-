//This program takes 3 words and numbers from the user and prints it in a formated form
import java.util.Scanner;

public class Formating {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inString[] = new String[3];
        int inInt[] = new int[3];

        //loop to take 3 words and 3 numbers
        for(int i = 0;i < 3; i++){
            System.out.println("Enter a word: ");
            inString[i] = scan.next();
            System.out.println("Enter a number less than 1000: ");
            inInt[i] = scan.nextInt();
        }
        
        System.out.println("================================");
        //loop to print the values taken in a formated style
        for(int j = 0; j < 3; j++) {
            System.out.printf("%-15s%03d%n",inString[j],inInt[j]);
        }
        System.out.println("================================");

        scan.close();
    }
}
