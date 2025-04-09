package Library_Management;

public class Book extends LibraryItem{
	public Book(int id, String title, boolean isAvailable,String author,int ISBN) {
		super(id, title, isAvailable);
		this.author=author;
		this.ISBN=ISBN;
		// TODO Auto-generated constructor stub
	}
	private String author;
	private int ISBN;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

}
