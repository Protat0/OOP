package employee.version2;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeProject {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFor = new SimpleDateFormat("dd/MM/yyyy");
        Date Bdate = dateFor.parse("08/07/2002");
        Date BHdate = dateFor.parse("21/02/2021");
        
        HourlyEmployee h1 = new HourlyEmployee(12, "James", Bdate, BHdate, (float) 38.2, 100);

        System.out.println("HourlyEmployee Data:");
        h1.displayInfo();
        System.out.println("================================");

        PieceWorkerEmployee PWE1 = new PieceWorkerEmployee(13, "Miko", Bdate, BHdate, 38, 50);

        System.out.println("HourlyEmployee Data:");
        PWE1.displayInfo();
        System.out.println("================================");


        CommissionEmployee CE1 = new CommissionEmployee(14, "Ernanie", Bdate, BHdate, 300000);

        System.out.println("HourlyEmployee Data:");
        CE1.displayInfo();
        System.out.println("================================");

        BasePlusCommissionEmployee BPS1 = new BasePlusCommissionEmployee(15, "Pfizer", Bdate, BHdate, 300000, 100);

        System.out.println("HourlyEmployee Data:");
        BPS1.displayInfo();
        System.out.println("================================");
    }
    
}
