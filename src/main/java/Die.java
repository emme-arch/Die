import java.util.Random;

/**
 * Created by Linkon on 05 Mar, 2020
 */
public class Die {
    int sides;

    public Die(int sides) {
        this.sides = sides;
    }

    int value = 1;

    void roll() {
        Random random = new Random();
        value = random.nextInt(sides) + 1;
    }
}
