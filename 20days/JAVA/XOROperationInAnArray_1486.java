public class LeetCode1486 {
    public int xorOperation(int n, int start) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result ^= start + 2 * i;
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode1486 solution = new LeetCode1486();
        System.out.println(solution.xorOperation(5, 0));
        System.out.println(solution.xorOperation(4, 3));
    }
}
