package tp.v5;

/**
 * Interface FileImmutable.
 *
 * @param <E> the element type
 */
public interface FileImmutable<E> extends File<FileImmutable<E>,E>, IdentifiableParIteration<FileImmutable<E>,E>, RepresentableParIteration<E> {
	
	/**
	 * Creer.
	 *
	 * @param dernier 
	 * @return ajoute e en fin de file
	 */
	FileImmutable<E> creer(E dernier); // Fabrique d'une file formée de la file cible et 
    //   d'un nouveau dernier élément
	
	/* (non-Javadoc)
     * @see tp.v5.File#ajout(java.lang.Object)
     */
    default FileImmutable<E> ajout(E dernierDansFile){ // Ajout en fin //
		return this.creer(dernierDansFile);
	}
	
	/* (non-Javadoc)
	 * @see tp.v5.File#retrait()
	 */
	default FileImmutable<E> retrait(){// Retrait de premier élément //
		return this.suivants();
	}

	

}
