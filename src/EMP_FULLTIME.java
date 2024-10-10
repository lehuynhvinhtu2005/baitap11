
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EMP_FULLTIME extends EMPLOYEE {

    private double coefficientssalary;

    public EMP_FULLTIME(double coefficientssalary, String EmpID, String EmpName, Date EmpDateOfBirth, Date StartDate) {
        super(EmpID, EmpName, EmpDateOfBirth, StartDate);
        this.coefficientssalary = coefficientssalary;
    }

    public EMP_FULLTIME() {
    }

    public double getCoefficientssalary() {
        return coefficientssalary;
    }

    public void setCoefficientssalary(double coefficientssalary) {
        this.coefficientssalary = coefficientssalary;
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
        System.out.println("Enter coefficients salary: ");
        double cs = keyboard.nextDouble();
        setCoefficientssalary(cs);
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
        System.out.println("Coefficients salary: " + getCoefficientssalary());
        System.out.println("Date of birth: " + fomattedDate);
        System.out.println("Start date: " + fomattedDatee);
        System.out.println("Senior: " + CalculateSeniority());
        System.out.println("Salary: " + CalculateSalary());
    }

    @Override
    public double CalculateSalary() {
        return BASIC_SALARY * getCoefficientssalary() + CalculateAllowance();
    }

    @Override
    public double CalculateAllowance() {
        int seniority = CalculateSeniority();
        if (seniority >= 10) {
            return 1000000;
        } else if (seniority >= 5) {
            return 500000;
        }
        return 0;
    }

}
