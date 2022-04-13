public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-22));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
       int  newNumber = Math.abs(number);
        while (newNumber > 0) {
            int lastDigit = newNumber % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            System.out.println(reverse);
            System.out.println(number);
            newNumber = newNumber / 10;

        }
        if (reverse == Math.abs(number)) {
            return true;
        }
        return false;


    }
}
