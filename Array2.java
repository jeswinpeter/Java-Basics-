import java.util.*;

public class Array2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of the Array: ");
        int size = scan.nextInt();

        int array[] = new int[n];

        System.out.println("Enter elements to the Array: ");
        for(int j = 0; j < size; j++) {
            array[j] = scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a
        System.out.print("Array : [");
        for (int i = 0; i < size; i++) {
            System.out.printf("%d",array[i]);
            if(i < size-1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
}
