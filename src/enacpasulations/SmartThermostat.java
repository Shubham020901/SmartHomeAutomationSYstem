package enacpasulations;

import java.util.Objects;

import abstractClass.AbstractSmartDevice;
import interfacess.ISmartThermostat;

public class SmartThermostat extends AbstractSmartDevice implements ISmartThermostat{

	private int temperature;
	private boolean isOn;
	
	public SmartThermostat(int deviceId, String deviceName) {
		super(deviceId, deviceName);
		// TODO Auto-generated constructor stub
		this.temperature = 22;
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

	public int getTemperature() {
		return temperature;
	}
	
	@Override
	public void setTemperature(int temperature) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
        System.out.println("Smart Thermostat " + getDeviceName() + " temperature set to " + temperature);   
	}

	@Override
	public void increaseTemperature() {
		// TODO Auto-generated method stub
		temperature++;
        System.out.println("Smart Thermostat " + getDeviceName() + " temperature increased to " + temperature);
	}

	@Override
	public void decrreaseTemperature() {
		// TODO Auto-generated method stub
		temperature--;
        System.out.println("Smart Thermostat " + getDeviceName() + " temperature decreased to " + temperature);
	}

	@Override
	public String toString() {
		return "SmartThermostat [temperature=" + temperature + ", isOn=" + isOn + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(isOn, temperature);
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
		SmartThermostat other = (SmartThermostat) obj;
		return isOn == other.isOn && temperature == other.temperature;
	}
}
