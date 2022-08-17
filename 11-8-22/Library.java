class Library{
	public static void main(String ...args)
	{

		Author a1=new Author("ShyamSeshadri","Australia"); //author object
		Book b1=new Book(5643,"Angular JS",a1); //book object
		Author a2=new Author("AgusKurniawan","UK"); //author object
		Book b2=new Book(1965,"Angular JS Programming",a2); //book object	
		b1.bookPrint();
		b2.bookPrint();
	}

}

class Author{
	 String authorName;
	 String authorCountry;
	public Author(String authorname,String authorcountry)
	{
		authorName=authorname;
		authorCountry=authorcountry;
	}
}
//Book Class
class Book{
	int BookNum;
	String BookName;
	Author BookAuthor;//passing class reference to book class

	public Book(int num,String book, Author atr)
	{

		BookNum=num;
		BookName=book;
		BookAuthor=atr;
	}
	//printing
	public void bookPrint(){
		System.out.println("Hello "+BookName+"book id :"+BookNum+" and author is "+BookAuthor.authorName);
	}
} 