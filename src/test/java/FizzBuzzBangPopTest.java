import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzBangPopTest {

    @Test
    public void convertReturnsFizzWhenNumberIsOnlyMultipleOfThree() {
        for (int i = 0; i < 100; i++) {
            if(isMultipleOfThree(i) && !isMultipleOfFive(i) && !isPrimeNumber(i) && !isPalindrome(i)) {
                assertEquals("Fizz", FizzBuzzBangPop.convert(i));
            }
        }
    }

    @Test
    public void convertReturnsBuzzWhenNumberIsOnlyMultipleOfFive() {
        for (int i = 0; i < 100; i++) {
            if(isMultipleOfFive(i) && !isMultipleOfThree(i) && !isPrimeNumber(i) && !isPalindrome(i)) {
                assertEquals("Buzz", FizzBuzzBangPop.convert(i));
            }
        }
    }

    @Test
    public void convertReturnsPopWhenNumberIsPrimeNumberOnly() {
        for (int i = 0; i < 100; i++) {
            if(isPrimeNumber(i) && !isPalindrome(i) && !isMultipleOfThree(i) && !isMultipleOfFive(i)){
                assertEquals("Bang", FizzBuzzBangPop.convert(i));
            }
        }
    }

    @Test
    public void convertReturnsPopWhenNumberIsAPalindromeOnly() {
        for (int i = 0; i < 100; i++) {
            if(isPalindrome(i) && !isPrimeNumber(i) && !isMultipleOfFive(i) && !isMultipleOfThree(i)) {
                assertEquals("Pop", FizzBuzzBangPop.convert(i));
            }
        }
    }

    @Test
    public void convertReturnsFizzBuzzWhenNumberIsMultipleOfThreeAndFive() {
        for (int i = 0; i < 100; i++) {
            if(isMultipleOfThree(i) && isMultipleOfFive(i) && !isPrimeNumber(i) && !isPalindrome(i)) {
                assertEquals("FizzBuzz", FizzBuzzBangPop.convert(i));
            }
        }
    }

    @Test
    public void convertReturnsFizzBangWhenNumberIsMultipleOfThreeAndPrime() {
        for (int i = 0; i < 100; i++) {
            if(isMultipleOfThree(i) && !isMultipleOfFive(i) && isPrimeNumber(i) && !isPalindrome(i)) {
                assertEquals("FizzBang", FizzBuzzBangPop.convert(i));
            }
        }
    }

    @Test
    public void convertReturnsFizzPopWhenNumberIsMultipleOfThreeAndPalindrome() {
        for (int i = 0; i < 100; i++) {
            if(isMultipleOfThree(i) && !isMultipleOfFive(i) && !isPrimeNumber(i) && isPalindrome(i)) {
                assertEquals("FizzPop", FizzBuzzBangPop.convert(i));
            }
        }
    }

    @Test
    public void convertReturnsBuzzBangWhenNumberIsMultipleOfFiveAndPrime() {
        for (int i = 0; i < 100; i++) {
            if(!isMultipleOfThree(i) && isMultipleOfFive(i) && isPrimeNumber(i) && !isPalindrome(i)) {
                assertEquals("BuzzBang", FizzBuzzBangPop.convert(i));
            }
        }
    }

    @Test
    public void convertReturnsBuzzPopWhenNumberIsMultipleOfFiveAndPalindrome() {
        for (int i = 0; i < 100; i++) {
            if(!isMultipleOfThree(i) && isMultipleOfFive(i) && !isPrimeNumber(i) && isPalindrome(i)) {
                assertEquals("BuzzPop", FizzBuzzBangPop.convert(i));
            }
        }
    }

    @Test
    public void convertReturnsBangPopWhenNumberIsPrimeAndPalindrome() {
        for (int i = 0; i < 100; i++) {
            if(!isMultipleOfThree(i) && !isMultipleOfFive(i) && isPrimeNumber(i) && isPalindrome(i)) {
                assertEquals("BangPop", FizzBuzzBangPop.convert(i));
            }
        }
    }

    @Test
    public void convertReturnsFizzBuzzBangWhenNumberIsMultipleOfThreeAndFiveAndPrime() {
        for (int i = 0; i < 100; i++) {
            if(isMultipleOfThree(i) && isMultipleOfFive(i) && isPrimeNumber(i) && !isPalindrome(i)) {
                assertEquals("FizzBuzzBang", FizzBuzzBangPop.convert(i));
            }
        }
    }

    @Test
    public void convertReturnsFizzBuzzPopWhenNumberIsMultipleOfThreeAndFiveAndPrime() {
        for (int i = 0; i < 100; i++) {
            if(isMultipleOfThree(i) && isMultipleOfFive(i) && !isPrimeNumber(i) && isPalindrome(i)) {
                assertEquals("FizzBuzzPop", FizzBuzzBangPop.convert(i));
            }
        }
    }

    @Test
    public void convertReturnsFizzBangPopWhenNumberIsMultipleOfThreeAndPrimeAndPalindrome() {
        for (int i = 0; i < 100; i++) {
            if(isMultipleOfThree(i) && !isMultipleOfFive(i) && isPrimeNumber(i) && isPalindrome(i)) {
                assertEquals("FizzBangPop", FizzBuzzBangPop.convert(i));
            }
        }
    }

    @Test
    public void convertReturnsBuzzBangPopWhenNumberIsMultipleOfFiveAndPrimeAndPalindrome() {
        for (int i = 0; i < 100; i++) {
            if(!isMultipleOfThree(i) && isMultipleOfFive(i) && isPrimeNumber(i) && isPalindrome(i)) {
                assertEquals("BuzzBangPop", FizzBuzzBangPop.convert(i));
            }
        }
    }

    @Test
    public void convertReturnsFizzBuzzBangPopWhenNumberIsMultipleOfThreeAndFiveAndPrimeAndPalindrome() {
        for (int i = 0; i < 100; i++) {
            if(isMultipleOfThree(i) && isMultipleOfFive(i) && isPrimeNumber(i) && isPalindrome(i)) {
                assertEquals("FizzBuzzBangPop", FizzBuzzBangPop.convert(i));
            }
        }
    }


    private boolean isPrimeNumber(int i) {
        boolean isPrime = true;
        int j = 1;
        while(isPrime && j < i) {
            if(i % j == 0 && j!=1){
                isPrime = false;
            }
            j++;
        }
        return isPrime;
    }

    private boolean isMultipleOfThree(int i) {
        return i % 3 == 0;
    }

    private boolean isMultipleOfFive(int i) {
        return i % 5 == 0;
    }

    private boolean isPalindrome(int i) {
        String numAsString = Integer.toString(i);
        StringBuilder sb = new StringBuilder();
        String reversed = sb.append(numAsString).reverse().toString();
        return reversed.contentEquals(numAsString) && reversed.length() > 1;
    }

}
