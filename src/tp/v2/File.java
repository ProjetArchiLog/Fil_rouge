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
	
	// Retourne une string contenant les elements de la file
	default String representation() {
		if (this.estVide()) {
			return ("");
		}
		else {
			return ""+ premier() + " " + suivants().representation();
		}
	}

	// Retourne si deux files sont egales en comparant leurs elements deux a deux
	default boolean estEgal(File<E> file){
		if (this.taille() != file.taille()) {
			return false;
		}
		else {
			if (this.estVide() && file.estVide()) {
				return true;
			}
			else {
				return ((this.premier() == file.premier()) && (this.suivants().estEgal(file.suivants())));
			}
		}
	}
	
	
}