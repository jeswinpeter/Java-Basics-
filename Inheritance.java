//This code implements the concept of inheritance(Hierarchical) and parameterised constructor 
import java.util.Scanner;

//==== Superclass ====
class Employee {
    String name;
    int age;
    long phone_no;
    String Adress;
    int salary;

    //Defining constructor for superclass Employee
    Employee(String name, int age, long phone_no, String Adress, int salary) {
        this.name = name;
        this.age = age;
        this.phone_no = phone_no;
        this.Adress = Adress;
        this.salary = salary;
    }

    //Method to display details using formated print
    void display() {
        System.out.printf("| Name            ->%12s   |%n",name);
        System.out.printf("| Age             ->%12d   |%n",age);
        System.out.printf("| Phone_no        ->%12d   |%n",phone_no);
        System.out.printf("| Adress          ->%12s   |%n",Adress);
        System.out.printf("| Salary          ->%12d   |%n",salary);
    }
}

//==== Subclass 1 ====
class Officer extends Employee {
    String specialization;

    //Defining constructor for subclass -> Officer
    Officer(String name, int age, long phone_no, String Adress, int salary, String specialization) {
        super(name, age, phone_no, Adress, salary);		//Parameters of the constructor -> Officer is passed to the superclass
        this.specialization = specialization;
    }

    void disp_special() {
        System.out.printf("| Specialization  ->%12s   |%n",specialization);
        System.out.println("------------------------------------\n");
    }
}

//==== Subclass 2 ====
class Manager extends Employee {
    String department;

    //Defining constructor for subclass -> Manager
    Manager(String name, int age, long phone_no, String Adress, int salary, String department) {
        super(name, age, phone_no, Adress, salary);
        this.department = department;
    }

    void disp_dep() {
        System.out.printf("| Department      ->%12s   |%n",department);
        System.out.println("------------------------------------\n");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Getting details of the Officer
        System.out.println("Enter detail of Officer : ");
        System.out.println("Enter Name -> ");
        String name = scan.next();
        System.out.println("Enter age -> ");
        int age = scan.nextInt();
        System.out.println("Enter phone_no -> ");
        long phone_no = scan.nextLong();
        System.out.println("Enter Adress-> ");
        String Adress = scan.next();
        System.out.println("Enter salary -> ");
        int salary= scan.nextInt();
        System.out.println("Enter specialization -> ");
        String specialization = scan.next();
        System.out.println("");

        //Creating object for class -> Officer
        Officer off = new Officer(name, age, phone_no, Adress, salary, specialization);

        System.out.println("---------DETAILS OF OFFICER---------");
        off.display();			//Calling Display method of class -> "Employee" using subclass -> "Officer" object
        off.disp_special();		//Calling disp_special method of class -> Officer

        //Getting details of the Manager
        System.out.println("Enter detail of Manager : ");
        System.out.println("Enter Name -> ");
        name = scan.next();
        System.out.println("Enter age -> ");
        age = scan.nextInt();
        System.out.println("Enter phone_no -> ");
        phone_no = scan.nextLong();
        System.out.println("Enter Adress -> ");
        Adress = scan.next();
        System.out.println("Enter salary -> ");
        salary= scan.nextInt();
        System.out.println("Enter department -> ");
        String department = scan.next();
        scan.close();
        System.out.println("");

        //Creating object for class -> Manager
        Manager man = new Manager(name, age, phone_no, Adress, salary, department);

        System.out.println("---------DETAILS OF MANAGER---------");
        man.display();		//Calling Display method of class -> Employee using subclass -> Manager object
        man.disp_dep();		//Calling disp_dep method of class -> Manager
    }
}
