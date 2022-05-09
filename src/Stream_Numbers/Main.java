package Stream_Numbers;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> digits = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        Collections.sort(digits);
        for (int i = 0; i < digits.size(); i++) {
            if (digits.get(i) <= 0 || digits.get(i) % 2 != 0) {
                digits.remove(i);
                i--;
            }
        }
        for (int d : digits) {
            System.out.println(d);
        }
    }
}
