import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumIsPower(new int[] {8,8,8}));
    }

    private static boolean sumIsPower(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        return isPowerOf2(sum);
    }

    private static boolean isPowerOf2(int num) {
        return (num != 0) && ((num & (num - 1)) == 0);
    }
}