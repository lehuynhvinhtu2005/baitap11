
import java.util.ArrayList;
import java.util.Scanner;

public class EMP_LIST {

    private ArrayList<EMPLOYEE> empList;

    public EMP_LIST() {
        empList = new ArrayList<>();
    }

    public void AddNew() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("1. Add Full-Time Employee"
                + "\n2. Add Part-Time Employee");
        int choice = Integer.parseInt(keyboard.nextLine());
        EMPLOYEE employee = null;

        switch (choice) {
            case 1:
                employee = new EMP_FULLTIME();
                break;
            case 2:
                employee = new EMP_PARTTIME();
                break;
        }
        employee.Input();
        empList.add(employee);
    }
    public void DisplayAll(){
        for(int i=0; i<empList.size(); i++){
            empList.get(i).Output();
            System.out.println("Salary: " + empList.get(i).CalculateSalary());
        }
    }
    public void Update(String id) {
        for (int i = 0; i < empList.size(); i++) {
            if (empList.get(i).getEmpID().equals(id)) {
                empList.get(i).Input();
            }
        }
    }
    public double DisplayTotalAmount() {
        double totalAmount = 0;
        for (int i=0; i<empList.size(); i++) {
            totalAmount += empList.get(i).CalculateSalary();
        }
        return totalAmount;
    }

    public void Find(String id) {
        for (int i = 0; i < empList.size(); i++) {
            if (empList.get(i).getEmpID().equals(id)) {
                empList.get(i).Output();
            }
        }
    }

    public void Delete(String id) {
        for (int i = 0; i < empList.size(); i++) {
            if (empList.get(i).getEmpID().equals(id)) {
                empList.remove(i);
            }
        }
    }
}
