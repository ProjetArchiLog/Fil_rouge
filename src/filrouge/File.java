package filrouge;

import java.util.LinkedList;

public interface File<T> {
	
	public LinkedList<T> getElements();
	
	default void push(T x){
		this.getElements().add(x);
	}
	
	default void tete(){
		
	}
}
