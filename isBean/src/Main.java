public class Main {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {2, 2, 3, 3, 3};
        System.out.println("Hello world!");
        System.out.println(isBean(arrayOfNumbers));

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
}