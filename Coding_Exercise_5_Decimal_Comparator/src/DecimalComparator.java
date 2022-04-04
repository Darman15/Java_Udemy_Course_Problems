public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double numOne, double numTwo) {

        double newOne =  numOne * 1000;
        double newTwo = numTwo * 1000;

        newOne = (int) newOne;
        newTwo = (int) newTwo;

        if (newOne == newTwo) {
            return true;
        }

        return false;
    }
}
