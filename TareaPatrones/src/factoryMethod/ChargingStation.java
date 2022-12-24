package factoryMethod;

public class ChargingStation {
	
	public ChargingStation(final String nam, final String[] kinds, final String[] source, final double[][] energyAmounts) {
		//demás operaciones
		
		EnergyFactory energy= new EnergyFactory();
		setSpecificAmount(energy.createEnergy(//condiciones), 0.0);
		
	}
}
