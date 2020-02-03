public class PalindromeNumber {

    // Could you solve it without converting the integer to a string?
    // more effectively
    public boolean isPalindrome(int x) {
        if (x < 0 | (x % 10 == 0 && x != 0)) return false;

        int r = 0;
        while(x > r) {
            final int mod = x % 10;
            x /= 10;
            r = r * 10 + mod;
        }
        return x == r || x == r / 10;
    }

    // Could you solve it without converting the integer to a string?
    public boolean isPalindrome2(int x) {
        if (x < 0) return false;

        int r = 0, tmp = x;
        while(tmp > 0) {
            r = r * 10 + tmp % 10;
            tmp /= 10;
        }
        return r == x;
    }

    public boolean isPalindrome3(int x) {
        if (x < 0) return false;

        String s = String.valueOf(x);
        for (int i = 0, j = s.length()-1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }
}
