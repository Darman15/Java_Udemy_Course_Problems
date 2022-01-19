public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(60));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int firstDigit = 0;
        int lastDigit = 0;
        int tempOne = number;
        int tempTwo = number;

        while (tempOne >= 9) {
            tempOne /= 10;
            firstDigit = tempOne;
        }
        lastDigit = tempTwo % 10;
        return firstDigit + lastDigit;
    }
}

