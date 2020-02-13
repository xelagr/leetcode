package string;

public class ReverseString {
    public void reverseString(char[] s) {
        int l = s.length;
        for (int i = 0; i < l / 2; i++) {
            char tmp = s[l-i-1];
            s[l-i-1] = s[i];
            s[i] = tmp;
        }
    }
}
