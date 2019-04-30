package it.crakdelpol;

public class PowerSupplier {

    private boolean isOn= false;

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
       this.isOn = false;
    }
}
