package it.crakdelpol;

public class Mediator {
    private Button button;
    private Fan fan;
    private PowerSupplier powerSupplier;
    // constructor, getters and setters

    public void press() {
        if (fan.getOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() {
        powerSupplier.turnOn();
    }

    public void stop() {
        powerSupplier.turnOff();
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public Fan getFan() {
        return fan;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public PowerSupplier getPowerSupplier() {
        return powerSupplier;
    }

    public void setPowerSupplier(PowerSupplier powerSupplier) {
        this.powerSupplier = powerSupplier;
    }
}
