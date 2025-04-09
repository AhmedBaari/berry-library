package Library_Management;


public class Magazine extends LibraryItem{
	public Magazine(int id, String title, boolean isAvailable,String publisher,String issueDate) {
		super(id, title, isAvailable);
		this.publisher=publisher;
		this.issueDate=issueDate;
		// TODO Auto-generated constructor stub
	}
	private String publisher;
	private String issueDate;
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

}
