package tp.v5;

import java.util.Iterator;

public class EnveloppeFileImmutable <K  extends FileImmutable<E>,E> implements FileImmutable<E>, EtatFileImmutable<K,E>{

	private E premier;
	private K suivants;
	private int taille;
	
	public EnveloppeFileImmutable(){
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
	public FileImmutable<E> suivants() {
		if (this.taille<2){
			throw new UnsupportedOperationException();
		}
		return this.suivants;
	}

	@Override
	public FileImmutable<E> creer() {
		// TODO Auto-generated method stub
		return new EnveloppeFileImmutable();
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new IterateurFile(this.sujet());
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return this.taille;
	}
	
	

	@Override
	public FileImmutable<E> creer(E dernier) {
		FileImmutable<E> f=creer();
		f=f.ajout(dernier);
		return f;
	}

}
