package pkg;
import java.util.*;
public class Student {
	int Stud_ID;
	String Stud_Name;
	String Stud_Class;
	int Tamil;
	int English;
	int Mathematics;
	int Science;
	int socialScience;
	int total;
	
	public Student(int stud_ID, String stud_Name, String stud_Class, int tamil, int english, int mathematics,
			int science, int socialScience, int total) {
		super();
		Stud_ID = stud_ID;
		Stud_Name = stud_Name;
		Stud_Class = stud_Class;
		Tamil = tamil;
		English = english;
		Mathematics = mathematics;
		Science = science;
		this.socialScience = socialScience;
		this.total = total;
	}
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [Stud_ID=" + Stud_ID + ", Stud_Name=" + Stud_Name + ", Stud_Class=" + Stud_Class + ", Tamil="
				+ Tamil + ", English=" + English + ", Mathematics=" + Mathematics + ", Science=" + Science
				+ ", socialScience=" + socialScience + ", total=" + total + "]";
	}
	public int getStud_ID() {
		return Stud_ID;
	}
	public void setStud_ID(int stud_ID) {
		Stud_ID = stud_ID;
	}
	public String getStud_Name() {
		return Stud_Name;
	}
	public void setStud_Name(String stud_Name) {
		Stud_Name = stud_Name;
	}
	public String getStud_Class() {
		return Stud_Class;
	}
	public void setStud_Class(String stud_Class) {
		Stud_Class = stud_Class;
	}
	public int getTamil() {
		return Tamil;
	}
	public void setTamil(int tamil) {
		Tamil = tamil;
	}
	public int getEnglish() {
		return English;
	}
	public void setEnglish(int english) {
		English = english;
	}
	public int getMathematics() {
		return Mathematics;
	}
	public void setMathematics(int mathematics) {
		Mathematics = mathematics;
	}
	public int getScience() {
		return Science;
	}
	public void setScience(int science) {
		Science = science;
	}
	public int getSocialScience() {
		return socialScience;
	}
	public void setSocialScience(int socialScience) {
		this.socialScience = socialScience;
	}
	public int getTotal() {
		return total=Tamil+English+Mathematics+Science+socialScience;
	}
	public void setTotal(int total) {
		this.total = total;
	}
}