//Doctor
//• Should contain following instance variables
//• Doctor Id (unique number)
//• First Name
//• Last Name
//• Phone Number
//• Email
//• Specialty
//• Array List of Appointments
//• Constructor and make sure to use composition for joining classes
//• Getters and setters
//• Every instance variable which are String should be check
//not to be null or empty and Doctor Id should be more than 1000 and less than 100000
//• ToString() Method

package marina1103w5d2assignment;


import java.util.ArrayList;

public class Doctor {
//	instance variables
	private int doctorId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String specialty;
	private ArrayList<Appointment> Appointments;
	
//	Constructor
	public Doctor (int doctorId, String firstName, String lastName, 
			String phoneNumber, String email, String specialty) {
		setDoctorId(doctorId);
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setEmail(email);
		setSpecialty(specialty);
		
		this.Appointments = new ArrayList<Appointment>();
	}

//	getter
	public int getDoctorId() {
		return doctorId;
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
	public String getSpecialty() {
		return specialty;
	}
	
	public ArrayList<Appointment> getAppointments() {
		return Appointments;
	}
	
//	setter
	public void setDoctorId(int doctorId) {
		if(doctorId > 1000 && doctorId < 100000) {
		this.doctorId = doctorId;
		} else {
			this.doctorId = 0;
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
	public void setSpecialty(String specialty) {
		if(specialty.isEmpty() && specialty.equalsIgnoreCase(null)) {
		this.specialty = specialty;
		} else {
			this.specialty = "Unknown";
		}
	}
	
	public void setAppointments(ArrayList<Appointment> appointments) {
		Appointments = appointments;
	}
	
@Override
public String toString() {
	return String.format("\n------- Doctor -------\n" + "Doctor Id: %d\n" + "First Name: %s\n" + 
		"Last Name: %s\n" + "Phone Number: %s\n" + "Email: %s\n"+ 
		"Specialty: %s\n" + "Array List of Appointments", 
		doctorId, firstName, lastName, 
		phoneNumber, email, specialty, Appointments);
		}


	
	


}
