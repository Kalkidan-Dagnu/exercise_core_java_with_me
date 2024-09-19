/**
 *  A Nice array is defined to be an array where for every value n in the array, there is also an
 * element n­1 or n+1 in the array.
 * For example, {2, 10, 9, 3} is a Nice array because
 * 2 = 3­1
 * 10 = 9+1
 * 3 = 2 + 1
 * 9 = 10 ­1
 * Other Nice arrays include {2, 2, 3, 3, 3}, {1, 1, 1, 2, 1, 1} and {0, ­1, 1}.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(isNice(new int[] {3, 4, 5, 7}));
    }

    private static int isNice(int[] nums) {
        int isNiceArray;

        for (int j : nums) {
            isNiceArray = 0;
            for (int num : nums) {
                if (j == (num + 1) || j == (num - 1)) {
                    isNiceArray = 1;
                    break;
                }
            }

            if (isNiceArray == 0) {
                return 0;
            }
        }

        return 1;
    }
}