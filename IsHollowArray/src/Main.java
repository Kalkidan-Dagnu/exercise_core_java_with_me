public class Main {
    public static void main(String[] args) {
        System.out.println(isHollowArray(new int[] {1,2,4,9, 0,0,0,3,4, 5}));
    }

    private static int isHollowArray(int[] nums) {
        int result = 0;
        if(nums.length < 3)
            return 0;
        int zeroCount = 0, preceeding = 0, following = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                if(zeroCount == 0) {
                    preceeding = i;
                }
                ++zeroCount;
            }

            if(nums[i] != 0 && zeroCount > 0) {
                following++;
            }
        }

        if((zeroCount >= 3) && (preceeding == following))
            result = 1;

        return result;
    }
}