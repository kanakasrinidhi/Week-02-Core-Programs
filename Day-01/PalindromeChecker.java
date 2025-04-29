package ClassObj;

import java.util.Scanner;

class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    void displayResult() {
        System.out.println(text + " is " + (isPalindrome() ? "a Palindrome." : "not a Palindrome."));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker(input);
        checker.displayResult();

        sc.close();
    }
}
