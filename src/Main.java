public class Main {
    public static void main(String[] args) {

        int ticketPrice = 13676;
        int bonus = 20;

        if (bonus >= 20) {
            int Bonus = (ticketPrice / bonus);
            System.out.println("Начислен бонус: " + Bonus);
        } else {
            System.out.println("Бонус не начислен");
        }


    }
}

