import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    int[] myIntArray = {12, -10, 4, 56, -9};


        readElements(readInteger());

        System.out.println( findMin(readElements(readInteger())));


    }

    public static int[] readElements(int numOfElements) {
        int[] values = new int[numOfElements];

        for(int i = 0; i < numOfElements; i++) {
            System.out.println("Please enter the value you want at position " + i + "\r");
            values[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(values));
        return values;
    }

    public static int readInteger() {
        System.out.println("Please enter how many elements you want int the array\r");
        int numOfElements = scanner.nextInt();
        return numOfElements;

    }

    public static int findMin(int[] arr) {

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }



        return min;
    }
}
