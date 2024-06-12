package abstractClass;

import java.util.Objects;

public  abstract class AbstractSmartDevice {
	protected int deviceId;
	protected String deviceName;
	
	public abstract void turnOn();
	public abstract void turnOff();
	
	public AbstractSmartDevice(int deviceId, String deviceName) {
		super();
		this.deviceId = deviceId;
		this.deviceName = deviceName;
	}
	
	
	public int getDeviceId() {
		return deviceId;
	}
	
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	
	public String getDeviceName() {
		return deviceName;
	}
	
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	
	
	@Override
	public String toString() {
		return "AbstractSmartDevices [deviceId=" + deviceId + ", deviceName=" + deviceName + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(deviceId, deviceName);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractSmartDevice other = (AbstractSmartDevice) obj;
		return Objects.equals(deviceId, other.deviceId) && Objects.equals(deviceName, other.deviceName);
	}
	
	
	
}
