package in.ashokit.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entities.Author;
import in.ashokit.entities.Book;
import in.ashokit.repo.AuthorRepo;
import in.ashokit.repo.BookRepo;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepo authRepo;
	
	@Autowired
	private BookRepo bookRepo;
	
	
	public void saveAuthorWithBook()
	{
		Book book1 = new Book();
		book1.setBookName("Chanakya Niti");
		
		Book book2 = new Book();
		book2.setBookName("Artha shastra");
		
		Author author = new Author();
		author.setAuthName("Kautilya");
		
		//association book objects to author		
		book1.setAuthor(author);
		book2.setAuthor(author);
		
		author.setBook(Arrays.asList(book1, book2));
		
		
		//save the book
		authRepo.save(author);
	}
}
