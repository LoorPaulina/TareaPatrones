package iterator;

public class ClienteCollection implements Collection{
	
	Cliente[] clientesList;

	public Iterator createIterator() {
		return new ClienteIterator(clientesList);
	}

	public void addItem() {
		clientesList.add(cliente);
	}

}

