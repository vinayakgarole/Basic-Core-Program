public class FlipCoin {
    public static void main(String[] args) {

        int n = 0, h_cnt = 0, t_cnt = 0;
        double heads, tails;

        System.out.print("enter no. of times you want to flip the coin: ");

        for (int i = 0; i < n; i++) {
            double random = Math.random();
            if (random < 0.5)
                t_cnt++;
            else
                h_cnt++;
        }

        heads = h_cnt / (double) n * 100;
        tails = t_cnt / (double) n * 100;
        System.out.println("Percentage of heads");
        System.out.println("Percentage of tails");

    }

}