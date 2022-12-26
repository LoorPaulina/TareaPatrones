package iterator;

public class PrestamoIterator {
	
    Prestamo[] prestamosList;
    
    // maintains curr pos of iterator over the array
    int pos = 0;
 
    // Constructor takes the array of notificationList are
    // going to iterate over.
    public  PrestamoIterator (Prestamo[] prestamosList)
    {
        this.prestamosList = prestamosList;
    }
 
    public Object next()
    {
        // return next element in the array and increment pos
    	 Prestamo prestamo =  prestamosList[pos];
        pos += 1;
        return prestamo;
    }
 
    public boolean hasNext()
    {
        if (pos >= prestamosList.length ||
        		prestamosList[pos] == null)
            return false;
        else
            return true;
    }
}
	
