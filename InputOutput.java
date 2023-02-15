import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ID;
        String name, dept, institute;

        System.out.print("Enter Your ID: ");
        ID = input.nextInt();

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        name = input1.nextLine();

        System.out.print("Enter Your Dept Name: ");
        dept = input1.nextLine();

        System.out.print("Enter Your University Name: ");
        institute = input1.nextLine();

        System.out.println("ID Number: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Institute: " + institute);

        input.close();
        input1.close();
    }
}
