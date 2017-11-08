package tp.v2;

public interface FileImmutable<E> extends File<E> {

	/* 
	 * Accesseurs
	 */
	FileImmutable<E> suivants();
	
	/*
	 * Fabriques
	 */
	FileImmutable<E> creer();
	FileImmutable<E> creer(E dernier);
	
	/*
	 * Services
	 */
	// Retourne la file plus un �l�ment � la fin
	@Override
	default FileImmutable<E> ajout(E dernierDansFile) {
		FileImmutable<E> file = creer(dernierDansFile);
		FileImmutable<E> clone = this;
		clone.ajout(file);
		return clone;
	}
	// Retourne la file moins le premier �l�ment
	@Override
	default FileImmutable<E> retrait() {
		FileImmutable<E> file = this.suivants();
		return file;
	}
	// Complexit� O(|secondeFile|)
	@Override
	default FileImmutable<E> ajout(File<E> secondeFile){
		FileImmutable<E> r = this;
		for(E e : secondeFile){
			r = r.ajout(e);
		}
		return r;
	}

}
