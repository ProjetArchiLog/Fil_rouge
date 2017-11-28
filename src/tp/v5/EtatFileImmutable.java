package tp.v5;

/**
 * Interface EtatFileImmutable.
 *
 * @param <K> the key type
 * @param <E> the element type
 */
public interface EtatFileImmutable<K,E> {
	
	/**
	 * Premier.
	 *
	 * @return le premier élément de la file
	 */
	E premier(); // Premier de la file
	
	/**
	 * Suivants.
	 *
	 * @return la sous file constitué du reste des éléments de la file
	 */
	FileImmutable<E> suivants(); // Ses suivants
	
	/**
	 * Creer.
	 *
	 * @return crée une file immutable vide
	 */
	FileImmutable<E> creer(); // fabrique d'une file vide

}
