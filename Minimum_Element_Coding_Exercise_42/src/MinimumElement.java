import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {



    public static int readInteger() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many elements you wish to include. ");
        int numberOfElements = input.nextInt();
        System.out.println("We will use " + numberOfElements + " elements in the array");
        return numberOfElements;
    }

    public static int [] readElements(int elements) {
        Scanner input = new Scanner(System.in);
        int [] nextArray = new int[elements];
        for (int i = 0; i < elements; i++) {
            System.out.println("Enter a number");
            nextArray[i] = input.nextInt();
            input.nextLine();
        }
        System.out.println(Arrays.toString(nextArray));
        return nextArray;
    }

    public static int findMin(int[] nextArray) {
        int lowestNumber = Integer.MAX_VALUE;
        for(int i = 0; i < nextArray.length; i++) {
            if (nextArray[i] < lowestNumber ) {
                lowestNumber = nextArray[i];
            }

        }

        System.out.println("The lowest number is " + lowestNumber);
        return lowestNumber;

    }
}
