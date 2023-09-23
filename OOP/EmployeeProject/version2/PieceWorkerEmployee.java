package employee.version2;

import java.util.Date;

public class PieceWorkerEmployee extends Employee{
    private int totalPiecesFinished;
    private float ratePerPiece;


    //Constructors
    public PieceWorkerEmployee() {

    }

    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0;
    }

    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    // Other Operations
    double computeSalary(){
        double Comission = 0;

        Comission = this.ratePerPiece * this.totalPiecesFinished;

        if(this.totalPiecesFinished > 100){
            int temp = (int) Comission;

            temp = (totalPiecesFinished/100) * 10;

            Comission =  Comission + temp;
        }

        return Comission;
    }


    //Setters and Getters

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }


    public void displayInfo() {
        System.out.println("--- Piece Worker Employee ---");
        System.out.println("ID: " + empID);
        System.out.println("Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Date of Birth: " + empBirthDate);
        System.out.println("Total Pieces Finished: " + totalPiecesFinished);
        System.out.println("Rate per Piece: " + ratePerPiece);
        System.out.println("Total Salary: " + computeSalary());
    }


    @Override
    public String toString() {
        return "PieceWorkerEmployee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", empDateHired=" + empDateHired +
                ", empBirthDate=" + empBirthDate +
                ", totalPiecesFinished=" + totalPiecesFinished +
                ", ratePerPiece=" + ratePerPiece +
                '}';
    }
}
