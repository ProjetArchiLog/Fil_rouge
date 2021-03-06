package tp.v5;

public class Test {
	
	/** Temps d'execution des m�thodes selon le type de file */
	private long tempsMutable; // temps mis pour r�aliser testsMutables();
	private long tempsImmutable; // temps mis pour r�aliser testsImmutables();
	private int n; // n est la taille du test
	
	
	public Test(int n) {
		super();
		this.tempsMutable = 0;
		this.tempsImmutable = 0;
		this.n = n;
	}
	
	
	public void testsMutable(){
		
		// tests file mutable
		System.out.println("tests files mutables");
		long t1 = System.currentTimeMillis();
		FileMutable<Integer> FileMutable = new EnveloppeFileMutable();
		FileMutable.ajouter(5);
		System.out.println("taille apr�s ajout de 5 : "+FileMutable.taille());
		for (int i = 0; i<n; i++){
			FileMutable.ajout(i);
		}
		System.out.println("vide? "+FileMutable.estVide());
		System.out.println("taille apr�s ajout d'entiers 0 � n: "+FileMutable.taille());
		System.out.println("premier element : "+FileMutable.premier());
		for (int i = 0; i<n; i++){
			FileMutable.retirer();
		}
		
		System.out.println("premier element : "+FileMutable.premier());
		long t2 = System.currentTimeMillis();
		this.tempsMutable = t2-t1;
		System.out.println("temps en ms:" + tempsMutable);
		
		
		
	}
	
	public void testsImmutables(){
		// tests File immutable:
		System.out.println("-----------------------");
		System.out.println("tests files immutables:");
		long t3 = System.currentTimeMillis();
		FileImmutable<Integer> FileImmutable = new EnveloppeFileImmutable();
		FileImmutable.ajout(5);
		System.out.println("taille apr�s ajout de 5 : "+FileImmutable.taille());
		for (int i = 0; i<n; i++){
			FileImmutable.ajout(i);
		}
		System.out.println("taille apr�s ajout d'entiers 0 � n: "+FileImmutable.taille());
		System.out.println("vide? "+FileImmutable.estVide());
		//System.out.println("premier element : "+FileImmutable.premier());
		/*for (int i = 0; i<n; i++){
			FileImmutable.retrait();
		}*/
		//System.out.println("premier element : "+FileImmutable.premier());
		long t4 = System.currentTimeMillis();
		this.tempsImmutable = t4-t3;
		System.out.println("temps en ms:" + tempsImmutable);
				
		
	}
	// compare les temps d'ex�cution des diff�rents tests
	
	public void analyseComparative(){
		System.out.println("---------------------");
		if (tempsMutable > tempsImmutable){
			System.out.println("Les files Immutables fonctionnent plus rapidement que les files mutables");
		}else{
			System.out.println("Les files mutables fonctionnent plus rapidement que les files immutables");
		}
		
	}
	
	public static void main(String[] args) {
		
		Test a = new Test(1000);
		a.testsMutable();
		a.testsImmutables();
		a.analyseComparative();
		
	}
}
