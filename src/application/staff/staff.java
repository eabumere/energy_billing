package application.staff;

/**
 * 
 * 
 * *
 * @author AEjakhegbe
 * This is a staff class used to define the attribute a staff inheriting from person
 * This class configures getters, setters and constructor with a super method
 *
 */
import application.model.person;

public class staff extends person {
	


	private String username;
	private String password;
	private String branch_office;

	/**
	 * @param firstname
	 * @param lastname
	 * @param address1
	 * @param address2
	 * @param email
	 */
	public staff(String firstname, String lastname, String address1, String address2, String email, String branch_office) {
		super(firstname, lastname, address1, address2, email);
		// TODO Auto-generated constructor stub
		this.branch_office = branch_office;
	}
	
	public staff(String username, String password) {
		this.username = username;
		this.password = password;
		
	}
	
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the branch_office
	 */
	public String getBranch_office() {
		return branch_office;
	}

	/**
	 * @param branch_office the branch_office to set
	 */
	public void setBranch_office(String branch_office) {
		this.branch_office = branch_office;
	}
	
	/***
	 * The method is used to login Staff
	 * *
	 * @return
	 */
	public boolean staffLogin() {
		
		boolean logStatus = false; // a flag, by default false
		if (getUsername().equals("Abumere") && getPassword().equals("pass")) {
			
			logStatus = true;
		}	
		
		return logStatus;
	}
	
	

	
	

}
