package tp.v5;

public interface FileImmutable<E> extends File<FileImmutable<E>,E>, IdentifiableParIteration<FileImmutable<E>,E>, RepresentableParIteration<E> {
	
	FileImmutable<E> creer(E dernier); // Fabrique d'une file formée de la file cible et 
    //   d'un nouveau dernier élément
	
	default FileImmutable<E> ajout(E dernierDansFile){ // Ajout en fin //
		return this.creer(dernierDansFile);
	}
	default FileImmutable<E> retrait(){// Retrait de premier élément //
		return this.suivants();
	}

}
