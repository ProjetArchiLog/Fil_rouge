package tp.v5;

import java.util.Iterator;

/**
 * Interface IdentifiableParIteration.
 *
 * @param <K> the key type
 * @param <E> the element type
 */
public interface IdentifiableParIteration<K extends Mesurable & Iterable<?>, E>
		extends Identifiable<K>, Mesurable, Iterable<E> {

	/* (non-Javadoc)
	 * @see tp.v5.Identifiable#estEgal(java.lang.Object)
	 */
	default boolean estEgal(K autre) {
		if (this.taille() != autre.taille()) {
			return false;
		}
		Iterator<E> iter1 = this.iterator();
		Iterator<?> iter2 = autre.iterator();
		while (iter1.hasNext()) {
			if (!iter1.next().equals(iter2.next())) {
				return false;
			}
		}
		return true;
	}

}