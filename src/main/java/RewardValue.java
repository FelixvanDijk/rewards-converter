public class RewardValue {
    private double cashValue;
    private double milesValue;

    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    // Constructor for miles value
    public RewardValue(double milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    // Method to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value
    public double getMilesValue() {
        return milesValue;
    }
}
