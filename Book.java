
public class Book {
private String name;
private int year;
private int numOfPages;
private Author author;
private Publisher publisher;
private boolean isLoaned;

public Book (String name,int year,int numOfPages){
    this.name=name;
    this.year=year;
    this.numOfPages=numOfPages;
    Library.totalCount++;    //to increment totalCount value in library.
    isLoaned = false;        //initial value of isLoaned it means no books are loaned in the beginning.
}

public void bookInfo(){
System.out.println(toString());    //to call toString() method 
setyear(year);     // to call getyear() method
}

public String toString(){
	return "BOOK NAME :"+name+"\n"+"YEAR :"+year+"\n"+"PAGE COUNT :"+numOfPages;    //get a String object representing the value of the number object.
}


public Book (Author author,Publisher publisher){
	this.author=author;
	this.publisher=publisher;
}

public boolean isLoaned() {
	if (isLoaned == true){    //if isLoaned is equal to true value that book is loaned by somebody.
		System.out.println("LOANED:? YES");
		return true;
		}
	else    //else that book is not loaned by somebody.
		System.out.println("LOANED:? NO");
		return false;
}

public void loanBook(boolean isLoaned) {
	this.isLoaned = isLoaned;
	Library.loanedCount++;    //to increment loanedCount value in library.
}

public void setname (String name){
	this.name=name;
}

public void setyear(int year){
	if(year>999 && year<=2015)
		this.year = year;
		else
			System.out.println("THIS YEAR IS NOT VALID!!!");
	}

public void setnumOfPages(int numOfPages){
	this.numOfPages=numOfPages;
}

public void setAuthor(Author author){
	this.author=author;
}
public void setPublisher(Publisher publisher){
	this.publisher=publisher;
}
public void setisloaned(boolean isLoaned){
	if (isLoaned == true){    //if isLoaned is equal to true value that book is loaned by somebody.
		System.out.println("LOANED:? YES");
		this.isLoaned= true;
		Library.loanedCount++;    //to increment number of loaned books in the library
		}
	else     //else that book is not loaned by somebody.
		System.out.println("LOANED:? NO");
		this.isLoaned=false;
		
}


public String getname(){
	return name;
}

public int getyear(){
	return year;
}

public int getnumOfPages(){
	return numOfPages;
}

public Author getauthor(){
	return author;
}

public Publisher getpublisher(){
	return publisher;
}

public boolean getisLoaned(){
	return isLoaned;
}
}
