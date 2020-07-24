package home_work_22_Jul_2020;

public class Test {

    public static void main(String[] args) {

        /*
        Epoc1: 17702197
        Epoc2: 17710962
         */

        int i = 17710962;
        int j = 17702197;
        int k1;
        int k2;
        k1 = (j-i)%j;
        k2 = i%j;

        System.out.println(((i-j)/24)%365);
        System.out.println("i%j is " + k2/24);
    }
}
