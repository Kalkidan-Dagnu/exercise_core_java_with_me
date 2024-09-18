
public class Main {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {4, 7, 16};
        System.out.println(isBean(arrayOfNumbers));
        System.out.println(isBeanArray(arrayOfNumbers));

    }
    private static int isBean(int[] a) {
        boolean isBeanArray = false;

        for(int i = 0; i < a.length; i++) {
            isBeanArray = false;
            for(int j = 0; j < a.length; j++) {
                if(a[i] == (a[j] + 1) || a[i] == (a[j] - 1)) {
                    isBeanArray = true;
                    break;
                }
            }

            if(!isBeanArray) {
                return 0;
            }
        }

        return 1;
    }


    /****
     * An array is defined to be a Bean array if it meets the following conditions
     *    a. If it contains a 9 then it also contains a 13.
     *    b. If it contains a 7 then it does not contain a 16.
     */

    private static int isBeanArray(int[] nums) {
        boolean contains9 = false, contains13 = false, contains7 = false, contains16 = false;

        for(int num : nums) {
            if(num == 9) contains9 = true;
            if(num == 13) contains13 = true;
            if(num == 7) contains7 = true;
            if(num == 16) contains16 = true;
        }

        if(contains9 && contains13) {
            return 1;
        }

        if(contains7 && !contains16) {
           return 1;
        }

        return 0;
    }

}