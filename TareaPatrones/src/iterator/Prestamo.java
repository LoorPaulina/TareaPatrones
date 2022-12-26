import java.sql.Date;
import java.util.List;
public class Prestamo {
	private Long id;
	private Date fecha;
	private Double monto;
	private String comnetario;
	private float tasa;
	private FormaPago formaPago;
	private Cliente cliente;
	private List<PagoInteres> pagos;
	private List<Abono> abonos;
	private List<Renegociacion> renegociaciones;
	public int hashCode() {
		//do Something;
	}

	public boolean equals(Object object) {
		//do Something
		return true;
	}
	public String toString() {
		//do Something
		return null;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public float getTasa() {
		return tasa;
	}
	public void setTasa(float tasa) {
		this.tasa = tasa;
	}
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}