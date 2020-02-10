package array;

import java.util.*;

public class TwoArraysIntersection {

    //complexity max(O(N), O(M)), additional space min(O(N), O(M))
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();

        int[] small, big;
        if (nums1.length < nums2.length) {
            small = nums1;
            big = nums2;
        }
        else {
            small = nums2;
            big = nums1;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < small.length; i++) {
            map.merge(small[i], 1, Integer::sum);
        }
        for (int i = 0; i < big.length; i++) {
            if (map.containsKey(big[i])) {
                Integer num = map.get(big[i]) - 1;
                if (num > 0) {
                    map.replace(big[i], num);
                }
                else {
                    map.remove(big[i]);
                }
                l.add(big[i]);
            }
        }

        int[] a = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            a[i] = l.get(i);
        }
        return a;
    }

    //complexity O(N*logN + M*logM)
    public int[] intersect2(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        sortIfNeeded(nums1);
        sortIfNeeded(nums2);
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            }
            else if (nums1[i] > nums2[j]) {
                j++;
            }
            else {
                l.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] a = new int[l.size()];
        for (i = 0; i < l.size(); i++) {
            a[i] = l.get(i);
        }
        return a;
    }

    private static void sortIfNeeded(int[] a) {
        if (isSortedDesc(a)) {
            reverse(a);
        }
        else if (!isSortedAsc(a)) {
            Arrays.sort(a);
        }
    }

    private static void reverse(int[] a) {
        for (int i = 0, j = a.length-1; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    private static boolean isSortedAsc(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i-1] > a[i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSortedDesc(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i-1] < a[i]) {
                return false;
            }
        }
        return true;
    }
}
