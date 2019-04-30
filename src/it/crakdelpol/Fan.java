package it.crakdelpol;

public class Fan {

    private Boolean isOn = false;
    private Button button;
    private PowerSupplier powerSupplier;

    public Fan(Button button, PowerSupplier powerSupplier) {
        this.button = button;
        this.powerSupplier = powerSupplier;
    }

    public Boolean getOn() {
        return isOn;
    }

    public void setOn(Boolean on) {
        isOn = on;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public PowerSupplier getPowerSupplier() {
        return powerSupplier;
    }

    public void setPowerSupplier(PowerSupplier powerSupplier) {
        this.powerSupplier = powerSupplier;
    }


    public void turnOff(){
        powerSupplier.turnOff();
        isOn = false;
    }
    public void turnOn(){
        powerSupplier.turnOn();
        isOn = true;
    }

}
