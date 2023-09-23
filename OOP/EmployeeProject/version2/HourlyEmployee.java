package employee.version2;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HourlyEmployee extends Employee{
    private float totalHoursWorked;
    private float ratePerHour;


    // Constructors

    public HourlyEmployee() {
        empID = 0;
        empName = "XXXXX";
        totalHoursWorked = 0;
        ratePerHour = 0;
    }
    
    public HourlyEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        totalHoursWorked = 0;
        ratePerHour = 0;
    }

    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    // Other Operations
    public double computeSalary() {
        double salary = 0;
        if(totalHoursWorked > 40) {
            salary = (40 * ratePerHour) + ((totalHoursWorked - 40) * (ratePerHour * 1.5));
        } else {
            salary = totalHoursWorked * ratePerHour;
        }
        return salary;
    }
    
    public void displayInfo() {
        System.out.println("ID: " + empID);
        System.out.println("Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Birthday: " + empBirthDate);
        System.out.println("Total Hours Worked " + totalHoursWorked);
        System.out.println("Rate Per Hour: " + ratePerHour);
        System.out.println("Salary: " + computeSalary());
    }



    // Setters and Getters
//    void setEmpName(String empName) {
//        this.empName = empName;
//    }
    
    void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }
    
    void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    float getTotalHoursWorked() {
        return totalHoursWorked;
    }
    
    float getRatePerHour() {
        return ratePerHour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "empID=" + empID + ", empName=" + empName + ", empDateHired=" + empDateHired + ", empBirthDate=" + empBirthDate + ", totalHoursWorked=" + totalHoursWorked + ", ratePerHour=" + ratePerHour + '}';
    }
}
