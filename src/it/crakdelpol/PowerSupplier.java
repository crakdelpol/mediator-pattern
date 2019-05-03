package it.crakdelpol;

public class PowerSupplier {

    private boolean isOn= false;

    public void turnOn() {
        this.setOn(true);
    }

    /**
	 * @return the isOn
	 */
	public boolean isOn() {
		return isOn;
	}

	public void turnOff() {
       this.setOn(false);
    }

}
