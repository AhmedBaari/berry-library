package Library_Management;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Library l=new Library ();
		Book b1=new Book(124,"Example",true,"Name",456);
		Magazine m1=new Magazine(890,"Magazine1",true,"XYZ","11-10-2024");
		l.addItem(b1);
		l.addItem(m1);
		l.displayItem();
		l.removeItem("Example");
		LibraryItem l3=l.searchItem("Magazine1");
		System.out.println(l3.getId());
		System.out.println(l3.getTitle());
		System.out.println(l3.isAvailable());
		LibraryItem l2=l.searchItem("Example");
		System.out.println(l2.getId());
		System.out.println(l2.getTitle());
		System.out.println(l2.isAvailable());
	}

}
