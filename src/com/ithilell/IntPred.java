package ithilell;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class IntPred {
    public static void main(String[] args) {
        IntPredicate evenNumber = i -> i % 2 == 0;
        System.out.println(evenNumber.test(100));

        Predicate<Integer> oddNumber = i -> i % 2 == 0;
        System.out.println(oddNumber.test(100));
    }
}
