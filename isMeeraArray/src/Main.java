public class Main {
    public static void main(String[] args) {
        System.out.println(isMeeraArray(new int[] {7, 6, 10}));
    }

    private static boolean isMeeraArray(int[] a) {
        boolean isZeroFound = false;
        boolean isPrimeNumFound = false;

        for (int j : a) {
            if (isPrime(j) && !isPrimeNumFound) {
                isPrimeNumFound = true;
            }

            if (j == 0 && !isZeroFound) {
                isZeroFound = true;
            }

            if (isZeroFound && isPrimeNumFound) {
                break;
            }
        }

        return isZeroFound && isPrimeNumFound;
    }

    private static boolean isPrime(int num) {
      if(num <= 1) {
          return false;
      } else if(num == 2 || num == 3) {
          return true;
      } else if(num % 2 == 0 || num % 3 == 0) {
          return false;
      } else {
          for(int i = 5; i <= Math.sqrt(num); i += 6) {
              if(num % i == 0 || num % (i + 2) == 0) {
                  return false;
              }
          }
      }

      return true;
    }
}