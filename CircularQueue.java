//This code impiments Circular Queue
import java.util.Scanner;

class Functions{
    int Max_size = 6;
    int [] Queue = new int[Max_size];
    int front = -1;
    int rear = -1;
    void enqueue(int value) {
        if(front == -1 && rear == -1) {
            front = 0;
            rear = 0;
            Queue[rear] = value;
        }

        else if ((rear + 1)  % Max_size == front) {
            System.out.println("Can't enqueue -> The Queue is full!!!");
        }

        else {
            rear = (rear + 1) % Max_size;
            Queue[rear] = value;
        }
    }
    void dequeue() {
        System.out.println("Can't dequeue -> The Queue is empty!!!");
    }
    void display() {
        System.out.println("----------Queue----------");
        System.out.println("----------Queue----------");
    }
}
public class CircularQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;
        int value;
        int check = 1;

        Functions todo = new Functions();

        //Menu
        System.out.println("The operations that can be performed on a Circular Queue are listed below :");
        System.out.println("1 -> Enqueue(Add element)");
        System.out.println("2 -> Dequeue(remove element)");
        System.out.println("3 -> Display");
        System.out.println("4 -> Exit");

        while (check == 1) {
            System.out.println("Enter function no. to be performed -> ");
            option = scan.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter number to Enque -> ");
                    value = scan.nextInt();
                    todo.enqueue(value);
                    break;

                case 2:
                    todo.dequeue();
                    break;

                case 3:
                    todo.display();
                    break;

                case 4:
                    System.out.println("==== Exiting!!! ====");
                    check = 2;
                    break;

                default:
                    System.out.println("Error!!!!\nEnter a valid input");

            }

        }
    }
}

