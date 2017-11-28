package tp.v5;

/**
 * Interface FileMutable.
 *
 * @param <E> the element type
 */
public interface FileMutable<E> extends File<FileMutable<E>,E>, IdentifiableParIteration<FileMutable<E>,E>, RepresentableParIteration<E> {
	
	/**
	 * Ajouter.
	 *
	 * @param element the element
	 */
	void ajouter(E element);
	
	/**
	 * Retirer.
	 */
	void retirer();
	
	/**
	 * Creer copie.
	 *
	 * @return the file mutable
	 */
	FileMutable<E> creerCopie(); // Fabrique réalisant une copie de la file
	
	/* (non-Javadoc)
	 * @see tp.v5.File#suivants()
	 */
	default FileMutable<E> suivants() { // retourne la File sans le premier Element
		FileMutable<E> r = creerCopie();
		r.retirer();
		return r;
	}
	
	/* (non-Javadoc)
	 * @see tp.v5.File#ajout(java.lang.Object)
	 */
	default FileMutable<E> ajout(E dernierDansFile) { //
		this.ajouter(dernierDansFile);
		return this;
	}


	/* (non-Javadoc)
	 * @see tp.v5.File#retrait()
	 */
	default FileMutable<E> retrait() { //
		this.retirer();
		return this;
	}
	
	/**
	 * Ajouter.
	 *
	 * @param secondeFile the seconde file
	 */
	void ajouter(FileMutable<E> secondeFile);
}
