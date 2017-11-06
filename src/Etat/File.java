package Etat;


import java.util.LinkedList;

public interface File<T> {
	
	public T getTop();
	
	public LinkedList<T> getElements();
	

}