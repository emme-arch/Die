import java.util.ArrayList;
import java.util.List;

/**
 * Created by Linkon on 12 Mar, 2020
 */
public class Die {
    private final int sides;
    private int[] probabilities;
    List<Integer> list;

    public Die(int sides, int[] probabilities) {
        this.sides = sides;
        this.probabilities = probabilities;
    }

    public Die(int sides) {
        this.sides = sides;
    }

    public void roll() {
        list = setProbabilities();
    }

    private List<Integer> setProbabilities() {
        if (probabilities == null) probabilities = new int[]{1, 1, 1, 1, 1, 1};
        if (probabilities instanceof int[]) {
            for (int number : probabilities)
                if (number < 0) throw new ArithmeticException("negative probabilities not allowed");
                if
        }
    }
}
