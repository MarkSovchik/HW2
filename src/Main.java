public class Main {
    public static void main(String[] args) {

        int ticketPrice = 13676;
        int bonusMiles;

        if (ticketPrice >= 20) {
            bonusMiles = ticketPrice / 20;
            System.out.println("Начислен бонус: " + bonusMiles);
        } else {
            bonusMiles = 0;
        }
        
        System.out.println("Количество бонусных миль: " + bonusMiles);

    }
}

