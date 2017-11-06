package file;

import java.util.LinkedList;

import etat.File;
import service.ServiceNotation;

public class FileMutable<T> implements File<T>, ServiceNotation<T> {
	
	private LinkedList<T> elements;
	
	public FileMutable(){
		this.elements=new LinkedList<T>();
	}
	
	public LinkedList<T> getElements(){
		return this.elements;
	}
	
	public void setElements(LinkedList<T> elts){
		this.elements=elts;
	}
	
	public void push (T dernierDansFile){
		this.elements.add(dernierDansFile);
	}
	
	public T getTop(){
		return this.elements.getLast();
	}
	
	public T pop(){
		return this.elements.pollLast();
	}
	
	public int getSize(){
		return this.elements.size();
	}
	
	public String toString(){
		return this.elements.toString();
	}

}
