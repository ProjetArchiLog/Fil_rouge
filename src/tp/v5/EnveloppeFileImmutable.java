package tp.v5;

import java.util.Iterator;

// TODO: Auto-generated Javadoc
/**
 * The Class EnveloppeFileImmutable.
 *
 * @param <K> the key type
 * @param <E> the element type
 */
public class EnveloppeFileImmutable <K  extends FileImmutable<E>,E> implements FileImmutable<E>, EtatFileImmutable<K,E>{

	/** Premier élément de la file */
	private E premier;
	
	/** Sous-file du reste des éléments */
	private K suivants;
	
	/** Taille de la file */
	private int taille;
	
	/**
	 * Instancie une nouvelle enveloppe file immutable vide
	 */
	public EnveloppeFileImmutable(){
		this.premier=null;
		this.suivants=null;
		this.taille=0;
	}
	
	/**
	 * Instantiates a new enveloppe file immutable.
	 *
	 * @param premier Premier élément de la file
	 * @param suivants Sous-file du reste des éléments
	 * @param taille Taille de la file
	 */
	public EnveloppeFileImmutable(E premier, K suivants, int taille){
		this.premier=premier;
		this.suivants=suivants;
		this.taille=taille;
	}	
	
	/* (non-Javadoc)
	 * @see tp.v5.File#premier()
	 */
	@Override
	public E premier() {
		if (this.estVide()){
			throw new UnsupportedOperationException();
		}
		return this.premier;
	}


	/* (non-Javadoc)
	 * @see tp.v5.File#suivants()
	 */
	@Override
	public FileImmutable<E> suivants() {
		if (this.taille<2){
			throw new UnsupportedOperationException();
		}
		return this.suivants;
	}

	/* (non-Javadoc)
	 * @see tp.v5.File#creer()
	 */
	@Override
	public FileImmutable<E> creer() {
		// TODO Auto-generated method stub
		return new EnveloppeFileImmutable();
	}

	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new IterateurFile(this.sujet());
	}

	/* (non-Javadoc)
	 * @see tp.v5.Mesurable#taille()
	 */
	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return this.taille;
	}
	
	
	/* (non-Javadoc)
	 * @see tp.v5.FileImmutable#creer(java.lang.Object)
	 */
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
