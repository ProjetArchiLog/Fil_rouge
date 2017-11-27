package tp.v5;

// TODO: Auto-generated Javadoc
/**
 * The Interface File.
 *
 * @param <K> the key type
 * @param <E> the element type
 */
public interface File<K extends File<K, E>, E> extends Iterable<E>,Mesurable {
	
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
	 * Est vide.
	 *
	 * @return true, si la file est vide
	 */
	default boolean estVide(){
		return (this.taille()==0);
	}
	
	/**
	 * Creer.
	 *
	 * @return crée une file vide
	 */
	K creer(); // fabrique d'une file vide
	
	/**
	 * Sujet.
	 *
	 * @return the k
	 */
	@SuppressWarnings("unchecked")
	default K sujet(){ // Alias de this
	  return (K)this;
	}
	
	/**
	 * Ajout.
	 *
	 * @param ajoute e en fin de file
	 * @return the k
	 */
	K ajout(E dernierDansFile); // Ajout en fin
	
	/**
	 * Retrait.
	 *
	 * @return retire le premier élement de la file
	 */
	K retrait(); // Retrait de premier élément
	
	/**
	 * Ajout.
	 *
	 * @param ajoute une seconde file en fin de file
	 * @return the k
	 */
	default K ajout(K secondeFile){// Ajout de la seconde file en fin de file //
		K r = this.sujet();
		for(E e : secondeFile){
			r = r.ajout(e);
		}
		return r;
	}

}
