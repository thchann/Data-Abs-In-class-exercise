// List all the natural numbers below 20 that are multiples of 5 or 7
// We end up with 5, 7, 10, 14, 15.
// Sum is 51.
// We will create a function that gives the sum of all the multiples of 5 or 7 for any given integer.

import java.rmi.StubNotFoundException;

public class exercise_1 {
    public static int sum(int x){
        int total = 0;
        for (int i = 1; i < x; i++){
            if (i % 5 == 0 || i % 7 == 0){
                total += i;
            }
        }
        return total;
    }

    public static void main(String[] args){
        System.out.println(sum(20));
        System.out.println(sum(21));
        System.out.println(sum(25));
        System.out.println(sum(30));
    }
}