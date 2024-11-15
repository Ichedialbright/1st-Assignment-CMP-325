public class palindrome {
    public static void main(String[] args) {
        String word = "racer";
        System.out.println(isitaPalindrome(word));
    }

    public static boolean isitaPalindrome(String word) {
        int left = 0, right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left++) != word.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
