package controller;

import abstractClass.AbstractSmartDevice;

public class SmartHomeController {

	 private AbstractSmartDevice[] devices;
	    public SmartHomeController(int capacity) {
	        devices = new AbstractSmartDevice[capacity];
	    }

	    public void addDevice(AbstractSmartDevice device) {
	        for (int i = 0; i < devices.length; i++) {
            if (devices[i] == null) {
                devices[i] = device;
                System.out.println("Device " + device.getDeviceName() + " added to the system.");
	                return;
	            }
	        }
	        System.out.println("Device array is full. Cannot add more devices.");
	    }
	    
	    public void removeDevice(int deviceId) {
	        for (int i = 0; i < devices.length; i++) {
	            if (devices[i] != null && devices[i].getDeviceId() == deviceId) {
	                devices[i] = null;
	                System.out.println("Device with ID " + deviceId + " removed from the system.");
	                return;
	            }
	        }
	        System.out.println("Device with ID " + deviceId + " not found in the system.");
	    }
	    
	    public AbstractSmartDevice findDeviceById(int deviceId) {
	        for (AbstractSmartDevice device : devices) {
	            if (device != null && device.getDeviceId() == deviceId) {
	                return device;
	            }
	        }
	        return null;
	    }

	    public void turnAllOn() {
	        for (AbstractSmartDevice device : devices) {
	            if (device != null) {
	                device.turnOn();
	            }
	        }
	    }

	    public void turnAllOff() {
	        for (AbstractSmartDevice device : devices) {
	            if (device != null) {
	                device.turnOff();
	            }
	        }
	    }

	    public void printDeviceList() {
	        System.out.println("Device List:");
	        for (AbstractSmartDevice device : devices) {
	            if (device != null) {
	                System.out.println("Device ID: " + device.getDeviceId() + ", Device Name: " + device.getDeviceName());
	            }
	        }
	    }
}
