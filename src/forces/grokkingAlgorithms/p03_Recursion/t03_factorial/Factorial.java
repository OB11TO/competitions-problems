package forces.grokkingAlgorithms.p03_Recursion.t03_factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("The factorial of 5 is " + factorial.getFactorial(5));
    }

    public int getFactorial(int number) {
        if (isZeroOrOne(number)) {
            return 1;
        }

        return number * getFactorial(number - 1);
    }

    public boolean isZeroOrOne(int number) {
        return number <= 1;
    }
}
 class Factorial2Test {
     @Test
     public void testIsZeroOrOne() {
         Factorial factorial2 = new Factorial();

         Assertions.assertTrue(factorial2.isZeroOrOne(0));
         Assertions.assertTrue(factorial2.isZeroOrOne(1));
         Assertions.assertFalse(factorial2.isZeroOrOne(5));
     }

     @Test
     public void testFactorial() {
         Factorial factorial2 = new Factorial();

         Assertions.assertEquals(120, factorial2.getFactorial(5));
     }
 }