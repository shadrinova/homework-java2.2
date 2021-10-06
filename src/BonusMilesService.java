public class BonusMilesService {
    public int calculate(int miles) {

        long amount = 10_000;
        int percent = 20;

        int price = (int) (amount / percent);
        System.out.println("Зачислено " + price + " миль");
        return percent;
    }

}