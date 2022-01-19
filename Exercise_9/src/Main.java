public class Main {

    public static void main(String[] args) {

        printYearsAndDays(561600);

    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0 ) {
            System.out.println("Invalid Value");
        }

        int wholeYears = (int) (minutes / 525600);
        long leftOver = (minutes % 525600);
        int days = (int) (leftOver / (60 * 24));



        System.out.println( wholeYears + " y and " + days + " d");
    }
}
