package tp.v5;

/**
 * Interface Identifiable.
 *
 * @param <K> the key type
 */
public interface Identifiable<K> {

	/**
	 * Est egal.
	 *
	 * @param autre un element k
	 * @return true, si les l'objet est egal à k
	 */
	boolean estEgal(K autre);

}
