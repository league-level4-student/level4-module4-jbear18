package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	ArrayList<Patient> patients = new ArrayList<Patient>();

	public boolean performsSurgery() {

		return false;
	}

	public boolean makesHouseCalls() {

		return false;
	}

	public void assignPatient(Patient patient) throws DoctorException {
		if (patients.size() == 3) {
			throw new DoctorException();
		} else {
			patients.add(patient);
		}

	}

	public ArrayList<Patient> getPatients() {

		return patients;
	}

	public void doMedicine() {
for (int i = 0; i < patients.size(); i++) {
	patients.get(i).checkPulse();
}
	}

}
