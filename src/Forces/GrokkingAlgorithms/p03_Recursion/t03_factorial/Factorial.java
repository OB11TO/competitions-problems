package Forces.GrokkingAlgorithms.p03_Recursion.t03_factorial;

import org.testng.Assert;
import org.testng.annotations.Test;

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

         Assert.assertTrue(factorial2.isZeroOrOne(0));
         Assert.assertTrue(factorial2.isZeroOrOne(1));
         Assert.assertFalse(factorial2.isZeroOrOne(5));
     }

     @Test
     public void testFactorial() {
         Factorial factorial2 = new Factorial();

         Assert.assertEquals(120, factorial2.getFactorial(5));
     }
 }