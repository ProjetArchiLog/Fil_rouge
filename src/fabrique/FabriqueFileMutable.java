package fabrique;

import etat.File;

public interface FabriqueFileMutable<T> {
	
	File<T> creerFile();
	

}