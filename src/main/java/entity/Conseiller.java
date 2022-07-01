package entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conseiller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String numConseiller;
	private String name;
	private String firstName;
	private LocalDate DoB;
	private int salary;
	private LocalDate dateCreation;
	
	
	public Conseiller() {
		super();
	}
	
	public Conseiller(String numConseiller, String name, String firstName, LocalDate doB, int salary,
			LocalDate dateCreation) {
		super();
		
		this.numConseiller = numConseiller;
		this.name = name;
		this.firstName = firstName;
		DoB = doB;
		this.salary = salary;
		this.dateCreation = dateCreation;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumConseiller() {
		return numConseiller;
	}
	public void setNumConseiller(String numConseiller) {
		this.numConseiller = numConseiller;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public LocalDate getDoB() {
		return DoB;
	}
	public void setDoB(LocalDate doB) {
		DoB = doB;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public LocalDate getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Conseiller [id=" + id + ", numConseiller=" + numConseiller + ", name=" + name + ", firstName="
				+ firstName + ", DoB=" + DoB + ", salary=" + salary + ", dateCreation=" + dateCreation + "]";
	}
	
	
	

}
