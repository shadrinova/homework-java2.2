public class BonusMilesService {
    public int calculate(int price) {

        long amount = 10_000;
        int percent = 20;

        price = (int) (amount / percent);
        System.out.println("Зачислено " + price + " миль");
        return percent;
    }

}