public class CreditPaymentService {

    public double calculate(int loan, double percentPerMonth, int month) //завели функцию calculate от трех параметров
    // loan - сумма кредита (int), percent - процентная ставкаб month - количество месяцев займа
    {
        double degree = Math.pow((1+percentPerMonth),month);//вычисляем степень (1+persent)^month
        double numerator = percentPerMonth * degree; //числитель формулы коэффициента аннуитета
        double denominater = degree - 1; //знаменатель формулы коэффициента аннуитета
        double fraction = numerator / denominater; //коэффициент аннуитета
        double annuitet = loan * fraction; //расчет аннуитетного платежа
        return annuitet;

    }


}
