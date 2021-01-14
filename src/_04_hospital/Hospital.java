package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> doc = new ArrayList<Doctor>();
	ArrayList<Patient> pat = new ArrayList<Patient>();

	public void addDoctor(Doctor doctor) {
		doc.add(doctor);
	}

	public ArrayList<Doctor> getDoctors() {
		return doc;
	}

	public void addPatient(Patient patient) {
		pat.add(patient);
	}

	public ArrayList<Patient> getPatients() {

		return pat;
	}

	public void assignPatientsToDoctors() throws DoctorException {
		while (pat.size() > 0) {
			for (int i = 0; i < doc.size(); i++) {
				try {
					doc.get(i).assignPatient(pat.get(0));
					pat.remove(0);
					break;
				} catch (DoctorException exception) {
					continue;
				}
			}
		}

	}

}
