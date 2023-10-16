package utils;

import java.util.Random;

public class RandomClass {

    public int RandomMethod() {
        Random random = new Random();
        return random.nextInt(25000);
    }
}
