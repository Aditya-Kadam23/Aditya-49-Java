public class Question10 {
    public static void main(String[] args) {
        int marks = 15;
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: Z++++");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade: Z+++");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade: Z++");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Grade: Z+");
        } else {
            System.out.println("Grade: Genius");
        }
    }
}
