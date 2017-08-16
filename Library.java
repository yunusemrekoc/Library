
public class Library {
static int totalCount,loanedCount,existCount=0;   //static counters for total , loaned and existing book in library.

public static void setPublisher(Book book ,Publisher publisher){
	book.setPublisher(publisher);
}

public static void setAuthor(Book book,Author author){
	book.setAuthor(author);
}
private static void currentLibraryStatus(){   //method of displaying number of loaned,existing and total books in the library. 
	existCount =totalCount-loanedCount;
	System.out.println("LOANED:"+loanedCount);
	System.out.println("EXIST:"+existCount);
	System.out.println("TOTAL:"+totalCount);
}
public static void main(String[] args){
	Book book1=new Book("DÜÞLER ÜLKESÝ",100,350);
	Author a1=new Author("MEHMET ALÝ","BARAN");
	Publisher p1=new Publisher("DENÝZ YAYINLARI");
	setAuthor(book1,a1);
	setPublisher(book1,p1);
	book1.bookInfo();         //to call bookInfo() method for book1 object.
	a1.authorInfo();          //to call authorInfo() method for a1 object.
	a1.setnumOfBooks(2);      //setting 2 books to this author.  
	a1.numOfBooks();          //to call numOfBooks() method for a1 object. 
	p1.publisherInfo();       //to call publisherInfo() method for p1 object.
	p1.setnumOfBooks(2);      //setting 2 books to this publisher.
	p1.numOfBooks();          //to call numOfBooks() method for p1 object.
	book1.setisloaned(true);  //this book is loaned.
	System.out.println();
	
	
	Book book2=new Book("SERSERÝ MAYINLAR",1995,180);
	Author a2=new Author("MEHMET ALÝ","BARAN");
	Publisher p2=new Publisher("DENÝZ YAYINLARI");
	setAuthor(book2,a2);
	setPublisher(book2,p2);
	book2.bookInfo();         //to call bookInfo() method for book2 object.
	a2.authorInfo();          //to call authorInfo() method for a2 object.
	p2.publisherInfo();       //to call publisherInfo() method for p2 object.
	book2.setisloaned(false); //this book is not loaned.
	System.out.println();
	
	
	Book book3=new Book("SEFÝLLER",1955,400);
	Author a3=new Author("VICTOR","HUGO");
	Publisher p3=new Publisher("GÜNEÞ YAYINLARI");
	setAuthor(book3,a3);
	setPublisher(book3,p3);
	book3.bookInfo();         //to call bookInfo() method for book3 object.
	a3.authorInfo();          //to call authorInfo() method for a3 object.
	a3.setnumOfBooks(1);      //setting 1 book to this author. 
	a3.numOfBooks();          //to call numOfBooks() method for a3 object.
	p3.publisherInfo();       //to call publisherInfo() method for p3 object.
	p3.setnumOfBooks(1);      //setting 1 book to this publisher.
	p3.numOfBooks();          //to call numOfBooks() method for p3 object.
	book3.setisloaned(false); //this book is not loaned.
	System.out.println();
	
	Book book4=new Book("TUTUNAMAYANLAR",1985,200);
	Author a4=new Author("HALÝT","KIVANÇ");
	Publisher p4=new Publisher("DAÐ YAYINLARI");
	setAuthor(book4,a4);
	setPublisher(book4,p4);
	book4.bookInfo();         //to call bookInfo() method for book4 object.
	a4.authorInfo();          //to call authorInfo() method for a4 object.
	a4.setnumOfBooks(1);      //setting 1 book to this author. 
	a4.numOfBooks();          //to call numOfBooks() method for a4 object.
	p4.publisherInfo();       //to call publisherInfo() method for p4 object.
	p4.setnumOfBooks(1);      //setting 1 book to this publisher.
	p4.numOfBooks();          //to call numOfBooks() method for p4 object.
	book4.setisloaned(false); //this book is not loaned.
	System.out.println();
	
	Book book5=new Book("HANGOUTS",2000,255);
	Author a5=new Author("RUSSOLL","CROW");
	Publisher p5=new Publisher("NEHÝR YAYINLARI");
	setAuthor(book5,a5);
	setPublisher(book5,p5);
	book5.bookInfo();         //to call bookInfo() method for book5 object.
	a5.authorInfo();          //to call authorInfo() method for a5 object.
	a5.setnumOfBooks(1);      //setting 1 book to this author. 
	a5.numOfBooks();          //to call numOfBooks() method for a5 object.
	p5.publisherInfo();       //to call publisherInfo() method for p5 object.
	p5.setnumOfBooks(1);      //setting 1 book to this publisher.
	p5.numOfBooks();          //to call numOfBooks() method for p5 object.
	book5.setisloaned(false); //this book is not loaned.
	System.out.println();
	
	Book book6=new Book("OLASILIKSIZ",2014,500);
	Author a6=new Author("DAN","BROWN");
	Publisher p6=new Publisher("VAKÝT YAYINLARI");
	setAuthor(book6,a6);
	setPublisher(book6,p6);
	book6.bookInfo();         //to call bookInfo() method for book6 object.
	a6.authorInfo();          //to call authorInfo() method for a6 object.
	a6.setnumOfBooks(2);      //setting 2 books to this author. 
	a6.numOfBooks();          //to call numOfBooks() method for a6 object.
	p6.publisherInfo();       //to call publisherInfo() method for p6 object.
	p6.setnumOfBooks(3);      //setting 3 books to this publisher.
	p6.numOfBooks();          //to call numOfBooks() method for p6 object.
	book6.setisloaned(true);  //this book is loaned.
	System.out.println();
	
	Book book7=new Book("ZAR ADAM",2014,480);
	Author a7=new Author("DAN","BROWN");
	Publisher p7=new Publisher("VAKÝT YAYINLARI");
	setAuthor(book7,a7);
	setPublisher(book7,p7);
	book7.bookInfo();         //to call bookInfo() method for book7 object.
	a7.authorInfo();          //to call authorInfo() method for a7 object.
	p7.publisherInfo();       //to call publisherInfo() method for p7 object.
	book7.setisloaned(true);  //this book is loaned.
	System.out.println();
	
	Book book8=new Book("DERTLÝ DAÐLAR",2005,250);
	Author a8=new Author("KAMÝL","GENÇ");
	Publisher p8=new Publisher("VAKÝT YAYINLARI");
	setAuthor(book8,a8);
	setPublisher(book8,p8);
	book8.bookInfo();         //to call bookInfo() method for book8 object.
	a8.authorInfo();          //to call authorInfo() method for a8 object.
	a8.setnumOfBooks(1);      //setting 1 book to this author. 
	a8.numOfBooks();          //to call numOfBooks() method for a8 object.
	p8.publisherInfo();       //to call publisherInfo() method for p8 object.
	book8.setisloaned(true);  //this book is loaned.
	System.out.println();
	

	Book book9=new Book("MARTILAR",2014,125);
	Author a9=new Author("ATABEY","SERT");
	Publisher p9=new Publisher("BULUT YAYINLARI");
	setAuthor(book9,a9);
	setPublisher(book9,p9);
	book9.bookInfo();         //to call bookInfo() method for book9 object.
	a9.authorInfo();          //to call authorInfo() method for a9 object.
	a9.setnumOfBooks(1);      //setting 1 book to this author. 
	a9.numOfBooks();          //to call numOfBooks() method for a9 object.
	p9.publisherInfo();       //to call publisherInfo() method for p9 object.
	p9.setnumOfBooks(1);      //setting 1 book to this publisher.
	p9.numOfBooks();          //to call numOfBooks() method for p9 object.
	book9.setisloaned(false); //this book is not loaned.
	System.out.println();
	
	Book book10=new Book("UZAK DÝYARLAR",2011,200);
	Author a10=new Author("CANSEL","EDÝN");
	Publisher p10=new Publisher("CAN YAYINLARI");
	setAuthor(book1,a10);
	setPublisher(book10,p10);
	book10.bookInfo();        //to call bookInfo() method for book10 object.
	a10.authorInfo();         //to call authorInfo() method for a10 object.
	a10.setnumOfBooks(1);     //setting 1 book to this author. 
	a10.numOfBooks();         //to call numOfBooks() method for a10 object.
	p10.publisherInfo();      //to call publisherInfo() method for p10 object.
	p10.setnumOfBooks(1);     //setting 1 book to this publisher.
	p10.numOfBooks();         //to call numOfBooks() method for p10 object.
	book10.setisloaned(false);//this book is not loaned.
	System.out.println();
	currentLibraryStatus();   //to call currentLibraryStatus() method.
	
}}
