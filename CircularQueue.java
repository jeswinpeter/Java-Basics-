import java.util.Scanner;

int x = 5;

class Functions{
    void enqueue(value) {
        System.out.println("Can't enqueue -> The Queue is full!!!");
    }
    void dequeue() {
        System.out.println("Can't dequeue -> The Queue is empty!!!");
    }
    void displa() {
        System.out.println(----------Queue----------);
        System.out.println(----------Queue----------);
    }
}
public class CircularQueue {
    public static void main(String[] args) {
        int option;
        int value;

        System.out.println(x);

        Functions todo = new Functions();
        Scanner scan = new Scanner(System.in);

        //Menu
        System.out.println("The operations that can be performed on a Circular Queue are listed below :");
        System.out.println("1 -> Enqueue(Add element)");
        System.out.println("2 -> Dequeue(remove element)");
        System.out.println("3 -> Display");
        System.out.println("4 -> Exit");



    }
}

