package studhepshi;
import School.Menu;

import pkg.Student;
import java.util.*;
  
 interface Hepshiinterface
{
void addStudent();
void marks();
void viewstudent();
void totalstudent();
}
public class HepshiImplement implements Hepshiinterface{
	
	List<Student> list =new ArrayList<Student>();
	//List<Mark>mark=new ArrayList<Mark>();
	
public	void addStudent() {
	
		 System.out.println("Enter a Student Id");
		 Scanner scan=new Scanner(System.in);
		 int id=scan.nextInt();
		 System.out.println("Enter a Student Name");
		 String name =scan.next();
		 System.out.println("Enter a Student Class");
		 String classname =scan.next();
		 System.out.println("Enter Tamil Mark:");
		 int tamil=scan.nextInt();
		 System.out.println("Enter English Mark:");
		 int english=scan.nextInt();
		 System.out.println("Enter Maths Mark:");
		 int maths=scan.nextInt();
		 System.out.println("Enter Science Mark:");
		 int science=scan.nextInt();
		 System.out.println("Enter Social science Mark:");
		 int socialscience=scan.nextInt();
		 int total=tamil+english+maths+science+socialscience;
		 
		 list.add(new Student(id,name,classname,tamil,english,maths,science,socialscience,total));
		
		 System.out.println("Add Sucessfully");
		 }

public void viewstudent()
{
//	 System.out.println(list);
	
	for(Student s:list)
	{
		System.out.println(s);
	}
}
public void totalstudent() {
	int size=list.size();
	System.out.println("Total Students:"+size);
	}




	@Override
	public void marks() {
		 
		int avgtamil=0;	 
		int avgenglish=0;
		int avgmaths=0;
		int avgscience=0;
		int avgsocialscience=0;
			 for(Student m:list)
			 {
				 avgtamil=avgtamil+m.getTamil();
				 avgenglish=avgenglish+m.getEnglish();
				 avgmaths=avgmaths+m.getMathematics();
				 avgscience=avgscience+m.getScience();
				 avgsocialscience=avgsocialscience+m.getSocialScience();
			 }
		
	
	 System.out.println("AVE TAMIL MARK - " + avgtamil/list.size());
	 System.out.println("AVE ENGLISH MARK - " + avgenglish/list.size());
	 System.out.println("AVE MATHS MARK - " + avgmaths/list.size());
	 System.out.println("AVE SCIENCE MARK - " + avgscience/list.size());
	 System.out.println("AVE SOCIALSCIENCE MARK - " + avgsocialscience/list.size());
}
	
}





