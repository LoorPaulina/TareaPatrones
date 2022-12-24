package factoryMethod;

public class Hydroelectric implements EnergySource{
	private int id;
    private AtomicInteger idGenerator = new AtomicInteger();
    private ArrayList<Double> energyAmount=new ArrayList<Double>();
	
	 public double popAmount() {
         if ((energyAmount == null) || (energyAmount.size() == 0))
             return 0;
         else
             return energyAmount.remove(0);
    }


	public void insertAmount(final double am) {
		energyAmount.add(am);
		
	}
	
	//demás métodos

}

