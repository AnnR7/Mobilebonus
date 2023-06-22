
public class Main {

    public static void main(String[] args) {
        int check = 580; //начальный счет
        int refill = 1780; //сумма пополнения
        int finalScore = check + refill; //итоговый счет

        int bonus = 0;

        if (refill >= 1001) {
            bonus = refill / 100;
        }
        System.out.println((finalScore) + " Итоговый счет");
        System.out.println((bonus) + " Бонусные рубли");
    }
}
