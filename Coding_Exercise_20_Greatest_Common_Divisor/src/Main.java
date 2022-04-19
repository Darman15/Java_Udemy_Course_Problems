public class Main {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int currentTop = 0;
        int match = 0;
        if (first < 10 || second < 10) {
            return -1;
        }

        for (int i = 1; i <= first; i++) {
//            System.out.println("this is an i " + i);
            for(int j = 1; j <= second; j++) {
//                System.out.println( "This is a j " + j);
                if (first % i == 0 && second % j == 0) {
                    if (i == j) {
                        match = i;
//                        System.out.println("THis is a match " + i);
                    }
                }
            }
        }


        return match;
    }
}
