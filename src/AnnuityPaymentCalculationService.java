public class AnnuityPaymentCalculationService {
    public double calculate(int a, double b, int c) {
        double AnnuityPaymentCalculation;
        double d = b / 1200;
        double f = 1 - Math.pow(1 + d, -c);
        AnnuityPaymentCalculation = a * d / f;
        return AnnuityPaymentCalculation;
    }

}
