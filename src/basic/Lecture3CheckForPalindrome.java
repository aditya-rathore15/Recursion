package basic;

public class Lecture3CheckForPalindrome {

    private static boolean checkForPalindrome(String str, int i) {
        if(i > str.length()/2) {
            return true;
        }

        if(str.charAt(i) != str.charAt(str.length()-i-1)) {
            return false;
        }

        return checkForPalindrome(str, i+1);
    }

    public static void main(String[] args) {
        String s = "madam";
        boolean result = checkForPalindrome(s, 0);
        System.out.println(result);
    }
}
