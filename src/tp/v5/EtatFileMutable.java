package tp.v5;

public interface EtatFileMutable<K,E> {
	
	E premier(); // Premier de la file
	K suivants(); // Ses suivants
	
	FileMutable<E> creer(); // fabrique d'une file vide


}
