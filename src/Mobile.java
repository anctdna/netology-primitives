public class Mobile {
    public static void main(String[] args) {

        int account = 100;
        int amount = 1001;
        int bonus = amount / 100;

        if (amount > 1000) {
            System.out.println("Получено бонусов: " + bonus);
            System.out.println("Сумма на вашем счете: " + (account + amount + bonus) + " рублей");
        } else {
            System.out.println("Сумма на вашем счете " + (account + amount) + " рублей");
        }
    }
}
