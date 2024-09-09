//This is an upcoming project
//Check again later
import java.util.Scanner;

class Insertion {
    Scanner scan = new Scanner(System.in);
    
    //----- Insertion SORT -----
    void magic() {
        System.out.println("Enter the size of Array -> ");
        byte size = scan.nextByte();
        int [] num_array = new int[size];

        System.out.println("Enter elements to the Array -> ");
        for(int j = 0; j < size; j++) {
            num_array[j] = scan.nextInt();
        }

        scan.close();

        System.out.println("---------- UNSORTED ----------");
        for(int j = 0; j < size; j++) {
            System.out.print(num_array[j] + "\t");
        }
        System.out.println("");
        System.out.println("---------- UNSORTED ----------");
    }
}

public class InsertionSort {
    public static void main(String [] Insertion) {
        
        Insertion sort = new Insertion();

        sort.magic();

        System.out.println("Thank you for checking out");
    }
}
