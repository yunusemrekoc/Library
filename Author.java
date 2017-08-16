
public class Author {
private String firstName;
private String lastName;
private int numOfBooks;
public Author(String firstName){
	this.firstName=firstName;
}
public Author (String firstName, String lastName){
	this.firstName=firstName;
	this.lastName=lastName;
}
public int numOfBooks(){    //method of number of books which belongs to a spesific author.
	if(numOfBooks==1)
	System.out.println("THIS AUTHOR HAS"+" "+numOfBooks+" "+"BOOK");    //to print author's number of books.
	else
	System.out.println("THIS AUTHOR HAS"+" "+numOfBooks+" "+"BOOKS");   //to print author's number of books.
	return numOfBooks;
}
public void authorInfo(){   //method of including information about author.
	System.out.println(toString());   //to call toString() method.
}
public String toString(){
	return "AUTHOR:"+firstName+" "+lastName;    //get a String object representing the value of the number object.
}
public void setfirstName (String firstName){
	this.firstName=firstName;
}
public void setlastName (String lastName){
	this.lastName=lastName;
}
public void setnumOfBooks (int numOfBooks){     //method of setting number of books which belongs to a spesific author.
	
	this.numOfBooks=numOfBooks;
}
public String getfirstName(){
	return firstName;
}
public String getlastName(){
	return lastName;
}
public int getnumOfBooks(){
	return numOfBooks;
}}
