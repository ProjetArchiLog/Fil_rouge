package tp.v5;

public interface FileMutable<E> extends File<FileMutable<E>,E>, IdentifiableParIteration<FileMutable<E>,E>, RepresentableParIteration<E> {
	
	void ajouter(E element);
	void retirer();
	
	FileMutable<E> creerCopie(); // Fabrique r�alisant une copie de la file
	
	default FileMutable<E> suivants() { //
		FileMutable<E> r = creerCopie();
		r.retirer();
		return r;
	}
	
	default FileMutable<E> ajout(E dernierDansFile) { //
		this.ajouter(dernierDansFile);
		return this;
	}


	default FileMutable<E> retrait() { //
		this.retirer();
		return this;
	}
	
	void ajouter(FileMutable<E> secondeFile);
}