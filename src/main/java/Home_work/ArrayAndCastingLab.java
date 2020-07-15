package Home_work;

// Converting array of doubles into array of integers (casting)

public class ArrayAndCastingLab {

    public int[] convertToInt(double[] doubles) {

        int[] integers = new int[doubles.length];

        for (int i = 0; i <doubles.length; i++){
            integers[i] = (int) doubles[i];
        }

        return integers;
    }

}
