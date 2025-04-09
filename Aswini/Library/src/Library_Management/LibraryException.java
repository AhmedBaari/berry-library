package Library_Management;

class LibraryException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LibraryException(String str)
	{
		super(str);
	}
}
class ItemNotFound extends LibraryException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ItemNotFound (String str)
	{
		super(str);
	}
}

class ItemNotAvailable extends LibraryException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ItemNotAvailable (String str)
	{
		super(str);
	}
}
