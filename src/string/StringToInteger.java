package string;

public class StringToInteger {
    public int myAtoi(String str) {
        int val = 0;

        int sign = 1;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                if (c == '+') {
                    sign = 1;
                }
                else if (c == '-') {
                    sign = -1;
                }
                else if (Character.isDigit(c)) {
                    val = val*10 + (c-'0');
                }
            }
        }

        return val;
    }
}
