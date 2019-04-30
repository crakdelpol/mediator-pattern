package it.crakdelpol.test;

import it.crakdelpol.Button;
import it.crakdelpol.Fan;
import it.crakdelpol.PowerSupplier;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FanTest {
    private Fan fan;
    private Button button;
    private PowerSupplier powerSupplier;

    @Test
    public void givenTurnedOffFan_whenPressingButtonTwice_fanShouldTurnOnAndOff() {
        assertFalse(fan.getOn());

        button.press();
        assertTrue(fan.getOn());

        button.press();
        assertFalse(fan.getOn());
    }

    @Before
    public void setUp() {
        powerSupplier = new PowerSupplier();
        fan = new Fan(button, powerSupplier);
        button = new Button(fan);
    }
}