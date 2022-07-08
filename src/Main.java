public class Main {
    public static void main(String[] args) {
        AnnuityPaymentCalculationService service = new AnnuityPaymentCalculationService();
        System.out.println();
        System.out.println("Сумма кредита: " + 1_000_000 + " руб.");
        System.out.println("Процентная ставка: " + 9.99 + " %");
        System.out.println("Срок кредитования: " + 12 + " месяцев");
        System.out.println(Math.round(service.calculate(1_000_000, 9.99, 12)) + " руб.");

        System.out.println();
        System.out.println("Сумма кредита: " + 1_000_000 + " руб.");
        System.out.println("Процентная ставка: " + 9.99 + " %");
        System.out.println("Срок кредитования: " + 24 + " месяцев");
        System.out.println(Math.round(service.calculate(1_000_000, 9.99, 24)) + " руб.");

        System.out.println();
        System.out.println("Сумма кредита: " + 1_000_000 + " руб.");
        System.out.println("Процентная ставка: " + 9.99 + " %");
        System.out.println("Срок кредитования: " + 36 + " месяцев");
        System.out.println(Math.round(service.calculate(1_000_000, 9.99, 36)) + " руб.");
    }
}
