import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ManagePark manager = new ManagePark();

        System.out.println("Welcome to the Sem Erros park.");
        System.out.println("1. Enter park.");
        System.out.println("2. Add student.");
        System.out.println("0. Exit.");
        short op = input.nextShort();

        while (op!=0){
            switch (op) {
                case 1:
                    System.out.println("License Plate?");
                    String lp = input.next();
                    manager.enterPark(lp);
                    break;
                case 2:
                    manager.addStudent();
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }

            System.out.println("\nWelcome to the Sem Erros Park.");
            System.out.println("1. Enter park.");
            System.out.println("2. Add student.");
            System.out.println("0. Exit.");
            op = input.nextShort();
        }
    }
}