package in.ashokit;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entities.Passport;
import in.ashokit.entities.Person;
import in.ashokit.repo.PassportRepo;
import in.ashokit.repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepo personRepo;
	
	@Autowired
	private PassportRepo passportRepo;

	
	public void savePersonWithPassport()
	{
		Passport passport = new Passport();
		passport.setPassportNum("ESHWAR1728");
		passport.setIssueDate(LocalDate.now());
		passport.setExpiryDate(LocalDate.now().plusYears(10));
		
		Person person = new Person();
		person.setName("Eshwar");
		person.setGender("Male");
		
		
		//Associate Entities
		person.setPassport(passport);
		passport.setPerson(person);
		
		//save person
		personRepo.save(person);
	}
}
