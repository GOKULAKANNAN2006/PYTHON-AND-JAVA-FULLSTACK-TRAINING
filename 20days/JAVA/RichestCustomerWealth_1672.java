public class LeetCode1672 {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] customer : accounts) {
            int wealth = 0;
            for (int amount : customer) {
                wealth += amount;
            }
            maxWealth = Math.max(maxWealth, wealth);
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        LeetCode1672 solution = new LeetCode1672();
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(solution.maximumWealth(accounts));
    }
}
