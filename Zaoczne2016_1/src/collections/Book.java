package collections;

import java.util.Comparator;

public class Book implements Comparable<Book>{
	private String author;
	private String title;
	
	
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	public Book(String author, String title) {
		super();
		this.author = author;
		this.title = title;
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return author.length() - o.author.length();
	}
	
	
	public static Comparator<Book> comparatorByAuthorAlphabethicallyDesc(){
		return new Comparator<Book>(){

			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				return -o1.author.compareToIgnoreCase(o2.author);
			}
			
		};
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
}
