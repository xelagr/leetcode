package dynamic;

//can be solved in O(logN) using {{1,1}{1,0}} matrix multiplication or Fibonacci formula
public class ClimbingStairs {
    //complexity O(N), space O(1) - can be treated as Fibonacci number
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        int first = 1, second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    //complexity O(N), space O(N)
    public int climbStairs2(int n) {
        if (n == 1) {
            return 1;
        }
        int[] ways = new int[n+1];
        ways[1] = 1;
        ways[2] = 2;
        for (int i = 3; i <= n; i++) {
            ways[i] = ways[i-1] + ways[i-2];
        }
        return ways[n];
    }

    //complexity O(N), space O(N)
    public int climbStairs3(int n) {
        return climbStairs3(n, new int[n]);
    }

    private int climbStairs3(int n, int[] memo) {
        if (n < 0) {
            return  0;
        }
        if (n == 0) {
            return 1;
        }
        if (memo[n-1] > 0) {
            return memo[n-1];
        }
        int ways = climbStairs3(n-1, memo) + climbStairs3(n-2, memo);
        memo[n-1] = ways;
        return ways;
    }

    //complexity O(2^N), space O(N)
    public int climbStairs4(int n) {
        if (n < 0) {
            return  0;
        }
        if (n == 0) {
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
}
