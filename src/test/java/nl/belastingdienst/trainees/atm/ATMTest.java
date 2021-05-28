package nl.belastingdienst.trainees.atm;

import io.testsmith.atm.ATM;
import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ATMTest {
    @Test
    public void ConstructingATMWithProperDefaultValuesAndtoStringMethod() {
        ATM atm = new ATM(69d);
        assertEquals("Amount balance is 69.0", atm.toString());
    }

    @Test
    public void DoesWithdrawWork() {
        //We test if the ATM object withdraws money and adjusts the balance as expected
        double initBalance = 69.0d;
        ATM atm = new ATM(initBalance);
        double balanceAfterWithdraw = atm.withdraw(4.20d);
        assertEquals(balanceAfterWithdraw, atm.getBalance(), 0.001);

    }

    @Test
    public void DoesDepositWork() {
        //We test if the ATM object despoits money and adjusts the balance as expected
    }
}
