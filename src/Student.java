public class Student {
    private String licensePlate;
    private String name;
    private int num;

    public Student(String licensePlate, String name, int num) {
        this.licensePlate = licensePlate;
        this.name = name;
        this.num = num;
    }

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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Student{" +
                "licensePlate='" + licensePlate + '\'' +
                ", name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
