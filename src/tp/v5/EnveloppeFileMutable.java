package tp.v5;

import java.util.Iterator;

// TODO: Auto-generated Javadoc
/**
 * The Class EnveloppeFileMutable.
 *
 * @param <K> the key type
 * @param <E> the element type
 */
public class EnveloppeFileMutable<K  extends FileMutable<E>,E> implements FileMutable<E>, EtatFileMutable<K,E> {

	/** Premier élément de la file */
	private E premier;
	
	/** Sous-file du reste des éléments */
	private K suivants;
	
	/** Taille de la file */
	private int taille;
	
	/**
	 * Instancie une nouvelle enveloppe file mutable vide
	 */
	public EnveloppeFileMutable(){
		this.premier=null;
		this.suivants=null;
		this.taille=0;
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
	 * @see tp.v5.File#creer()
	 */
	@Override
	public FileMutable<E> creer() {
		// TODO Auto-generated method stub
		return new EnveloppeFileMutable();
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
	 * @see tp.v5.FileMutable#ajouter(java.lang.Object)
	 */
	@Override
	public void ajouter(E element) {
		if (this.estVide()){
			this.premier=element;
		}
		else {
			if(this.taille()==1){
				this.suivants = (K) this.creer();
			}
			this.suivants.ajouter(element);
		}
		this.taille ++;
	}

	/* (non-Javadoc)
	 * @see tp.v5.FileMutable#retirer()
	 */
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

	/* (non-Javadoc)
	 * @see tp.v5.FileMutable#creerCopie()
	 */
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

	/* (non-Javadoc)
	 * @see tp.v5.FileMutable#ajouter(tp.v5.FileMutable)
	 */
	@Override
	public void ajouter(FileMutable<E> secondeFile) {
		for(E e : secondeFile){
			 this.suivants.ajout(e);
			 this.taille++;
		}
		
	}

	/* (non-Javadoc)
	 * @see tp.v5.FileMutable#suivants()
	 */
	@Override
	public K suivants() {
		if (this.taille<2){
			throw new UnsupportedOperationException();
		}
		return this.suivants;
	}

	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new IterateurFile(this.sujet());
	}

}
