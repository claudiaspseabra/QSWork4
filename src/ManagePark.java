import java.util.ArrayList;
import java.util.Scanner;

public class ManagePark {

    Scanner input = new Scanner(System.in);
    private ArrayList <Student> studentList = new ArrayList<>();
    Park park = new Park();
    int capacity = park.getCapacity();

    public Student checkLicensePlate(String licensePlate) {
        if (!studentList.isEmpty()) {
            for (Student s : studentList) {
                if (s.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                    return s;
                }
            }
        }
        return null;
    }

    public void enterPark(String licensePlate) {
        if (capacity <= 500) {
            if (checkLicensePlate(licensePlate) != null) {
                Student stPaying = checkLicensePlate(licensePlate);
                System.out.println("Time?");
                int minutes = input.nextInt();
                input.nextLine();
                double toPay = ((double) minutes / 15) * park.getPrice();

                // isto não faz uma vez por mês mas pena
                double stPaid = stPaying.getPaid();
                stPaying.setPaid(stPaid + toPay);
                if (checkStudentMoney(stPaying)) {
                    double disc = park.getDiscount();
                    toPay -= toPay * (disc / 100);
                }
                System.out.printf("Student has to pay %.2f€.%n", toPay);
            } else {
                addStudent();
                enterPark(licensePlate);
            }
            capacity--;
        } else {
            System.out.println("Park is full.");
            System.out.println(capacity);
        }
    }

    public void addStudent() {
        System.out.println("Name?");
        String newName = input.nextLine();
        System.out.println("License Plate?");
        String newLP = input.nextLine();
        System.out.println("Number?");
        int newNum = input.nextInt();
        input.nextLine();

        if (checkLicensePlate(newLP) != null) {
            System.out.println("License Plate already registered.");
        } else {
            Student newStudent = new Student(newLP, newName, newNum);
            studentList.add(newStudent);
        }
    }

    public boolean checkStudentMoney(Student stPaying) {
        for (Student s : studentList) {
            if (stPaying.getPaid() < s.getPaid())
            {
                return false;
            }
        }
        return true;
    }
}