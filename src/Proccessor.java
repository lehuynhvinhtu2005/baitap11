
import java.util.Scanner;

public class Proccessor {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        EMP_LIST emplist = new EMP_LIST();
        while (true) {
            System.out.println("==OPTION=="
                    + "\n1. Add new Employee"
                    + "\n2. Output"
                    + "\n3. Update"
                    + "\n4. Delete"
                    + "\n5. Find"
                    + "\n6. Total"
                    + "\n7. Exit");
            System.out.println("Choose your option: ");
            int choice = Integer.parseInt(keyboard.nextLine());
            switch (choice) {
                case 1:
                    emplist.AddNew();
                    break;
                case 2:
                    emplist.DisplayAll();
                case 3:
                    System.out.println("Enter ID you want to update: ");
                    String id = keyboard.nextLine();
                    emplist.Update(id);
                    break;
                case 4:
                    System.out.println("Enter ID you want to delete: ");
                    String idc = keyboard.nextLine();
                    emplist.Delete(idc);
                    break;
                case 5:
                    System.out.println("Enter ID you want to find");
                    String ida = keyboard.nextLine();
                    emplist.Find(ida);
                    break;
                case 6: 
                    System.out.println("Total: ");
                    emplist.DisplayTotalAmount();
                case 7:
                    System.out.println("Exiting...");
                    System.exit(5);
                    break;
            }

        }

    }
}
