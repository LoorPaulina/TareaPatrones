package Builder;

public abstract class PrestamoBuilder {
	
	private Cliente cliente;
	private float tasa;
	private float monto;
	private TipoPago pago;
	

	public void buildClient(Cliente cliente) {
		//crea cliente
	}

	public void buildTasa(float tasa) {
		//crea tasa
	}


	public void buildMonto(float monto) {
		//crea monto
	}


	public void buildPago(TipoPago pago) {
		//crea tipo pago
	}
	
	public Prestamo getPrestamo() {
		//retorna el Prestamo
	}

}




