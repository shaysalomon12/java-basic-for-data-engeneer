package Home_work;

public class MyTest {
    public static void main(String[] args) {
        ArrayAndCastingLab castingLab = new ArrayAndCastingLab();

            // Declare array of doubles called doubles and populate it
            double[] doubles = {14.5, 0.4, 3.6, 70, 31.5};
            int[] ints = castingLab.convertToInt(doubles);

            // Print all elements of array ints
            for (int x: ints) {
                System.out.println(x);
            }
    }
}
