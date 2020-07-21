package lab0;

public class PrintArray<array> {

    public static void main(String[] args) {

        // Declare array1 as array of integers
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        // For Loop new-style
        for (int element : array1) {
            System.out.println(element);
        }

        // For Loop old-style
        /*int i = 0;
        for (i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }*/
    }

}
