import java.util.Arrays;
import java.util.Scanner;

public class Main {
  private static  Scanner in = new Scanner(System.in);
    public static void main(String[] args) {


        int [] myIntegers = getIntegers(5);
        System.out.println(Arrays.toString(myIntegers));

        System.out.println(Arrays.toString(sortIntegers(myIntegers)));

        printArray(sortIntegers(myIntegers));
    }





    public static int [] getIntegers( int array) {
        int [] values = new int[array];

        for (int i = 0; i < values.length; i++) {
            System.out.println("Enter an integer for position " + values[i]);
            values[i] = in.nextInt();
        }
        return values;
    }

    public static int [] sortIntegers(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[1] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }

    }
}
