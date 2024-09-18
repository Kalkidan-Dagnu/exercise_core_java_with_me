public class Main {
    public static void main(String[] args) {
        System.out.println(isFibonacci(17));
    }

    private static boolean isFibonacci(int num) {
        int fib = 0, i = 0;
        while(fib < num) {
            i++;
            fib = nextFibNum(i);
        }
        return fib == num;
    }

    private static int nextFibNum(int num) {
        if(num <= 1) {
            return num;
        }

        return nextFibNum(num - 1) + nextFibNum(num - 2);
    }
}