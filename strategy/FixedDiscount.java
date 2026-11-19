public class FixedDiscount implements DiscountStrategy {

    private final double amount;

    public FixedDiscount(double amount) {
        this.amount = amount;
    }

    @Override
    public double apply(double subtotal) {
        // o total nunca pode ficar negativo
        return Math.max(subtotal - amount, 0);
    }
}
