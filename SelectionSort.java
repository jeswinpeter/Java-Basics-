//This code Sorts an array entered by the user and sorts 
//it using Selection sort algorithm
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
        System.out.println("\n------- UNSORTED -------");

        int small;
        int temp;
        int i = 0;
        int j;
        while(i < size) {
            j = i + 1;
            small = i;

            while (j < size) {
                if(num_array[small] > num_array[j]) {
                    small = j;
                }
                j++;
            }

            if(i != small) {
                temp = num_array[i];
                num_array[i] = num_array[small];
                num_array[small] = temp;
            }

            i++;
        }

        System.out.println("------- SORTED -------");
        for(j = 0; j < size; j++) {
            System.out.print(num_array[j] + "\t");
        }
        System.out.println("\n------- SORTED -------");
    }
}


public class SelectionSort {
    public static void main(String [] Selection) {

        Selection sort = new Selection();

        sort.magic();
    }
}
