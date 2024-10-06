import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MPark {
    private ArrayList<Student> students;
    private Park parking;
    private int parked = 0;

    public MPark() {
        this.students = new ArrayList<>();
        this.parking = new Park();
    }

    public void registerStudentPark(Student student){
        if(checkParkingCapacity()){
            System.out.println("There are no spots to park.");
        }
        else{
            students.add(student);
            parked++;
            System.out.println("Student parked!");
        }
    }


    public boolean checkParkingCapacity(){
        return parked >= parking.getCapacity();
    }

    public void chargeParkingFee(Student student, int timeSpent){
        if(students.contains(student)){
            double priceParked = parking.getPrice() * timeSpent;
            student.setPriceToPay(priceParked);
            System.out.println("You need to pay: "+ priceParked + " euros for "+ timeSpent + " minutes.");
        }else{
            System.out.println("The student didnt park the car.");
        }
    }

    public void saveParkInfo() {
        try(BufferedWriter licenseInfo = new BufferedWriter(new FileWriter("AllLicenseInfo.txt"))){
            for(Student student:students){
                licenseInfo.write(student.getLicensePlate());
            }
        }catch (Exception e){
            System.out.println("Error.");
        }
    }
}
