public class AnnuityPaymentCalculationService {
    public double calculate(int creditAmount, double interestRate, int loanTerms) {
        double AnnuityPaymentCalculation;
        AnnuityPaymentCalculation = creditAmount * (interestRate / 1200) / (1 - Math.pow(1 + (interestRate / 1200), -loanTerms));
        return AnnuityPaymentCalculation;
    }

}
