
import java.util.Date;

public abstract class EMPLOYEE implements IEMPLOYEE{
    private String EmpID;
    private String EmpName;
    private Date EmpDateOfBirth;
    private Date StartDate;

    public EMPLOYEE(String EmpID, String EmpName, Date EmpDateOfBirth, Date StartDate) {
        this.EmpID = EmpID;
        this.EmpName = EmpName;
        this.EmpDateOfBirth = EmpDateOfBirth;
        this.StartDate = StartDate;
    }


    public EMPLOYEE() {
    }

    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public Date getEmpDateOfBirth() {
        return EmpDateOfBirth;
    }

    public void setEmpDateOfBirth(Date EmpDateOfBirth) {
        this.EmpDateOfBirth = EmpDateOfBirth;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }
    
    public abstract void Input();
    public abstract void Output();
    public int CalculateSeniority() {
        Date currentDate = new Date();
        int years = currentDate.getYear() - StartDate.getYear();
        return years;
    }
}
