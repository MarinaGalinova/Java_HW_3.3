public class Main {
    public static void main(String[] args) {
        CreditPaymentService payment = new CreditPaymentService(); //создали переменную payment в которой можно класть
        //только объекты CreditPaymentService
        int loan = 1_000_000; //тело займа (долг)
        double percent = 0.0999; //годовая процентная ставка
        double persentPerMonth = percent / 12; //ежемесячная процентная ставка
        int month = 12; // количество месяцев
        double annuitet = payment.calculate(loan, persentPerMonth, month); //расчет аннуитетного платежа
        System.out.println("Аннуитетный платеж при займе на " + month + " месяцев: ");
        System.out.printf("%.0f", annuitet);
        System.out.println("");
        System.out.println("");

        month = 24; // количество месяцев
        annuitet = payment.calculate(loan, persentPerMonth, month); //расчет аннуитетного платежа
        System.out.println("Аннуитетный платеж при займе на " + month + " месяцев: ");
        System.out.printf("%.0f", annuitet);
        System.out.println("");
        System.out.println("");

        month = 36; // количество месяцев
        annuitet = payment.calculate(loan, persentPerMonth, month); //расчет аннуитетного платежа
        System.out.println("Аннуитетный платеж при займе на " + month + " месяцев: ");
        System.out.printf("%.0f", annuitet);
        System.out.println("");
    }


}
