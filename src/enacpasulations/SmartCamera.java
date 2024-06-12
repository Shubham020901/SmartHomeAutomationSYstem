package enacpasulations;

import java.util.Objects;

import abstractClass.AbstractSmartDevice;
import interfacess.ISmartCamera;

public class SmartCamera extends AbstractSmartDevice implements ISmartCamera{
	private boolean isRecording;
	private boolean isOn;
	
	public SmartCamera(int deviceId, String deviceName) {
		super(deviceId, deviceName);
		// TODO Auto-generated constructor stub
		 this.isRecording = false;
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
	
	public boolean isRecording() {
		return isRecording;
	}

	public void setRecording(boolean isRecording) {
		this.isRecording = isRecording;
	}


	@Override
	public void startRecording() {
		// TODO Auto-generated method stub
		isRecording = true;
        System.out.println("Smart Camera " + getDeviceName() + " recording start");
	}

	@Override
	public void stopRecording() {
		// TODO Auto-generated method stub
		isRecording = false;
        System.out.println("Smart Camera " + getDeviceName() + " recording stop");
	}

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		System.out.println("Smart Camera " + getDeviceName() + " picture is cliked");	
	}

	@Override
	public String toString() {
		return "SmartCamera [isRecording=" + isRecording + ", isOn=" + isOn + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(isOn, isRecording);
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
		SmartCamera other = (SmartCamera) obj;
		return isOn == other.isOn && isRecording == other.isRecording;
	}
}
