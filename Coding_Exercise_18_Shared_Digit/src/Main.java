public class Main {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(15, 55));

    }

    public static boolean hasSharedDigit(int numOne, int numTwo) {
        if (numOne < 10 || numOne > 99 || numTwo < 10 || numTwo > 99) {
            return false;
        }

        int numOneLast = numOne % 10;
        System.out.println(numOneLast);

        int numTwoLast = numTwo % 10;
        System.out.println(numTwoLast);

        int numOneFirst = numOne / 10;
        System.out.println(numOneFirst);

        int numTwoFirst = numTwo / 10;
        System.out.println(numTwoFirst);

        if ( (numOneFirst == numTwoFirst) || (numOneFirst == numTwoLast) ) {
            return true;
        } else if ( (numOneLast == numTwoFirst) || (numOneLast == numTwoLast) ) {
            return true;
        }

    return false;
    }
}
