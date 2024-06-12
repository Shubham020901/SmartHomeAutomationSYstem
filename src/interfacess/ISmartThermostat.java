package interfacess;

public interface ISmartThermostat {

	void turnOn();
	void turnOff();
	void setTemperature(int temperature);
	void increaseTemperature();
	void decrreaseTemperature();
}
