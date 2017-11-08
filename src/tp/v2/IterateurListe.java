package tp.v2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterateurListe<E> implements Iterator<E> {

	private Liste<E> liste;
	
	public IterateurListe(Liste<E> l) {
		this.liste = l;
	}
	@Override
	public boolean hasNext() {
		return !(liste.iterator().hasNext());
	}

	@Override
	public E next() {
		if (this.hasNext()) {
			liste = liste.reste();
			return liste.tete();
		}
		else {
			throw new NoSuchElementException("There is no next element");
        }	
	}

}
