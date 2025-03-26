import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();
        String concat1 = str1.concat(str2);
        String concat2 = str2.concat(str1);
        System.out.println("Concatenation (first + second): " + concat1);
        System.out.println("Concatenation (second + first): " + concat2);

        if (concat1.equals(concat2)) {
            System.out.println("The composition of the two strings is alternating (the concatenated strings are equal).");
        } else {
            System.out.println("The composition of the two strings is not alternating (the concatenated strings are different).");
        }

        scanner.close();
    }
}
