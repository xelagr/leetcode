package string;

import java.util.*;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charCount.merge(s.charAt(i), 1, Integer::sum);
        }
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar2(String s) {
        int index = -1;
        int[] charIndex = new int['z'-'a'+1];
        int[] indexChar = new int[s.length()];
        Arrays.fill(charIndex, -1);
        Arrays.fill(indexChar, -1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int charDigit = c - 'a';
            if(charIndex[charDigit] == -1) {
                charIndex[charDigit] = i;
                indexChar[i] = charDigit;
            }
            else {
                indexChar[charIndex[charDigit]] = -1;
            }
        }
        for (int i = 0; i < indexChar.length; i++) {
            if (indexChar[i] != -1) {
                return i;
            }
        }
        return index;
    }

    public int firstUniqChar3(String s) {
        int index = -1;
        Map<Character, Integer> charCount = new HashMap<>();
        Map<Character, Integer> charIndex = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charCount.merge(s.charAt(i), 1, Integer::sum);
            if (!charIndex.containsKey(s.charAt(i))) {
                charIndex.put(s.charAt(i), i);
            }
        }
        ArrayList<Integer> indices = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                indices.add(charIndex.get(entry.getKey()));
            }
        }
        Collections.sort(indices);
        return indices.isEmpty() ? index : indices.get(0);
    }
}
