/***8
 * A wave array is defined to an array which does not contain two even numbers or two odd
 * numbers in adjacent locations. So {7, 2, 9, 10, 5}, {4, 11, 12, 1, 6}, {1, 0, 5} and {2} are all wave
 * arrays. But {2, 6, 3, 4} is not a wave array because the even numbers 2 and 6 are adjacent to each
 * other.
 * Write a function named isWave that returns 1 if its array argument is a Wave array, otherwise it
 * returns 0.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(isWareArray(new int[] {2, 6, 3, 4}));
    }

    private static int isWareArray(int[] nums) {
        if(nums.length < 2) {
            return 1;
        }
        boolean isPrevEven = nums[0] % 2 == 0;
        for(int i = 1; i < nums.length; i++) {
            if((nums[i] % 2 == 0) && isPrevEven) {
                return 0;
            }
            isPrevEven = nums[i] % 2 == 0;
        }
        return 1;
    }
}