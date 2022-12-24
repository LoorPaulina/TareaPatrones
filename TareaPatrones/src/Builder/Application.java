package Builder;

public class Application {

	private PrestamoBuilder builder;

	public Prestamo createPrestamo(PrestamoBuilder builder) {
		builder.buildClient(//cliente);
		builder.buildMonto(//monto);
		builder.buildTasa(//tasa);
		builder.buildPago(//pago);
		
		return builder.getPrestamo();
	}

}

