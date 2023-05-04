package teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import pkg.Teacher;
import School.Menu;
 interface teacherinterface {
      void addteacher();
      void viewteacher();
      void totalteacher();
      void salary() ;
 }
public class TeacherInfo implements teacherinterface{
	 List<Teacher>list =new ArrayList<Teacher>();
	
	
	public void viewteacher()
	{
//		 System.out.println(list);
		
		for(Teacher s:list)
		{
			System.out.println(s);
		}
	}
	@Override
	public void addteacher() {
		// TODO Auto-generated method stub
		System.out.println("Enter a Teacher Id");
		 Scanner scan=new Scanner(System.in);
		 int id=scan.nextInt();
		 System.out.println("Enter a Teacher Name");
		 String name =scan.next();
		 System.out.println("Enter a Teacher Subject");
		 String subjectname =scan.next();
		 System.out.println("Enter a Teacher Salary");
		 int salary =scan.nextInt();
		 list.add(new Teacher(id,name,subjectname,salary));
		 System.out.println("Add Sucessfully");
	}

	public void totalteacher() {
		int size=list.size();
		System.out.println("Total Teachers:"+size);
		}
	public void salary() {
		 int saltemp=0;
		 for(Teacher t:list) {
			 saltemp=t.getSalary()+saltemp;
		 }
		 System.out.println("Annual salary:"+saltemp);
		 System.out.println("Average salary:"+(saltemp*12)/list.size());
		 
		 }
}