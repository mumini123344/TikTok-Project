package utils;

import java.util.Random;

public class RandomClass {

    public int randomMethod() {
        Random random = new Random();
        return random.nextInt(15000);
    }

}
