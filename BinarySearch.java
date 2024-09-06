import java.util.Scanner;

class Methods {
    byte size;
    int [] num_pool;
    int x;
    int temp;

    //===== Bubble Sort ======
    void bubbleSort() {
        for(int i = 0; i < size - 1; i++) {
            for(int j = 0; j < size - i - 1; j++) {
                if(num_pool[j] > num_pool[j+1]) {
                    temp = num_pool[j];
                    num_pool[j] = num_pool[j + 1];
                    num_pool[j + 1] = temp;
                }
            }
        }
    }

    //===== Binary Search =====
    int left = 0;
    int right = size - 1;
    int mid;
    String result = "Something is Wrong!!";
    String binarySearch() {
        if(x < num_pool[left] || x > num_pool[right]) {
            result = "Number not found in the array";
            return result;
        }
        while (left <= right) {
            mid = (left + right)/2;
            if(num_pool[mid] == x) {
                result = "---- Number Found ----";
                return result;
            }
            else if (x < num_pool[mid]) {
                right = mid - 1;
            }
            else if(x > num_pool[mid]) {
                left = mid + 1;
            }
        }
        return result;
    }
}

public class BinarySearch {
    public static void main(String [] a) {
        Scanner scan = new Scanner(System.in);
        Methods access = new Methods();

        System.out.println("Enter the size of Array -> ");
        access.size = scan.nextByte();
        access.num_pool = new int[access.size];

        System.out.println("Enter elements to the Array -> ");
        for(int j = 0; j < access.size; j++) {
            access.num_pool[j] = scan.nextInt();
        }

        System.out.println("Enter value to search -> ");
        access.x = scan.nextInt();

        access.bubbleSort();
        access.binarySearch();
    }
}
