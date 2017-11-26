package tp.v5;

import java.util.Iterator;

public class EnveloppeFileMutable<K  extends FileMutable<E>,E> implements FileMutable<E>, EtatFileMutable<K,E> {

	private E premier;
	private K suivants;
	private int taille;
	
	public EnveloppeFileMutable(){
		this.premier=null;
		this.suivants=null;
		this.taille=0;
	}
	
	@Override
	public E premier() {
		if (this.estVide()){
			throw new UnsupportedOperationException();
		}
		return this.premier;
	}

	@Override
	public FileMutable<E> creer() {
		// TODO Auto-generated method stub
		return new EnveloppeFileMutable();
	}


	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return this.taille;
	}

	@Override
	public void ajouter(E element) {
		if (taille()==0){
			this.premier=element;
		}
		else {
			this.suivants.ajouter(element);
		}
		
	}

	@Override
	public void retirer() {
		if (this.taille()<1){
			throw new UnsupportedOperationException();
		}
		if (this.taille()>1){
			this.premier=this.suivants.premier();
			this.suivants.retirer();
			this.taille--;
		}
		else {
			this.premier=null;
			this.taille=0;
		}		
	}

	@Override
	public FileMutable<E> creerCopie() {
		FileMutable<E> f = creer();
		if (this.taille()>0){
			f = f.ajout(this.premier);
		}
		if (this.taille()>1){
			f = f.ajout(this.suivants);
		}
		return f;
	}

	@Override
	public void ajouter(FileMutable<E> secondeFile) {
		for(E e : secondeFile){
			 this.suivants.ajout(e);
			 this.taille++;
		}
		
	}

	@Override
	public K suivants() {
		if (this.taille<2){
			throw new UnsupportedOperationException();
		}
		return this.suivants;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new IterateurFile(this.sujet());
	}

}
