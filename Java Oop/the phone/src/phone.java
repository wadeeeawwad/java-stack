public abstract class phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    public String getVersionNumber() {
		return versionNumber;
	}
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}
	public int getBatteryPercentage() {
		return batteryPercentage;
	}
	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getRingTone() {
		return RingTone;
	}
	public void setRingTone(String RingTone) {
		this.RingTone = RingTone;
	}
	private String RingTone;
    public phone(String versionNumber, int batteryPercentage, String carrier, String RingTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.RingTone = RingTone;
    }
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    // getters and setters removed for brevity. Please implement them yourself
	public String Ring() {
		// TODO Auto-generated method stub
		return null;
	}
	public String unlock() {
		// TODO Auto-generated method stub
		return null;
	}

}
