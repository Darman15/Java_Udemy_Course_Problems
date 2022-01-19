public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));

    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
//        check to see if number is greater than 0
        if ( number < 0) {
            return -1;
        }

        while (number != 0 ) {
//            grabs the lowest integer in the number
            int digit = number % 10;

//            check if even
            if (digit % 2 == 0) {
//                if even add to sum
                sum += digit;
            }
//            get the next smallest integer in the number
            number /= 10;
        }
        return sum;
    }
}
