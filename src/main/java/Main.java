

/**
 * Created by Linkon on 12 Mar, 2020
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // Java

// looking at the data from the table above. this is how we would construct the weighted die

        Die dieDodgy6 = new Die(6,new int[]{1,1,1,1,1,2});
        dieDodgy6.roll();
// we can create a perfectly fair die like this

        Die dieFair6 = new Die(6,new int[]{1,1,1,1,1,1});
        dieFair6.roll();
// this is equivalent to

        Die die6 = new Die(6);
        die6.roll();

        System.out.println(dieDodgy6.value);
        System.out.println(dieFair6.value);
        System.out.println(die6.value);
    }

}
