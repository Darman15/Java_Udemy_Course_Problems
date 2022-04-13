public class Main {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(999, 22, 72));


    }


    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        }
        return true;
    }



    public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree) {
        if (!isValid(numOne) || !isValid(numTwo) || !isValid(numThree)) {
            return false;
        }

        int numOneLast = numOne % 10;
        System.out.println(numOneLast);

        int numTwoLast = numTwo % 10;
        System.out.println(numTwoLast);

        int numThreeLast = numThree % 10;
        System.out.println(numThreeLast);

        if (numOneLast == numTwoLast || numOneLast == numThreeLast) {
            return true;
        }
        else if (numTwoLast == numOneLast || numTwoLast == numThreeLast) {
            return true;
        }

        else if (numThreeLast == numOneLast || numThreeLast == numTwoLast) {
            return true;
        }

        return false;
    }
}
