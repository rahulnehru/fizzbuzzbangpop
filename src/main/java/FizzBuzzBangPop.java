public class FizzBuzzBangPop {


    /**
     TODO - (1) I am a sloppy developer and I need help, please implement the convert() method to:
     * if a number is a multiple of 3, convert(int i) should return "Fizz"
     * if a number is a multiple of 5, convert(int i) should return "Buzz"
     * if a number is a multiple of 15, convert(int i) should return "FizzBuzz"
     * if a number is a prime number, convert(int i) should return "Bang"
     * if a number is a palindrome with > 1 digit e.g. 44, convert(int i) should return "Pop"
     * if a number is a palindrome with > 1 digit and a multiple of 3 e.g. 33, convert(int i) should return "FizzPop"
     * if a number is a palindrome with > 1 digit and a multiple of 5 e.g. 55, convert(int i) should return "BuzzPop"
     * if a number is a palindrome and a prime number e.g. 11, convert(int i) should return "BangPop"
     * etc.
     *

     TODO - (2) Implement score() method to calculate the score of the number:
     * score = last digit of the number + bonus
     *
     * where bonus depends on the keyword:
     *  No special word = 0
     *  Fizz = 3
     *  Buzz = 5
     *  Bang = 7
     *  Pop = -5
     *
     * e.g.
     *  for input 2, (Bang) the score should be 9
     *  for input 3, (FizzBang), the score should be 13
     *  for input 4, (4), the score should be 4
     *  for input 11, (BangPop), 3
     *
     TODO - (3) Which numbers from 0 to 100 have the highest score? Print the scores and numbers
     *
     */

    static int score(int i) {

    }

    static String convert(int i) {

    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ": " + convert(i) + " score: "+ score(i));
        }
    }
}


