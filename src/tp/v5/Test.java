package tp.v5;

public class Test {
	
	private long tempsMutable; // temps mis pour réaliser testsMutables();
	private long tempsImmutable; // temps mis pour réaliser testsImmutables();
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
		System.out.println("taille après ajout de 5 : "+FileMutable.taille());
		for (int i = 0; i<n; i++){
			FileMutable.ajout(i);
		}
		System.out.println("vide? "+FileMutable.estVide());
		System.out.println("taille après ajout de 8 puis 4 : "+FileMutable.taille());
		System.out.println("premier element : "+FileMutable.premier());
		for (int i = 0; i<n; i++){
			FileMutable.retirer();
		}
		
		//System.out.println(FileMutable.premier());
		long t2 = System.currentTimeMillis();
		this.tempsMutable = t2-t1;
		System.out.println("temps en ms:" + tempsMutable);
		
		
		
	}
	
	public void testsImmutables(){
		// tests File immutable:
		System.out.println("tests files immutables:");
		long t3 = System.currentTimeMillis();
		FileImmutable<Integer> FileImmutable = new EnveloppeFileImmutable();
		for (int i = 0; i<n; i++){
			FileImmutable.ajout(i);
		}
		System.out.println("vide? "+FileImmutable.estVide());
		System.out.println("taille: "+ FileImmutable.taille());
		//System.out.println(FileImmutable.premier());
		/*for (int i = 0; i<n; i++){
			FileImmutable.retrait();
		}*/
		//System.out.println(FileImmutable.premier());
		long t4 = System.currentTimeMillis();
		this.tempsImmutable = t4-t3;
		System.out.println("temps en ms:" + tempsImmutable);
				
		
	}
	
	public void analyseComparative(){
		if (tempsMutable > tempsImmutable){
			System.out.println("Les files Immutables fonctionnent plus rapidement que les files mutables");
		}else{
			System.out.println("Les files mutables fonctionnent plus rapidement que les files immutables");
		}
		
	}
	
	public static void main(String[] args) {
		
		Test a = new Test(100);
		a.testsMutable();
		a.testsImmutables();
		a.analyseComparative();
		
		
		
		
	}

	

}
