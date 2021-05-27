package nl.belastingdienst.trainees.fizzbuzz;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void ExecuteFizzBuzz() {
        for (int i = 0; i <= 100; i++) {
            if (i == 0) {
                System.out.println(i);
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizzbuzz!");
            } else if (i % 3 == 0) {
                System.out.println("Fizz!");
            } else if (i % 5 == 0) {
                System.out.println("Buzz!");
            } else {
                System.out.println(i);
            }
        }
    }
}
