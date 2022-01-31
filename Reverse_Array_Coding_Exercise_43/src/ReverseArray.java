import java.util.Arrays;

public  class ReverseArray {


    public static void reverse(int[] inputArray) {
        System.out.println("Array = " + Arrays.toString(inputArray));
        int lastIndex = inputArray.length -1;
        System.out.println("The last index of the array is " + lastIndex + " and the value of it is " + inputArray[lastIndex]);
        int halfOfTheArray = inputArray.length/2;
        System.out.println(" the midway point of the array is " + halfOfTheArray + "and the value of that is " + inputArray[halfOfTheArray]);

        for (int i = 0; i < halfOfTheArray; i++) {
            int temp = inputArray[i];
            System.out.println("The temp now equals " + temp);
            inputArray[i] = inputArray[lastIndex -i];

            inputArray[lastIndex -i] = temp;
            System.out.println("The last index is now " + inputArray[lastIndex -i]);

        }

        System.out.println(Arrays.toString(inputArray));

        }
    }





