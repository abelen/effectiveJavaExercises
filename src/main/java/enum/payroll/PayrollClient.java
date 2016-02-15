package payroll;

import java.math.BigDecimal;

/**
 * Payroll client program.
 */
public class PayrollClient {

    public static void main(String[] args) {
        PayrollDay payrollDay = PayrollDay.SUNDAY;
        BigDecimal pay = payrollDay.pay(new BigDecimal(8.5), new BigDecimal(30.00));
        System.out.println(pay);
    }
}