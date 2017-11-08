package tp.v2;

import java.util.Iterator;

public interface ListeMutable<E> extends Liste<E>{

	/*
	 * Accesseurs.
	 */
	default ListeMutable<E> reste() {
		throw new UnsupportedOperationException();
	}
	
	default void changerReste(ListeMutable<E> reste) {
		throw new UnsupportedOperationException();
	}
	
	default void changerTete(E tete) {
		throw new UnsupportedOperationException();
	}

	/*
	 * Services
	 */
	default ListeMutable<E> miroir(){
		ListeMutable<E> newListe=vide();
		Iterator<E> iterateur=iterator();
		while (iterator().hasNext()){
			newListe=cons(iterateur.next(),newListe);
		}
		return newListe;
	}

	public static <E> ListeMutable<E> cons(E t, ListeMutable<E> r){
		return new ListeMutable<E>() {
			
			public ListeMutable<E> reste() {
				return null;
			}
			
			public void changerReste(ListeMutable<E> reste) {
				throw new UnsupportedOperationException();
			}
			
			public void changerTete(E tete) {
				throw new UnsupportedOperationException();
			}		
		};
	}
	
	public static <E> ListeMutable<E> vide() {
		return new ListeMutable<E>() {
			public ListeMutable<E> reste() {
				throw new UnsupportedOperationException();
			}
			
			public void changerReste(ListeMutable<E> reste) {
				throw new UnsupportedOperationException();
			}
			
			public void changerTete(E tete) {
				throw new UnsupportedOperationException();
			}							
		};
	}
	
}
