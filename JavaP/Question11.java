import java.util.Scanner;

public class Question11 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month number (1-12): ");
        int month = sc.nextInt();

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("This month has 31 days.");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("This month has 30 days.");
                break;
            case 2:
                System.out.println("This month has 28 or 29 days (leap year).");
                break;
            default:
                System.out.println("Invalid input! Enter a number between 1 and 12.");
        }
        sc.close();
    }
}
