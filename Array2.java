import java.util.*;

public class Array2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of the Array: ");
        int n = scan.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements to the Array: ");
        for(int j = 0; j < n; j++) {
            a[j] = scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a
        System.out.print("Array : [");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d",a[i]);
            if(i < n-1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
}