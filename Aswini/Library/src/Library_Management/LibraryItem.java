package Library_Management;

public abstract class LibraryItem {
	private int id;
	private String title;
	private boolean isAvailable;
	public LibraryItem(int id,String title,boolean isAvailable)
	{
		this.id=id;
		this.title=title;
		this.isAvailable=isAvailable;
	}
	public String getTitle()
	{
		return this.title;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
