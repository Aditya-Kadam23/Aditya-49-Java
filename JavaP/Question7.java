public class Question7 {
    public static void main(String[] args) {
        char ch = 'a';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is  uppercase letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter.");
        } else {
            System.out.println(ch + "  not  letter.");
        }
    }
}
