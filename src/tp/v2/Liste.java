package tp.v2;
import java.util.Iterator;

public interface Liste<E> extends Iterable<E> {
	/*
	 * Accesseurs
	 */
	default boolean casVide() {
		return false;
	}
	default E tete() {
		throw new UnsupportedOperationException();
	}
	default Liste<E> reste() {
		throw new UnsupportedOperationException();
	}
	default boolean casCons() {
		return false;
	}
	default public int taille(){
		return 0;
	}
	default public boolean estVide(){
		return this.taille() == 0;
	}
	
	/*
	 * Services
	 */
	default Iterator<E> iterator() {
		return new IterateurListe<E>(this); // Compléter puis utiliser IterateurListe.
	}
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
	
	public static <E> Liste<E> vide() {
		return new Liste<E>() {
			public boolean casVide(){
				return true;
			}
		};
	}
	
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
