/**
 * Created by Linkon on 12 Mar, 2020
 */
public class Main {
    public static void main(String[] args) {
        Die die6 = new Die(6);
        die6.roll();

        Die die20 = new Die(20);
        die20.roll();

        System.out.println(die6.value); // this would print a number between 1 and 6 inclusive
        System.out.println(die20.value); // this would print a number between 1 and 20 inclusive


    }
}
