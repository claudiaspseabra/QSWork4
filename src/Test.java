import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student test = new Student("34UI34","Alberto Henrique Cimento",59602);
        MPark mp = new MPark();


        System.out.println("Welcome to the [Insert name of the park here]");
        System.out.println("1-Park the car.");
        System.out.println("2-Parking fee");
        System.out.println("3-Access information.");
        System.out.println("4-Exit.");

        Scanner s = new Scanner(System.in);
        short z = s.nextShort();
        while (z!=4){
            switch (z){
                case 1:
                    mp.registerStudentPark(test);
                    break;
                case 2:
                    mp.chargeParkingFee(test,100);
                    break;
                case 3:
                    System.out.println("No info");
                    break;
                default:

            }
        }
    }
}