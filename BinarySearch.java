import java.util.Scanner;

class Methods {
    Scanner scan = new Scanner(System.in);
    byte size;
    int [] num_pool;
    int x;
    int temp;

    //======== Bubble Sort ========
    void bubbleSort() {
        System.out.println("Enter the size of Array -> ");
        size = scan.nextByte();
        num_pool = new int[size];

        System.out.println("Enter elements to the Array -> ");
        for(int j = 0; j < size; j++) {
            num_pool[j] = scan.nextInt();
        }

        System.out.println("------- UNSORTED -------");
        for(int j = 0; j < size; j++) {
            System.out.print(num_pool[j] + "\t");
        }
        System.out.println("");
        System.out.println("------- UNSORTED -------");

        for(int i = 0; i < size - 1; i++) {
            for(int j = 0; j < size - i - 1; j++) {
                if(num_pool[j] > num_pool[j+1]) {
                    temp = num_pool[j];
                    num_pool[j] = num_pool[j + 1];
                    num_pool[j + 1] = temp;
                }
            }
        }

        System.out.println("------- SORTED -------");
        for(int j = 0; j < size; j++) {
            System.out.print(num_pool[j]+"\t");
        }
        System.out.println("");
        System.out.println("------- SORTED -------");
    }

    //======== Binary Search ========
    void binarySearch() {
        int left = 0;
        int right = size - 1;
        int mid;
        int flag = 0;

        System.out.println("Enter value to search -> ");
        x = scan.nextInt();

        if(x < num_pool[left] || x > num_pool[right]) {
            System.out.println("!!! Number not found in the array !!!");
        }
        else {
            while (left <= right) {
                mid = (left + right) / 2;
                if (num_pool[mid] == x) {
                    flag = 1;
                    System.out.println("---- Number found in the array ----");
                    break;
                } else if (x < num_pool[mid]) {
                    right = mid - 1;
                } else if (x > num_pool[mid]) {
                    left = mid + 1;
                }
            }
            if (flag == 0) {
                System.out.println("!!! Number not found in the array !!!");
            }
        }
    }
}

public class BinarySearch {
    public static void main(String [] a) {
        Methods access = new Methods();

        access.bubbleSort();

        access.binarySearch();
    }
}
