
public class Main {

    public static void main(String[] args) {
        int check = 580; //начальный счет
        int refill = 2645; //сумма пополнения
        int final_score = check + refill; //итоговый счет

        int bonus = 0;

        if (refill >= 1100) {
            bonus = refill / 100;
        }
        System.out.println((final_score) + " Итоговый счет");
        System.out.println((bonus) + " Бонусные рубли");
    }
}