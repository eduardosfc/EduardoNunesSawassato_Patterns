public class PercentageDiscount implements DiscountStrategy {

    private final double percent;

    public PercentageDiscount(double percent) {
        this.percent = percent;
    }

    @Override
    public double apply(double subtotal) {
        double total = subtotal * (1 - percent / 100);
        return Math.max(total, 0);
    }
}
