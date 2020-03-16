import java.util.*;

/**
 * Created by Linkon on 12 Mar, 2020
 */
public class Die {
    private int sides;
    public int value = 1;
    ArrayList<Integer> list = new ArrayList<>();
    boolean checker = false;

    public Die(int sides, int[] probabilities) throws Exception {
        checker = true;
        int checkSum = 0;
        this.sides = sides;
        if (probabilities.length != sides)
            throw new Exception(" data is missing or over, Please check your probability");
        for (int probability : probabilities) {
            checkSum += probability;
            if (probability < 0) throw new IllegalArgumentException("negative probabilities not allowed");
        }
        if (checkSum < 1) throw new ArithmeticException("probability sum must be greater than 0");
        setProbabilities(probabilities, sides);
    }

    private void setProbabilities(int[] probabilities, int sides) {
        for (int i = 1; i <= sides; ++i) {
            if (i <= probabilities.length && probabilities[i - 1] > 1) {
                for (int j = 0; j < probabilities[i - 1]; ++j) list.add(i);
                sides = sides + (probabilities[i - 1] - 1);
            } else if (i <= probabilities.length) list.add(i);
        }
        this.sides = sides;
    }

    public Die(int sides) {
        this.sides = sides;
    }

    public void roll() {
        Random random = new Random();
        if (checker) value = list.get(random.nextInt(sides - 1) + 1);
        if (!checker) value = random.nextInt(sides - 1) + 1;
    }
}
