// Huseyin Hasilci 150119698
public class Person {
	// attributes
	private String name;
	private int birthDate;
	private String birthPlace = "-";
	
	//Constructers
	public Person(String name,int birthDate,String birthPlace ) {
		this.name = name;
		this.birthDate = birthDate;
		this.birthPlace = birthPlace;
		
	}
	
	public Person(String name,int birthDate) {
		this.name = name;
		this.birthDate = birthDate;
		
	}
	public Person(String name) {
		
		this.name = name;
		
	}
	// gettr settr methods 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	
	// overriding the toString Method
	@Override
	public String toString() {
		if (birthDate == 0) {
			return "Name: " + name + ", Birth Date: " + birthDate+ ", Birth Place: " + birthPlace;
		}
		else {
			return "Name: " + name + ", Birth Date: " + "-"+ ", Birth Place: " + birthPlace;
		}
	}
	
	
	
}
