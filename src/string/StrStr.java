package string;

public class StrStr {
    // slow, complexity is O(N*M)
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            int k = 0;
            int j = i;
            while (j < haystack.length() && k < needle.length() && haystack.charAt(j) == needle.charAt(k)) {
                j++;
                k++;
            }
            if (k == needle.length()) {
                return j - k;
            }
        }
        return -1;
    }
}
