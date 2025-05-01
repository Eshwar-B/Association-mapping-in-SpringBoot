package in.ashokit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookId;
	
	private String bookName;
	
	@ManyToOne
	@JoinColumn(name = "auth_id")
	private Author author;

	public Integer getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public Author getAuthor() {
		return author;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
}
