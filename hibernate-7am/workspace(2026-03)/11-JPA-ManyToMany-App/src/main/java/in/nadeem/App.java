package in.nadeem;

import java.util.Arrays;
import java.util.List;

import in.nadeem.dao.BookDAO;
import in.nadeem.dao.impl.BookDAOImpl;
import in.nadeem.entities.Author;
import in.nadeem.entities.Book;

public class App {
	public static void main(String[] args) {

		BookDAO dao = new BookDAOImpl();

		/*
		 * // ================= BOOK OBJECTS =================
		 * 
		 * Book b1 = new Book(); b1.setBookId(101); b1.setBookName("Learn Java");
		 * 
		 * Book b2 = new Book(); b2.setBookId(102); b2.setBookName("Spring Framework");
		 * 
		 * Book b3 = new Book(); b3.setBookId(103); b3.setBookName("Hibernate Basics");
		 * 
		 * Book b4 = new Book(); b4.setBookId(104); b4.setBookName("Mastering JDBC");
		 * 
		 * Book b5 = new Book(); b5.setBookId(105);
		 * b5.setBookName("Data Structures in Java");
		 * 
		 * // ================= AUTHOR OBJECTS =================
		 * 
		 * Author a1 = new Author(); a1.setAuthorId(101); a1.setAuthorName("John");
		 * 
		 * Author a2 = new Author(); a2.setAuthorId(102); a2.setAuthorName("James");
		 * 
		 * Author a3 = new Author(); a3.setAuthorId(103); a3.setAuthorName("Robert");
		 * 
		 * Author a4 = new Author(); a4.setAuthorId(104); a4.setAuthorName("Michael");
		 * 
		 * Author a5 = new Author(); a5.setAuthorId(105); a5.setAuthorName("David");
		 * 
		 * // ================= MANY TO MANY MAPPING =================
		 * 
		 * b1.setAuthors(Arrays.asList(a1, a3));
		 * 
		 * b2.setAuthors(Arrays.asList(a2, a4));
		 * 
		 * b3.setAuthors(Arrays.asList(a1, a2, a5));
		 * 
		 * b4.setAuthors(Arrays.asList(a3));
		 * 
		 * b5.setAuthors(Arrays.asList(a4, a5));
		 * 
		 * // ================= SAVE BOOKS =================
		 * 
		 * dao.saveBook(b1); dao.saveBook(b2); dao.saveBook(b3); dao.saveBook(b4);
		 * dao.saveBook(b5);
		 * 
		 * System.out.println("Books and Authors saved successfully...");
		 */

		/*
		 * Book book_from_db = dao.findBook(101); System.out.println("Book ID : " +
		 * book_from_db.getBookId()); System.out.println("Book Name : " +
		 * book_from_db.getBookName()); List<Author> authors =
		 * book_from_db.getAuthors(); authors.forEach(System.out::println);
		 */

		dao.removeBook(101);
	}
}