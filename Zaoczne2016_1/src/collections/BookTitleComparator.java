package collections;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		return b1.getTitle().compareToIgnoreCase(b2.getTitle());
	}

}
