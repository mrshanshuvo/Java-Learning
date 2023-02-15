import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ID;
        String name, dept, institute;

        System.out.println("Enter Your ID: ");
        ID = input.nextInt();
        System.out.println("Enter Your Name: ");
        name = input.nextLine();
        System.out.println("Enter Your Dept Name: ");
        dept = input.nextLine();
        System.out.println("Enter Your University Name: ");
        institute = input.nextLine();

        System.out.println("ID Number: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Institute: " + institute);

        input.close();
    }
}
