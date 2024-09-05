//This code impliments basic circcular Circular Queue Algorithm
import java.util.Scanner;

//The operations for the Queue are defined in the class Functions
class Functions{
    int Max_size = 6;
    int [] Queue = new int[Max_size];
    int front = -1;
    int rear = -1;

    //Enqueue operation adds input value to rear position of the Queue
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

    //Dequeue operations removes element from front position
    void dequeue() {
        if(front == -1 && rear == -1) {
            System.out.println("Can't dequeue -> The Queue is empty!!!");
        }
        else if(front == rear) {
            System.out.println(Queue[front] + " is Dequeued");
            front = -1;
            rear = -1;
        }
        else{
            System.out.println(Queue[front] + " is Dequeued");
            front = (front+1) % Max_size;
        }
    }

    //Displays elements in the Queue from front to rear
    void display() {
        if(front == -1 && rear == -1) {
            System.out.println("Can't Display -> The Queue is empty!!!");
        }
        else {
            System.out.println("----------Queue----------");
            int i = front;
            while(i != rear) {
                System.out.print(Queue[i]+"\t");
                i = (i + 1) % Max_size;
            }
            System.out.print(Queue[rear]+"\n");
            System.out.println("----------Queue----------");
        }
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);      //Scanner class object
        int option;             //Variable for the input choice
        int value;
        int check = 1;          //Variable to run the while loop

        Functions todo = new Functions();   //Creating object for the class Function

        //Menu
        System.out.println("The operations that can be performed on a Circular Queue are listed below :");
        System.out.println("1 -> Enqueue(Add element)");
        System.out.println("2 -> Dequeue(remove element)");
        System.out.println("3 -> Display");
        System.out.println("4 -> Exit");

        while (check == 1) {
            System.out.println("Enter function no. to be performed -> ");
            option = scan.nextInt();    //Takes option number entered by the user
            switch (option) {
                case 1:                 //Enqueue operation
                    System.out.println("Enter number to Enque -> ");
                    value = scan.nextInt();
                    todo.enqueue(value);
                    break;

                case 2:                 //Dequeue operation
                    todo.dequeue();
                    break;

                case 3:                 //Display operation
                    todo.display();
                    break;

                case 4:                 //Exit
                    System.out.println("==== Exiting!!! ====");
                    check = 2;
                    break;

                default:                //Invalid input
                    System.out.println("Error!!!!\nEnter a valid input");
            }
        }
    }
}

