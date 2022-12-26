package iterator;

public class ClienteIterator implements Iterator{
    Cliente[] clientesList;
    
    // maintains curr pos of iterator over the array
    int pos = 0;
 
    // Constructor takes the array of notificationList are
    // going to iterate over.
    public  ClienteIterator (Cliente[] notificationList)
    {
        this.clientesList = notificationList;
    }
 
    public Object next()
    {
        // return next element in the array and increment pos
    	 Cliente cliente =  clientesList[pos];
        pos += 1;
        return cliente;
    }
 
    public boolean hasNext()
    {
        if (pos >= clientesList.length ||
        		clientesList[pos] == null)
            return false;
        else
            return true;
    }
}
	
