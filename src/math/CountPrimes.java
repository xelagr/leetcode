package math;

import java.util.Arrays;

public class CountPrimes {
    // Sieve of Eratosthenes
    public int countPrimes(int n) {
        int count = 0;
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        for (int x = 2; x*x < n; x++) {
            if (primes[x]) {
                for (int i = x*x; i < n; i += x) {
                    primes[i] = false;
                }
            }
        }
        for (int x = 2; x < n; x++) {
            if (primes[x]) {
                count++;
            }
        }
        return count;
    }

}
