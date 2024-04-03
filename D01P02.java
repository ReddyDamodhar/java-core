package com.learning.core.day1session1;
interface MedicineInfo {
	void displayLabel();
}

class Tablet implements MedicineInfo{
	@Override
	public void displayLabel() {
		System.out.println("Store tablets in cool dry place.");
	}
	
}
class Syrup implements MedicineInfo {
	@Override
	public void displayLabel() {
		System.out.println("Syrup is consunable only on prescription.");
	}
}
class Ointment implements MedicineInfo {
	@Override
	public void displayLabel() {
		System.out.println("Ointment is for external use only.");
	}
}
public class D01P02 {
public static void main(String[] args) {
MedicineInfo[] medicines = new MedicineInfo[] {
  new Tablet(),
  new Syrup(),
  new Ointment()
};

for (MedicineInfo medicine : medicines) {
  medicine.displayLabel();
}
}
}



