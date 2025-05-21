package dowlath.io.dsa.string;

public class Palindrome {
    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = true;
        int left = 0;
        int right = input.length() - 1;

        while (left < right){
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
        left++;
        right--;
    }
        System.out.println("Is it Palindrome   " + isPalindrome);
    }
}
