package main.com.teamalfa.blindvirologists.random;

import java.util.Random;

public class TrueRandom extends MyRandom{

    @Override
    public boolean YorN(double num) {
        Random r = new Random();
        double tmp = 100 * r.nextDouble();
        if(tmp >= num)
            return true;
        return false;
    }

    @Override
    public int PickRandom(int num) {
        Random r = new Random();
        return r.nextInt(num);
    }
}
