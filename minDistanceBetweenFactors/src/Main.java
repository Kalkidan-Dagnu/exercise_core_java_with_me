import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(minDistance(13013));
    }

    private static int minDistance(int num) {
        int minDis = Integer.MAX_VALUE;
        int[] factors = getFactors(num);
        for(int i = 1; i < factors.length; i++) {
            minDis = Math.min(factors[i] - factors[i - 1], minDis);
        }
        return minDis;
    }

    private static int[] getFactors(int num) {
        int[] factors = new int[num];
        int count = 0;
        for(int i = 1; i < Math.sqrt(num); i++) {
            if(num % i == 0) {
                factors[count++] = i;
                if(i != (num / i)) {
                    factors[count++] = num/i;
                }
            }
        }
        int[] result = Arrays.copyOf(factors,count);
        Arrays.sort(result);
        return result;
    }
}