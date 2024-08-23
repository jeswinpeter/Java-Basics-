import java.util.Scanner;
class Check {
    void input(int n){
        if(n % 2 == 0){
            System.out.print(n + " is even");
        }
        else {
            System.out.print(n + " is odd");
        }
    }
}
public class OddorEven {
    public static void main(String[] args) {
        Check obj1 = new Check();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = obj.nextInt();
        obj1.input(a);
    }
}


