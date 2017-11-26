package tp.v5;

public interface EtatFileImmutable<K,E> {
	
	E premier(); // Premier de la file
	FileImmutable<E> suivants(); // Ses suivants
	
	FileImmutable<E> creer(); // fabrique d'une file vide

}
