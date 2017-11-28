package tp.v5;

/**
 * Interface EtatFileMutable.
 *
 * @param <K> the key type
 * @param <E> the element type
 */
public interface EtatFileMutable<K,E> {
	
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
	K suivants(); // Ses suivants
	
	/**
	 * Creer.
	 *
	 * @return crée une file mutable vide
	 */
	FileMutable<E> creer(); // fabrique d'une file vide


}
