package userInterface;

import java.util.Scanner;

import abstractClass.AbstractSmartDevice;
import controller.SmartHomeController;
import enacpasulations.SmartLight;
import interfacess.ISmartCamera;
import interfacess.ISmartLight;
import interfacess.ISmartThermostat;

public class UnifiedSmartHomeUserInterface {
	private SmartHomeController controller;

	public UnifiedSmartHomeUserInterface(SmartHomeController controller) {
		this.controller = controller;
	}

	public void addDevice(AbstractSmartDevice device) {
		controller.addDevice(device);
	}

	public void removeDevice(int deviceId) {
		controller.removeDevice(deviceId);
	}

	public void turnAllOn() {
		controller.turnAllOn();
	}

	public void turnAllOff() {
		controller.turnAllOff();
	}

	public void printDeviceList() {
		controller.printDeviceList();
	}
	
		public void executeDeviceAction(int deviceId, String action) {
			AbstractSmartDevice device = controller.findDeviceById(deviceId);
			if (device == null) {
				System.out.println("Device with ID " + deviceId + " not found in system");
				return;
			}

				switch (action.toLowerCase()) {
					case "turnon":
						if (device instanceof ISmartLight) {
							((ISmartLight) device).turnOn();
						} else {
							System.out.println("Device with ID " + deviceId + " does not support 'turnOn' action");
						}
						break;
				
					case "turnoff":
						if (device instanceof ISmartLight) {
							((ISmartLight) device).turnOff();
						} else {
							System.out.println("Device with ID " + deviceId + " does not support 'turnOff' action");
						}
						break;
    
					case "setbrightness":
						if (device instanceof ISmartLight) {
							System.out.println("Please enter the brightness level:");
							Scanner sc = new Scanner(System.in);
							int brightness = sc.nextInt();
							((ISmartLight) device).setBrightness(brightness);
						} else {
							System.out.println("Device with ID " + deviceId + " does not support 'setBrightness' action");
						}
						break;
						
					case "settemperature":
						if (device instanceof ISmartThermostat) {
							System.out.println("Please enter the temperature:");
							Scanner sc = new Scanner(System.in);
							int temperature = sc.nextInt();
							((ISmartThermostat) device).setTemperature(temperature);
						} else {
							System.out.println("Device with ID " + deviceId + " does not support 'setTemperature' action");
						}
						break;
    
					case "startrecording":
						if (device instanceof ISmartCamera) {
							((ISmartCamera) device).startRecording();
						} else {
							System.out.println("Device with ID " + deviceId + " does not support 'startRecording' action");
						}
						break;
    
					case "stoprecording":
						if (device instanceof ISmartCamera) {
							((ISmartCamera) device).stopRecording();
						} else {
							System.out.println("Device with ID " + deviceId + " does not support 'stopRecording' action");
						}
						break;
    
					case "takepicture":
						if (device instanceof ISmartCamera) {
							((ISmartCamera) device).takePicture();
						} else {
							System.out.println("Device with ID " + deviceId + " does not support 'takePicture' action");
						}
						break;
					
					default:
						System.out.println("Invalid action for device with ID " + deviceId);
				}
		}



public void printMenu() {
	System.out.println("Smart Home User Interface");
	System.out.println("----------------------------");
	System.out.println("1. Add Device");
	System.out.println("2. Remove Device");
	System.out.println("3. Turn All Devices On");
	System.out.println("4. Turn All Devices Off");
	System.out.println("5. Execute Device Action");
	System.out.println("6. Device List");
	System.out.println("7. Exit");
	System.out.print("Enter your choice: ");
}


public void run() {
Scanner sc = new Scanner(System.in);
while (true) {
    printMenu();
    int choice = sc.nextInt();
    switch (choice) {
        case 1:
            System.out.print("Enter device ID: ");
            int deviceId = sc.nextInt();
            System.out.print("Enter device name: ");
            String deviceName = sc.next();
            AbstractSmartDevice device = new SmartLight(deviceId, deviceName);
            addDevice(device);
            break;
        case 2:
            System.out.print("Enter device ID: ");
            deviceId = sc.nextInt();
            removeDevice(deviceId);
            break;
        case 3:
            turnAllOn();
            break;
        case 4:
            turnAllOff();
            break;
        case 5:
            System.out.print("Enter device ID: ");
            deviceId = sc.nextInt();
            System.out.print("Enter action: ");
            String action = sc.next();
            executeDeviceAction(deviceId, action);
            break;
        case 6:
            printDeviceList();
            break;   
            
        case 7:
            System.out.println("Exiting...");
            return;
        default:
            System.out.println("Invalid choice. Please try again.");
    }
}
}
     


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartHomeController controller = new SmartHomeController(10);

		UnifiedSmartHomeUserInterface ui = new UnifiedSmartHomeUserInterface(controller);
		ui.run();
	}
}



