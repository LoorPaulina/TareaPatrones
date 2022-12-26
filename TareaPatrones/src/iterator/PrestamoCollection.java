package iterator;

public class PrestamoCollection implements Collection{

	Prestamo[] prestamosList;

	public Iterator createIterator() {
		return new PrestamoIterator(prestamosList);
	}

	public void addItem() {
		prestamosList.add(prestamo);
	}

}


