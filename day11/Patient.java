package day11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Patient {
	
	int patientId;
	String patientName;
	String disease;
	double billAmount;
	public Patient(int patientId, String patientName, String disease, double billAmount) {
		
		this.patientId = patientId;
		this.patientName = patientName;
		this.disease = disease;
		this.billAmount = billAmount;
		
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", disease=" + disease
				+ ", billAmount=" + billAmount + "]";
	}

}

class Methods{
	
	ArrayList<Patient> a = new ArrayList<>();
	HashSet<String> h = new HashSet<>();
	Scanner s = new Scanner(System.in);
	int n;
	
	public ArrayList<Patient> addPatient(){
		System.out.println("Enter the number of patients");
		n = s.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Enter Id, Name, Disease, Bill");
			Patient p = new Patient(s.nextInt(), s.next(), s.next(), s.nextDouble());
	        a.add(p);
	        h.add(p.disease);
		}
		return a;
	}
	
	public void removePatient() {
		System.out.println("Enter the id of the patient you want to remove");
	    int pid = s.nextInt();
	    int pos = 0;
	    for(Patient p : a) {
	    	if(p.patientId == pid){
	    		  pos = a.indexOf(p);
	    	}
	    }
	    a.remove(pos);
	}
	
	public void display() {
		for(Patient p : a) {
			System.out.println(p.toString());
		}
	}
	
	public void searchPatients() {
		System.out.println("Enter the disease you want to look patients for: ");
	    String dis = s.next();
	    for(Patient p : a) {
	    	if(p.disease.equalsIgnoreCase(dis)) {
	    		System.out.println(p.patientName);
	    	}
	    }
	}
	
	public void totalBill() {
		System.out.println("For which disease do you want the total bill for?");
		String dis = s.next();
		double totalbill=0;
		for(Patient p : a) {
			if(p.disease.equalsIgnoreCase(dis)) {
				totalbill += p.billAmount;
			}
		}
		System.out.println("Your total bill for " + dis + " is: " + totalbill);
	}	
	
	public void unique() {
		for(String p : h) {
			System.out.println(p);
		}
	}
	
	
}
