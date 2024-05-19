public class Main2 {
    public static void main(String[] args) {

        int balance = 100;
        int refill = 1000;

        System.out.println("Баланс: " + (balance + refill));

        if (refill>=1000) {
            int bonus = ( refill * 1 ) / 100;
            System.out.println("Начислен бонус: " + (bonus) + " рублей");
        } else {
            System.out.println("Бонус не начислен, так как сумма пополнения менее 1000 рублей.");
        }
    }
}
