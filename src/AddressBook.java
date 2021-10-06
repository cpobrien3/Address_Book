import java.time.LocalDate;
import java.time.LocalDateTime;

public class AddressBook {
	
	private String name;
	private LocalDate dob;
	private String address;
	private String phoneNumber;
	private LocalDateTime contactCreated;
	
	//Constructors
	public AddressBook() {
		
	}
	
	public AddressBook(String name, LocalDate dob, String address, String phoneNumber, LocalDateTime contactCreated) {
		super();
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.contactCreated = contactCreated;
	}
	
	// Getters/Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDateTime getContactCreated() {
		return contactCreated;
	}
	public void setContactCreated(LocalDateTime contactCreated) {
		this.contactCreated = contactCreated;
	}

	@Override
	public String toString() {
		return "AddressBook [name=" + name + ", dob=" + dob + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", contactCreated=" + contactCreated + "]";
	} 
	
	
}
