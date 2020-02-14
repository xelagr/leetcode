package string;

public class StringToInteger {
    public int myAtoi(String str) {
        long val = 0;
        int sign = 1;

        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }

        if (i < str.length()) {
            char c = str.charAt(i);
            if (c == '+') {
                i++;
            }
            else if (c == '-') {
                sign = -1;
                i++;
            }
        }
        if (i < str.length() && !Character.isDigit(str.charAt(i))) {
            return 0;
        }
        if (i < str.length() && Character.isDigit(str.charAt(i))) {
            val = sign * (str.charAt(i) - '0');
            i++;
        }
        for (; i < str.length() && Character.isDigit(str.charAt(i)); i++) {
            long newVal = val * 10 + (str.charAt(i) - '0') * sign;
            if (newVal > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (newVal < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            val = newVal;
        }

        return (int)val;
    }
}
