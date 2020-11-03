//4. Driver (HealthCenter)
//• Should contain Main Method
//• Create 10 patient objects
//• Create 4 doctor objects
//• Create 2 appointment objects just for testing
//• Driver Class should have a functionality which Doctor can see their appointments 
//and Patient can book and appointment.

package marina1103w5d2assignment;

public class Driver {
	public static void main(String[] args) {
		Doctor d1 = new Doctor(11111, "Natalie", "Portman", "111111111", "john@email", "General Surgery");
		Doctor d2 = new Doctor(99999, "Demi", "Moore", "222-111-111", "Zayd@email", "Medical Biochemistry");
		Doctor d3 = new Doctor(7777, "Emma", "Stone", "333-111-111", "Gurleen@email", "Nephrology");
		Doctor d4 = new Doctor(8888, "Billie", "Eilish", "444-111-111", "Stanley@email", "Plastic Surgery");
		
		Patient p1 = new Patient(2222, "John", "Doe", "111-222-222", "john@email", "20001030", "female");
		Patient p2 = new Patient(23454, "Zayd", "Banks", "222-222-222", "Zayd@email", "19840125", "female");
		Patient p3 = new Patient(21945, "Gurleen", "O'Neill", "333-222-222", "Gurleen@email", "19500828", "male");
		Patient p4 = new Patient(24534, "Stanley", "Osborn", "444-222-222", "Stanley@email", "19680922", "male");
		Patient p5 = new Patient(2765, "Jaya", "Stacey", "555-222-222", "john@email", "19660308", "female");
		Patient p6 = new Patient(2097, "Angelo", "Benson", "666-222-22", "john@email", "19960905", "male");
		Patient p7 = new Patient(2106, "Can", "Garcia", "777-222-222", "john@email", "20020509", "female");
		Patient p8 = new Patient(25604, "Pierce", "Payne", "888-222-222", "john@email", "19750417", "male");
		Patient p9 = new Patient(27806, "Zayn", "Wright", "999-222-222", "john@email", "19980529", "female");
		Patient p10 = new Patient(27676, "Ayaan", "Logan", "102-222-222", "john@email", "19300202", "male");
		
//		Appointment a1 = new Appointment("20201125");
//		Appointment a2 = new Appointment("20201224");
		
		Appointment a1 = new Appointment("20201125");
		Appointment a2 = new Appointment("20201224");	
		
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);

		System.out.println(a1);
		System.out.println(a2);
	}

}
