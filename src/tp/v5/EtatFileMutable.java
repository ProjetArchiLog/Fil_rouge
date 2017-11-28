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
	 * @return le premier �l�ment de la file
	 */
	E premier(); // Premier de la file
	
	/**
	 * Suivants.
	 *
	 * @return la sous file constitu� du reste des �l�ments de la file
	 */
	K suivants(); // Ses suivants
	
	/**
	 * Creer.
	 *
	 * @return cr�e une file mutable vide
	 */
	FileMutable<E> creer(); // fabrique d'une file vide


}
