package Homework_05_Aug_2020;

import org.reflections.Reflections;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Clock {

    @Autowired
    private List<Regime> regimes;
    private int currentRegime;

    public void modA(){
        // Using springframework to invoke all "modA" methods in classes implementing Regime interface
        // System.out.println("Clock is in modA");
        // for (Regime regime : regimes) {
        //     regime.modA();
        // }

        regimes.get(currentRegime).printRegimeName();
        regimes.get(currentRegime).modA();
    }

    public void modB(){
        // Using springframework to invoke all "modB" methods in classes implementing Regime interface
        // System.out.println("Clock is in modB");
        // for (Regime regime : regimes) {
        //    regime.modB();
        //}
        regimes.get(currentRegime).printRegimeName();
        regimes.get(currentRegime).modB();
    }

    public void modC(){
        // Advance to next regime
        if (currentRegime == regimes.size()){
            currentRegime = 0;
        }
        else {
            currentRegime++;
        }
        System.out.println("Regime was switched");
        regimes.get(currentRegime).printRegimeName();

    }

    public void print(){
        System.out.println(this.getClass().getCanonicalName());
    }

}
