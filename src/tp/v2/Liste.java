package tp.v2;
import java.util.Iterator;

public interface Liste<E> extends Iterable<E> {
	/*
	 * Accesseurs
	 */
	
	// Indique si la liste est de type vide
	default boolean casVide() {
		return false;
	}
	// Renvoie la tete de la liste
	default E tete() {
		throw new UnsupportedOperationException();
	}
	// Renvoie la liste sans la tete
	default Liste<E> reste() {
		throw new UnsupportedOperationException();
	}
	// Indique si la liste possib
	default boolean casCons() {
		return false;
	}
	// Indique si la liste est de type cons
	default public int taille(){
		return 0;
	}
	// Indique si la liste est vide
	default public boolean estVide(){
		return this.taille() == 0;
	}
	
	/*
	 * Services
	 */
	// Renvoie un iterateur de la liste
	default Iterator<E> iterator() {
		return new IterateurListe<E>(this); // Compléter puis utiliser IterateurListe.
	}
	// Renvoie la liste dans l'ordre inverse
	default Liste<E> miroir(){
		Liste<E> newListe=vide();
		Iterator<E> iterateur=iterator();
		while (iterator().hasNext()){
			newListe=cons(iterateur.next(),newListe);
		}
		return newListe;
	}
	/*
	 * Fabriques (statiques)
	 */
	
	// Construit une liste vide
	public static <E> Liste<E> vide() {
		return new Liste<E>() {
			public boolean casVide(){
				return true;
			}
		};
	}
	
	// Construit une liste en rajoutant l'element t a une liste r
	public static <E> Liste<E> cons(E t, Liste<E> r) {
		return new Liste<E>() {
			public E tete(){
				return t;
			}
			public Liste<E> reste(){
				return r;
			}
			public boolean casCons(){
				return true;
			}
			public int taille(){
				IterateurListe<E> iterateur = new IterateurListe<E>(r);
				int taille=0;
				while (iterateur.hasNext()){
					iterateur.next();
					taille++;
				}
				return taille;
			}

		};
	}
	
}
