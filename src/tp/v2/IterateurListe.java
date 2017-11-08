package tp.v2;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class IterateurListe<E> implements Iterator<E> {

	private int current;
	private List<E> myList;
	
	public IterateurListe(List<E> l) {
		this.myList = l;
		current = 0;
	}
	@Override
	public boolean hasNext() {
		return !(myList.size() == current);
	}

	@Override
	public E next() {
		if (this.hasNext()) {
			return (myList.get(current++));
		}
		else {
			throw new NoSuchElementException("There are no elements size = " + myList.size());
        }	
	}

}
