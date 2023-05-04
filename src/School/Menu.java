package School;
import java.util.*;
import studhepshi.HepshiImplement;
import teacher.TeacherInfo;
public class Menu {
 public static void main(String args[])
	    {
	 HepshiImplement sh=new HepshiImplement();
	 TeacherInfo ti=new TeacherInfo();
	        int choice;
	        
	        Scanner sc=new Scanner(System.in);
	        System.out.println("*****************************");
	        	System.out.println("School Management System");
	        	System.out.println("*****************************");
	        	System.out.println("****");
	        	System.out.println("Menu");
	        	System.out.println("****");
	         	System.out.println("1.Add Student");
	         	System.out.println("2.Add Teachers");
	         	System.out.println("3.View Students");
	         	System.out.println("4.View Teachers");
	            System.out.println("5.View Total Student & Teacher");
	            System.out.println("6.View Average Mark in each Subject");
	            System.out.println("7.View Average Expense");
	            System.out.println("8.Exitloop");
	            System.out.println("*****************************");
	            int n=1;
	            
	            do {
	      System.out.println("Enter your  choice");
	            choice=sc.nextInt();
	    switch(choice)
	    {
	        case 1:
	        	sh.addStudent();
	        break;
	         case 2:
	        	 ti.addteacher();
	       break;
	         case 3:
	        sh.viewstudent();
	        break;
	         case 4:
	        ti.viewteacher();
	        break;
	         case 5:
	        	 sh.totalstudent();
	        	 ti.totalteacher();
	        break;
	         case 6:
	        sh.marks();
	        break;
	        case 7:
	        	ti.salary(); 
	        break;
	        case 8:
	        	n=2;
	        	 System.out.println("Exitloop");
	        	
	        break;
	        default:
	        	n=2;
	        
}}while(n==1);
	n=sc.nextInt();
	    }
	}


