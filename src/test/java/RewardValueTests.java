import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100.0;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), 0.001);
    }

    @Test
    void create_with_miles_value() {
        double milesValue = 10000.0;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue(), 0.001);
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100.0;
        var rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue / RewardValue.MILES_TO_CASH_RATE;
        assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.001);
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 10000.0;
        var rewardValue = new RewardValue(milesValue);
        double expectedCash = milesValue * RewardValue.MILES_TO_CASH_RATE;
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.001);
    }
}
