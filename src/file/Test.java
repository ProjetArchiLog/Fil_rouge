package file;

public class Test {
	public static void main(String[] args)   {
		FileMutable<Integer> file = new FileMutable<Integer>();
		file.push(8);
		file.push(6);
		file.push(9);
		file.push(2);
		System.out.println("File :"+ file.toString());
		System.out.println("Tête :"+file.getTop());
		file.pop();
		System.out.println("File :"+file.toString());
		System.out.println("Tête :"+file.getTop());
	}

}
