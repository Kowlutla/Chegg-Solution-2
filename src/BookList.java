
public class BookList {
	
	/*
	 * accepts the list of books, the size (the number of array elements in use), and 
	 * a string containing the title of the book to add
	 */
	public boolean addBook(String[]books,int size,String title)
	{
		//If the array is not yet full
		if(size!=books.length)
		{
			//add the title to the next open slot in the array (and increment the size).
			books[size++]=title;
			//Return true if you were able to add the title
			return true;
		}
		else
		{
			//false if you could not because the array was full. 
			return false;
		}
	}
	
	/*accepts the list of books and the size Displays the titles currently in 
	 * the array underneath a column header.  
	 */
	public void showList(String[]books,int size)
	{
		System.out.println("Boooks in List: ");
		for(int i=0;i<size;i++)
		{
			System.out.println((i+1)+"."+books[i]);
		}
	}
	
	/*
	 * accepts the list of books, the size, and a string containing 
	 * the title of the book to remove
	 */
	public int getBookPosition(String[]books,int size,String title)
	{
		//Searches the list for the title
		for(int i=0;i<size;i++)
		{
			//f found, returns the position of the book in the list
			if(books[i].equalsIgnoreCase(title))
			{
				return i;
			}
		}
		//If not found, it returns -1
		return -1;
	}
	
	/*
	 * accepts the list of books, the size, and the position in the list of the book to remove
	 */
	public void removeBookAtPosition(String[]books,int size,int index)
	{
		//Removes the element by shifting all the elements lower in the list up one position
		for(int i=index;i<size-1;i++)
		{
			books[i]=books[i+1];
		}
		//you can set the last element in the list to “”
		books[size-1]="";
		//decrements the size
		size--;
	}
}
