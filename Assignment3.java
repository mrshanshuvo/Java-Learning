import java.util.*;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int id;
        String title;
        double price;
        String description;
        String catgory;

        System.out.print("Enter ID : ");
        id = input.nextInt();

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter title : ");
        title = input1.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter price : ");
        price = input2.nextDouble();

        System.out.print("Enter description : ");
        description = input1.nextLine();

        System.out.print("Enter catgory : ");
        catgory = input1.nextLine();

        System.out.println("\nThe product");
        System.out.println("----------------");
        System.out.println("ID : " + id);
        System.out.println("Title : " + title);
        System.out.println("price : " + price);
        System.out.println("description : " + description);
        System.out.println("catgory : " + catgory);

        input.close();
        input1.close();
        input2.close();
    }
}
