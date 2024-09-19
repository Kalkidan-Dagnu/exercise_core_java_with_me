/***
 *  A Bunker array is an array that contains the value 1 if and only if it contains a prime number. The
 * array {7, 6, 10, 1} is a Bunker array because it contains a prime number (7) and also contains a 1.
 * The array {7, 6, 10} is not a Bunker array because it contains a prime number (7) but does not
 * contain a 1. The array {6, 10, 1} is not a Bunker array because it contains a 1 but does not contain a
 * prime number.
 * It is okay if a Bunker array contains more than one value 1 and more than one prime, so the array {3,
 * 7, 1, 8, 1} is a Bunker array (3 and 7 are the primes).
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isBucker(new int[] {7, 6, 10, 1} ));
    }

    private static int isBucker(int[] nums) {
        int buckerArray = 0;
        boolean containsOne = false;
        boolean containsPrime = false;
        for(int num: nums) {
            if(isPrime(num) && !containsPrime) {
                containsPrime = true;
            }

            if(num == 1 && !containsOne) {
                containsOne = true;
            }
        }

        if(containsPrime && containsOne ) {
            buckerArray = 1;
        }
        return buckerArray;
    }

    private static boolean isPrime(int num) {
        if(num < 2)
            return false;
        if(num == 2 || num == 3)
            return true;
        if(num % 2 == 0 || num % 3 == 0)
            return false;
        for(int i = 5; i < Math.sqrt(num); i+=6) {
            if(num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}