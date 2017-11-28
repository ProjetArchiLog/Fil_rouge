package tp.v5;

import java.util.Iterator;

/**
 * Class IterateurFile.
 *
 * @param <K> the key type
 * @param <E> the element type
 */
public class IterateurFile<K extends File<K,E>,E> implements Iterator<E> {

	/**  La file courante. */
	private K courant;

	/**
	 * Instantiates a new iterateur file.
	 *
	 * @param file the file
	 */
	public IterateurFile(K file) {
		this.courant = file;
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
		E r = this.courant.premier();
		this.courant = this.courant.suivants();
		return r;
	}
}
