package in.nadeem.dao;

import in.nadeem.entities.Book;

public interface BookDAO {

	void saveBook(Book book);

	Book findBook(Integer bookId);

	void removeBook(Integer bookId);
}
