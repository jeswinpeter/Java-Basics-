//This is an upcoming project
//Check again later
import java.util.Scanner;

class Selection {
    Scanner scan = new Scanner(System.in);
    
    //----- SELECTION SORT -----
    void magic() {
        System.out.println("Enter the size of Array -> ");
        byte size = scan.nextByte();
        int [] num_array = new int[size];

        System.out.println("Enter elements to the Array -> ");
        for(int j = 0; j < size; j++) {
            num_array[j] = scan.nextInt();
        }

        System.out.println("------- UNSORTED -------");
        for(int j = 0; j < size; j++) {
            System.out.print(num_array[j] + "\t");
        }
        System.out.println("");
        System.out.println("------- UNSORTED -------");
    }
}

public class SelectionSort {
    public static void main(String [] Selection) {

        Selection sort = new Selection();

        sort.magic();

        System.out.println("Thank you for checking out");
    }
}
