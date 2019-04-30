package it.crakdelpol.test;

import it.crakdelpol.Button;
import it.crakdelpol.Fan;
import it.crakdelpol.Mediator;
import it.crakdelpol.PowerSupplier;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FanTest {

    private Fan fan;
    private Button button;

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
        this.button = new Button();
        this.fan = new Fan();
        PowerSupplier powerSupplier = new PowerSupplier();
        Mediator mediator = new Mediator();


        mediator.setButton(button);
        mediator.setFan(fan);
        mediator.setPowerSupplier(powerSupplier);

        button.setMediator(mediator);
        fan.setMediator(mediator);
    }
}