package tp.v5;

import java.util.Iterator;

/**
 * Class IterateurListe.
 *
 * @param <K> the key type
 * @param <E> the element type
 */
public class IterateurListe<K extends Liste<K, E>, E> implements Iterator<E> {

	/**  La liste courante. */
	private K courant;

	/**
	 * Instantiates a new iterateur liste.
	 *
	 * @param liste the liste
	 */
	public IterateurListe(K liste) {
		this.courant = liste;
	}

	/* (non-Javadoc)
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		return !this.courant.estVide();
	}

	/* (non-Javadoc)
	 * @see java.util.Iterator#next()
	 */
	@Override
	public E next() {
		E r = this.courant.tete();
		this.courant = this.courant.reste();
		return r;
	}

}