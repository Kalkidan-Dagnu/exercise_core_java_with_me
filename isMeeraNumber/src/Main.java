import java.util.ArrayList;
import java.util.List;

/**
 * A Meera number is a number such that the number of nontrivial factors is a factor of the number.
 * For example, 6 is a Meera number because 6 has two nontrivial factors : 2 and 3. (A nontrivial factor
 * is a factor other than 1 and the number). Thus 6 has two nontrivial factors. Now, 2 is a factor of 6.
 * Thus the number of nontrivial factors is a factor of 6. Hence 6 is a Meera number. Another Meera
 * number is 30 because 30 has 2, 3, 5, 6, 10, 15 as nontrivial factors. Thus 30 has 6 nontrivial factors.
 * Note that 6 is a factor of 30. So 30 is a Meera Number. However 21 is not a Meera number. The
 * nontrivial factors of 21 are 3 and 7. Thus the number of nontrivial factors is 2. Note that 2 is not a
 * factor of 21. Therefore, 21 is not a Meera number.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isMeera(6));
    }

    private static int isMeera(int num) {
        List<Integer> factors = getFactors(num);
        for(int f : factors) {
            if(f == factors.size())
                return 1;
        }
        return 0;
    }

    private static List<Integer> getFactors(int num) {
        List<Integer> factors = new ArrayList<>();
        for(int i = 1; i < Math.sqrt(num); i++) {
            if(num % i == 0 && (i != 1) && (i != num)) {
                factors.add(i);
                if(i != (num / i))
                    factors.add(num / i);
            }
        }
        return factors;
    }
}