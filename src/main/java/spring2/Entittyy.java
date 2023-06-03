package spring2;

import org.springframework.lang.NonNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Entittyy {
	@Id
	@GeneratedValue
	private int id;
	@NonNull
	private String name;
	@NonNull
	private String surname;
	

}
