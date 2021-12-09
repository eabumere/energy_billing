package application.model;
/**
 * 
 * 
 * *
 * @author AEjakhegbe
 * This is a person parent class used to define the attribute a person to be inherited
 * This class configures getters, setters and constructor
 *
 */
public class person {
	
	
	private String firstname;
	private String lastname;
	private String address1;
	private String address2;
	private String email;
	
	public person() {}
	
	/**
	 * @param firstname
	 * @param lastname
	 * @param address1
	 * @param address2
	 * @param email
	 */
	public person(String firstname, String lastname, String address1, String address2, String email) {
//		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address1 = address1;
		this.address2 = address2;
		this.email = email;
	}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}
	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


}
