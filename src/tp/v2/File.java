package tp.v2;

public interface File<E> extends Iterable<E> {

	/*
	 * Accesseurs
	 */
	E premier();
	File<E> suivants();
	
	default boolean estVide() {
		return this.taille() == 0;
	}
	int taille();
	
	/*
	 * Fabriques
	 */
	File<E> creer();
	
	/*
	 * Services
	 */
	File<E> ajout(E dernierDansFile);
	File<E> retrait();
	File<E> ajout(File<E> secondeFile);
	
	// Retourne les elements de la file de maniere recursive
	default String representation() {
		if (this.estVide()) {
			return ("");
		}
		else {
			return ""+ premier() + " " + suivants().representation();
		}
	}

	// Regarde si les elements des deux files sont egaux deux a deux.
	// Methode recursive
	default boolean estEgal(File<E> file){
		if (this.estVide() && !file.estVide()) {
			return false;
		}
		if (!this.estVide() && file.estVide()) {
			return false;
		}
		if (this.estVide() && file.estVide()) {
			return true;
		}
		else {
			return ((this.premier() == file.premier()) && (this.suivants().estEgal(file.suivants())));
		}
	}
	
	
}