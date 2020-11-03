//2. Patient
//• Should contain following instance variables
//• Patient Id (unique number)
//• First Name
//• Last Name
//• Phone Number
//• Email
//• Date of birth (Object of LocalDate)
//• Gender
//• Constructor
//• Getters and setters
//• Every instance variable which are String should be check 
//not to be null or empty and Patient Id should be more than 1000 and less than 100000
//• ToString() Method

package marina1103w5d2assignment;



public class Patient {
//	instance variables
	private int patientId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String dateOfBirth;
	private String gender;
	
//	Constructor
	public Patient (int patientId, String firstName, String lastName, 
			String phoneNumber, String email, String dateOfBirth, String gender) {
		setPatientId(patientId);
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setEmail(email);
		setDateOfBirth(dateOfBirth);
		setGender(gender);		
	}

//	getter
	public int getPatientId() {
		return patientId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	
//	setter
	public void setPatientId(int patientId) {
		if(patientId > 1000 && patientId < 100000) {
		this.patientId = patientId;
		} else {
			this.patientId = 0;
		}
	}
	public void setFirstName(String firstName) {
		if(!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
		this.firstName = firstName;
		} else {
			this.firstName = "Unknown";
		}
	}
	public void setLastName(String lastName) {
		if(!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
		this.lastName = lastName;
		} else {
			this.lastName = "Unknown";
		}
	}
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber.isEmpty() && phoneNumber.equalsIgnoreCase(null)) {
		this.phoneNumber = phoneNumber;
		} else {
			this.phoneNumber = "Unknown";			
		}
	}
	public void setEmail(String email) {
		if(email.isEmpty() && email.equalsIgnoreCase(null)) {
		this.email = email;
		} else {
			this.email = "Unknown";			
		}
	}
	public void setDateOfBirth(String dateOfBirth) {
		if(dateOfBirth.isEmpty() && dateOfBirth.equalsIgnoreCase(null)) {
		this.dateOfBirth = dateOfBirth;
		} else {
			this.dateOfBirth = "Unknown";
		}
	}
	public void setGender(String gender) {
		if(gender.isEmpty() && gender.equalsIgnoreCase(null)) {
		this.gender = gender;
		} else {
			this.gender = "Unknown";
		}
	}	

	
@Override
public String toString() {
	return String.format("\n++++++ Patient ++++++\n" + "Patient Id: %d\n" + "First Name: %s\n" + 
		"Last Name: %s\n" + "Phone Number: %s\n" + "Email: %s\n"+ 
		"Date Of Birth: %s\n" + "gender: %s\n", 
		patientId, firstName, lastName, 
		phoneNumber, email, dateOfBirth, gender);
		}


	
	

}
