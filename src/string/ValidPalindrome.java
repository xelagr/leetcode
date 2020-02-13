package string;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        for(int i = 0, j = s.length()-1; i < s.length() && j >= 0; ) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            else {
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}
