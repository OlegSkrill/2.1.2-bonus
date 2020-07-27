public class Bonus {
    public static void main(String[] args) {
        int balance = 400;
        int bonus;
        int refill = 3000;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }

        System.out.println(bonus);

    }

}
