
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EMP_PARTTIME extends EMPLOYEE {

    private int numberofworkdays;

    public EMP_PARTTIME(int numberofworkdays, String EmpID, String EmpName, Date EmpDateOfBirth, Date StartDate) {
        super(EmpID, EmpName, EmpDateOfBirth, StartDate);
        this.numberofworkdays = numberofworkdays;
    }

    public EMP_PARTTIME() {
    }

    public int getNumberofworkdays() {
        return numberofworkdays;
    }

    public void setNumberofworkdays(int numberofworkdays) {
        this.numberofworkdays = numberofworkdays;
    }

    @Override
    public void Input() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter ID: ");
        String id = keyboard.nextLine();
        setEmpID(id);
        System.out.println("Enter Name: ");
        String name = keyboard.nextLine();
        setEmpName(name);
        System.out.println("Enter number of workdays: ");
        int nb = keyboard.nextInt();
        setNumberofworkdays(nb);
        keyboard.nextLine();
        System.out.println("Enter Date of birth: ");
        String dateString = keyboard.nextLine();
        SimpleDateFormat fomatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date empDate = fomatter.parse(dateString);
            setEmpDateOfBirth(empDate);
        } catch (ParseException e) {
            System.out.println("Dinh dang khong hop le!!");
        }
        System.out.println("Enter Start date: ");
        String stringDate = keyboard.nextLine();
        SimpleDateFormat fomatterr = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date startdate = fomatterr.parse(stringDate);
            setEmpDateOfBirth(startdate);
        } catch (ParseException e) {
            System.out.println("Dinh dang khong hop le!!");
        }
    }

    @Override
    public void Output() {
        SimpleDateFormat fomatter = new SimpleDateFormat("dd/MM/yyyy");
        String fomattedDate = fomatter.format(getEmpDateOfBirth());
        SimpleDateFormat fomatterr = new SimpleDateFormat("dd/MM/yyyy");
        String fomattedDatee = fomatterr.format(getStartDate());
        System.out.println("ID: " + getEmpID());
        System.out.println("Name: " + getEmpName());
        System.out.println("Number of workdays: " + getNumberofworkdays());
        System.out.println("Date of birth: " + fomattedDate);
        System.out.println("Start date: " + fomattedDatee);
        System.out.println("Senior: " + CalculateSeniority());
        System.out.println("Salary: " + CalculateSalary());
    }

    @Override
    public double CalculateSalary() {
        return BASIC_SALARY * getNumberofworkdays() / 26 + CalculateAllowance();
    }

    @Override
    public double CalculateAllowance() {
        int seniority = CalculateSeniority();
        if (seniority >= 10) {
            return 500000;
        } else if (seniority >= 5) {
            return 300000;
        }
        return 0;
    }

}
