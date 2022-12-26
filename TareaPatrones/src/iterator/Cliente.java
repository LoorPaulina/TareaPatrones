package iterator;
import java.util.List;
public class Cliente {
	private Long id;
	private String nombre;
	private String apellido;
	private String cedula;
	private String telefono;
	private List<Prestamo> prestamos;

	public boolean equals(Object object) {
		// do Something;
		
		return true;
	}

	public String toString() {
		//do Something
		
		return null;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
}

