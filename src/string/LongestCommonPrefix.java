package string;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int minCommonLength = Integer.MAX_VALUE;
        for (String s : strs) {
            if (s.length() < minCommonLength) {
                minCommonLength = s.length();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < minCommonLength; i++) {
            char nextChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                String s = strs[j];
                if (nextChar != s.charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(nextChar);
        }
        return sb.toString();
    }
}
