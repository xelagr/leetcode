import java.util.LinkedList;

public class ReverseInteger {
    public int reverse(int x) {
        System.out.println("x = " + x);
        LinkedList<Integer> stack = new LinkedList<>();
        int sign = x >= 0 ? 1 : -1;
        x = Math.abs(x);

        while(x >= 10) {
            stack.push(x % 10);
            x /= 10;
        }
        stack.push(x);

        long r = 0;
        long exp = 1;
        while(!stack.isEmpty()) {
            Integer d = stack.pop();
            r += d * exp;
            exp *= 10;
        }
        r *= sign;
        return r > Integer.MAX_VALUE || r < Integer.MIN_VALUE ? 0 : (int)r;
    }
}
