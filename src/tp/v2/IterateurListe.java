package tp.v2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterateurListe<E> implements Iterator<E> {

	private Liste<E> liste;
	
	// Constructeur de la classe
	public IterateurListe(Liste<E> l) {
		this.liste = l;
	}
	
	// Retourne s'il y a un prochain element dans la liste
	@Override
	public boolean hasNext() {
		return !(liste.iterator().hasNext());
	}

	// Retourne le prochain element s'il existe,
	// retourne message d'erreur sinon
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
