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
	 * @return le premier �l�ment de la file
	 */
	E premier(); // Premier de la file
	
	/**
	 * Suivants.
	 *
	 * @return la sous file constitu� du reste des �l�ments de la file
	 */
	FileImmutable<E> suivants(); // Ses suivants
	
	/**
	 * Creer.
	 *
	 * @return cr�e une file immutable vide
	 */
	FileImmutable<E> creer(); // fabrique d'une file vide

}
