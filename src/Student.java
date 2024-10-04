/**
 * Class Student to describe the Student attributes such as licensePlate, name and number.
 */

public class Student {
    private String licensePlate;
    private String name;
    private int number;
    private double priceToPay= 0;
    //private String default_LicensePlate = "22-CD-31";
    //private String default_Name = "Carlos";
    //private int default_Number = 3320;

    /**
     *  Constructor with parameters
     */
    public Student(String licensePlate, String name, int number) {
        this.licensePlate = licensePlate;
        this.name = name;
        this.number = number;
    }

    /**
     * Empty constructor
     */

//    public Student(){
//        this.licensePlate = default_LicensePlate;
//        this.name = default_Name;
//        this.number = default_Number;
//    }

    /**
     *
     * Getters and setters methods
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPriceToPay(){
        return priceToPay;
    }

    public void setPriceToPay(double priceToPay){
        this.priceToPay = priceToPay;
    }
    /**
     * ToString method
     */

    @Override
    public String toString() {
        return "Student:" +
                "licensePlate='" + licensePlate + '\'' +
                ", name='" + name + '\'' +
                ", number= " + number +
                '.';
    }
}
