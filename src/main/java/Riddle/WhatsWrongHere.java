package Riddle;

import java.util.List;

public class WhatsWrongHere {

    public void tapelTapel (int num, List<Integer> nums){
        // Value num is already defined in the scope
        nums.forEach((num1) -> System.out.println("This is " + num));
    }
}
