package tp.v5;

public class Test {
	
	public static void main(String[] args) {
		
		// 
		
		// tests file mutable
		System.out.println("tests files mutables");
		long t1 = System.currentTimeMillis();
		FileMutable<Integer> FileMutable = new EnveloppeFileMutable();
		FileMutable.ajouter(5);
		System.out.println(FileMutable.taille());
		//FileMutable.ajouter(8);
		//FileMutable.ajouter(4);
		System.out.println("vide? "+FileMutable.estVide());
		System.out.println("taille: "+FileMutable.taille());
		System.out.println(FileMutable.premier());
		FileMutable.retirer();
		//System.out.println(FileMutable.premier());
		long t2 = System.currentTimeMillis();
		long tempsMutable = t2-t1;
		System.out.println("temps en ms:" + tempsMutable);
		
	
		// tests File immutable:
		System.out.println("tests files immutables:");
		long t3 = System.currentTimeMillis();
		FileImmutable<Integer> FileImmutable = new EnveloppeFileImmutable();
		//FileImmutable.ajout(5);
		//FileImmutable.ajout(8);
		//FileImmutable.ajout(4);
		System.out.println("vide? "+FileImmutable.estVide());
		System.out.println("taille: "+ FileImmutable.taille());
		//System.out.println(FileImmutable.premier());
		//FileImmutable.retrait();
		//System.out.println(FileImmutable.premier());
		long t4 = System.currentTimeMillis();
		long tempsImmutable = t4-t3;
		System.out.println("temps en ms:" + tempsImmutable);
		
		
		// Analyse comparative:
		if (tempsMutable > tempsImmutable){
			System.out.println("Les files Immutables fonctionnent plus rapidement que les files mutables");
		}else{
			System.out.println("Les files mutables fonctionnent plus rapidement que les files immutables");
		}
		
		
		
	}

}
