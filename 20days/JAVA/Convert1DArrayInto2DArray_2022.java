public class LeetCode2022 {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[0][0];
        }

        int[][] result = new int[m][n];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[index++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode2022 solution = new LeetCode2022();
        int[] original = {1, 2, 3, 4};
        int[][] result = solution.construct2DArray(original, 2, 2);
        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
