package Facade;
public class BatterySystem {
	private int id;
	private double remAmount;
	private double capacity;
	private int numberOfChargings;
	private int maxNumberOfChargings;

	public void addCharging() {
		//añade carga basado en el tipo de eneegía a utilizar
	}

	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getRemAmount() {
		return this.remAmount;
	}

	public void setRemAmount(double remAmount) {
		this.remAmount = remAmount;
	}
	public double getCapacity() {
		return this.capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	public int getNumberOfChargings() {
		return this.numberOfChargings;
	}
	public void setNumberOfChargings(int numberOfChargings) {
		this.numberOfChargings = numberOfChargings;
	}
	public int getMaxNumberOfChargings() {
		return this.maxNumberOfChargings;
	}
	public void setMaxNumberOfChargings(int maxNumberOfChargings) {
		this.maxNumberOfChargings = maxNumberOfChargings;
	}

}