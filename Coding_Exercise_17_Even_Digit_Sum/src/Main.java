public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(0));
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        int NewNumber = number;

        if ( number < 0) {
            return -1;
        }

        while (NewNumber > 0) {
            int lastDigit = NewNumber % 10;

            NewNumber = NewNumber / 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;

            }
      }
        return sum;
    }
}
