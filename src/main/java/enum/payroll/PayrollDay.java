package payroll;

import java.math.BigDecimal;

/**
 * The Payroll enum. From Josh Bloch's Effective Java.
 */
public enum PayrollDay {
    MONDAY(PayType.WEEKDAY), TUESDAY(PayType.WEEKDAY), WEDNESDAY(PayType.WEEKDAY),
    THURSDAY(PayType.WEEKDAY), FRIDAY(PayType.WEEKDAY), SATURDAY(PayType.WEEKEND),
    SUNDAY(PayType.WEEKDAY);

    private final PayType payType;

    private PayrollDay(PayType payType) {
        this.payType = payType;
    }

    public PayType getPayType() {
        return payType;
    }

    BigDecimal pay(BigDecimal hours, BigDecimal payRate) {
        // strategy is delegating the pay type.
        return payType.pay(hours, payRate);
    }

    /**
     * The PayType strategy enum.
     */
    private enum PayType {
        WEEKDAY {
            BigDecimal overtimePay(BigDecimal hours, BigDecimal payRate) {
                // if the hours are less than 8 hours, then 0 overtime
                return hours.compareTo(HOURS_PER_SHIFT) < 0 ? new BigDecimal(0) :
                 payRate.multiply(hours.subtract(HOURS_PER_SHIFT)).divide(new BigDecimal(2));
            }
        },
        WEEKEND {
            BigDecimal overtimePay(BigDecimal hours, BigDecimal payRate) {
                // all weekend hours are overtime
                return hours.multiply(payRate).divide(new BigDecimal(2));
            }
        };

        /**
         * The hours per shift.
         */
        private static final BigDecimal HOURS_PER_SHIFT = new BigDecimal(8.00);

        /**
         * Abstract overtime pay method that is to be overriden.
         *
         * @param hours the hours of work
         * @param payRate the payrate
         * @return the overtime pay
         */
        abstract BigDecimal overtimePay(BigDecimal hours, BigDecimal payRate);

        BigDecimal pay(BigDecimal hoursWorked, BigDecimal payRate) {
            BigDecimal basePay = hoursWorked.multiply(payRate);
            return basePay.add(overtimePay(hoursWorked, payRate));
        }
    }
}
