package tp.v2;

import java.util.Iterator;

public interface ListeMutable<E> extends Liste<E>{

	/*
	 * Accesseurs.
	 */
	// permet d'accéder au reste
	default ListeMutable<E> reste() {
		throw new UnsupportedOperationException();
	}
	
	//permet de changer le reste
	default void changerReste(ListeMutable<E> reste) {
		throw new UnsupportedOperationException();
	}
	
	//permet de changer la tête
	default void changerTete(E tete) {
		throw new UnsupportedOperationException();
	}

	/*
	 * Services
	 */
	// inverse la liste actuelle
	default ListeMutable<E> miroir(){
		ListeMutable<E> newListe=vide();
		Iterator<E> iterateur=iterator();
		while (iterator().hasNext()){
			newListe=cons(iterateur.next(),newListe);
		}
		return newListe;
	}
	
	// Méthodes précedentes pour une liste non vide avec une tête donnée
	public static <E> ListeMutable<E> cons(E t, ListeMutable<E> r){
		return new ListeMutable<E>() {
			
			public ListeMutable<E> reste() {
				return r;
			}
			
			public void changerReste(ListeMutable<E> reste) {
				cons(t,reste);
			}
			
			public void changerTete(E tete) {
				cons(tete, r);
			}
			
			public E tete(){
				return t;
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
	
	//Méthodes précédentes pour une liste vide
	public static <E> ListeMutable<E> vide() {
		return new ListeMutable<E>() {
			public ListeMutable<E> reste() {
				return vide();
			}
			
					
		};
	}
	
}
