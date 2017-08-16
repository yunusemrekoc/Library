
public class Publisher {
private String name;
private int numOfBooks;
public Publisher (){
}
public Publisher (String name){
	this.name=name;
}
public int numOfBooks(){    //method of number of books which belongs to a spesific publisher.
	if(numOfBooks==1)
	System.out.println("THIS PUBLISHER HAS"+" "+numOfBooks+" "+"BOOK");   //to print publisher's number of books.
	else
    System.out.println("THIS PUBLISHER HAS"+" "+numOfBooks+" "+"BOOKS");  //to print publisher's number of books.
	return numOfBooks;
}
public void publisherInfo(){   //method of including information about publisher.
	System.out.println(toString());   //to call toString() method.
}
public String toString(){
	return "PUBLISHER :"+name;   //get a String object representing the value of the number object.
}
public void setname(String name){
	this.name=name;
}
public void setnumOfBooks(int numOfBooks){    //method of setting number of books which belongs to a spesific publisher.
	this.numOfBooks=numOfBooks;
}
public String getname(){
	return name;
}
public int getnumOfBooks(){
	return numOfBooks;
}}
