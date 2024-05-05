import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();

        StringBuilder builder = getReversedText(text);
        System.out.println("Reversed version of your text: " + builder);

        boolean isPalindrome = isPalindrome(text, builder);
        if (isPalindrome) {
            System.out.println(text + " is palindrome!");
        } else {
            System.out.println(text + " is not palindrome!");
        }
    }

    public static StringBuilder getReversedText(String text) {
        StringBuilder builderText = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            builderText.append(text.charAt(i));
        }

        return builderText;
    }

    public static boolean isPalindrome(String text, StringBuilder reversedText) {
        return text.contentEquals(reversedText);
    }
}