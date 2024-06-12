package enacpasulations;

import java.util.Objects;

import abstractClass.AbstractSmartDevice;
import interfacess.ISmartLight;

public class SmartLight extends AbstractSmartDevice implements ISmartLight {
	 private boolean isOn;
	    private int brightness;
	    private String color;
	
	
	public SmartLight(int deviceId, String deviceName) {
		super(deviceId, deviceName);
		// TODO Auto-generated constructor stub
		this.brightness = 50;
        this.color = "White";
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		isOn = true;
        System.out.println("Smart Light " + getDeviceName() + " is on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		isOn = false;
        System.out.println("Smart Light " + getDeviceName() + " is off");
	}
	
	public int getBrightness() {
		return brightness;
	}

	@Override
	public void setBrightness(int level) {
		// TODO Auto-generated method stub
		brightness = level;
        System.out.println("Smart Light " + getDeviceName() + " brightness set to " + level);
	}

	public String getColor() {
		return color;
	}
	
	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;
        System.out.println("Smart Light " + getDeviceName() + " color set to " + color);
	}

	@Override
	public String toString() {
		return "SmartLight [isOn=" + isOn + ", brightness=" + brightness + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(brightness, color, isOn);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SmartLight other = (SmartLight) obj;
		return brightness == other.brightness && Objects.equals(color, other.color) && isOn == other.isOn;
	}
	
	
}
