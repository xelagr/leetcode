package sortsearch;

public class FirstBadVersion {
    private int badVersion;

    public FirstBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }

    public int firstBadVersion(int n) {
        int lo = 1, hi = n;
        while(lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (isBadVersion(mid)) {
                hi = mid;
            }
            else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    private boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}
