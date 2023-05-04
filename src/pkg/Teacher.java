package pkg;


public class Teacher {
		int Tech_id;
		String Tech_name;
		String Subject;
		int Salary;
		public Teacher(int Tech_id,String Tech_name,String Subject,int Salary) {
			super();
			this.Tech_id=Tech_id;
			this.Tech_name=Tech_name;
			this.Salary=Salary;
			this.Subject=Subject;
			
		}
		public Teacher() {
		}
		
		public int getTech_id() {
			return Tech_id;
		}
		public void setTech_id(int tech_id) {
			Tech_id = tech_id;
		}
		public String getTech_name() {
			return Tech_name;
		}
		public void setTech_name(String tech_name) {
			Tech_name = tech_name;
		}
		public String getSubject() {
			return Subject;
		}
		public void setSubject(String subject) {
			Subject = subject;
		}
		public int getSalary() {
			return Salary;
		}
		public void setSalary(int salary) {
			Salary = salary;
		}
		@Override
		public String toString() {
			return "Teacher [Tech_id=" + Tech_id + ", Tech_name=" + Tech_name + ", Subject=" + Subject + ", Salary="
					+ Salary + "]";
		}
		
}