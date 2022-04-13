public class Main {
    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
    }

    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        if (number < 0) {
            return  -1;
        }

        int lastDigit = number % 10;
//        System.out.println(lastDigit);

        while (number > 0) {
            int digit = number % 10;

            if (number == 0) {
                break;
            }
            number = number / 10;
            sum = lastDigit + digit;
        }

    return sum;

    }
}
