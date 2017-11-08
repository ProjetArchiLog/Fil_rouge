package tp.v2;

public interface FileMutable<E> extends File<E> {

	/*
	 * Accesseurs
	 */
	@Override
	// Retourne les elements restants apres avoir retire le premier element 
	default FileMutable<E> suivants(){
		this.retirer();
		return this;
	}

	void ajouter(E element);
	void retirer();
	
	/*
	 * Fabriques
	 */
	FileMutable<E> creer();
	FileMutable<E> creerCopie();
	
	/*
	 * Services
	 */
	@Override
	// Retourne une copie de la file avec l'ajout d'un element
	default FileMutable<E> ajout(E dernierDansFile) {
		this.ajouter(dernierDansFile);
		return this;
	}
	@Override
	// Retourne une copie de la file avec le retrait d'un element
	default FileMutable<E> retrait() {
		FileMutable<E> r = creerCopie();
		r.retirer();
		return this;
	}
	// Complexité O(|secondeFile|)
	@Override
	// Retourne une copie de la file avec l'ajout d'une file 
	default FileMutable<E> ajout(File<E> secondeFile) {
		FileMutable<E> r = creerCopie();
		for(E e : secondeFile){
			r.ajouter(e);
		}
		return r;
	}
	
	// Complexité en O(1).
	void ajouter(File<E> secondeFile);

}
