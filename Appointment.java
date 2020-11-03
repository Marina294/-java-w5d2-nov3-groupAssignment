//3. Appointment
//• Should contain following instance variables
//• patient datatype of Patient
//• LocalDateTime appointmentDate
//• Constructor
//• Getters and Setters
//• ToString() Method

package marina1103w5d2assignment;


import java.util.ArrayList;

public class Appointment {
//	 instace valiable
	private ArrayList<Patient> patients;
	private String apDate;
	
//	Constructor
	public Appointment (String apDate) {
		setApDate(apDate);
		this.patients = new ArrayList<Patient>();
	}
	
//	getter
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	public String getApDate() {
		return apDate;
	}

//	setter
	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}
	public void setApDate(String apDate) {
		this.apDate = apDate;
	}

@Override
public String toString() {
	return String.format("\n====== Appointment ======\n" + patients + "\nAppointment Date: " + apDate);
}

	

}
