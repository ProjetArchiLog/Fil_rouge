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
	
	public EnveloppeFileImmutable(E premier, K suivants, int taille){
		this.premier=premier;
		this.suivants=suivants;
		this.taille=taille;
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
		if (this.estVide()){
			return new EnveloppeFileImmutable(dernier,creer(),1);
		}
		if (this.taille()==1){
			return new EnveloppeFileImmutable(this.premier(),new EnveloppeFileImmutable(dernier,creer(),1),this.taille++);
		}
		FileImmutable<E> f=new EnveloppeFileImmutable(this.premier(),suivants.creer(dernier),this.taille++);
		return f;
	}

}
