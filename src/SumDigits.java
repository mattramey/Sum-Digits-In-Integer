public class SumDigits {
    public static void main(String[] args) throws Exception {
// display the digits wanted to be summed and concanotonate with sumDigits method
        System.out.println("The Sum of digits in 234 is " + sumDigits(234));

        System.out.println("the sum of digits in 3609 is " + sumDigits(3609));

        System.out.println("The Sum of digits in 21 is " + sumDigits(21));
    }

// define sumDigits method
        public static int sumDigits(long n){
            int sum = 0;

// use a while loop to extract digits
            while(n != 0 ){
                int digit = (int)( n % 10);

                sum += digit;

                n /= 10;

            }

              return sum;
        }
    }

