package homework_java;

public class StudentsWeekendBatch {

	int employeeid;
	String studentname;
	char grade; 
	
	
	public void display() {
		
	System.out.println(employeeid + "  " +   studentname + "   " +  grade + "  ");
	}	
	
	public void setData(int id, String name, char note) {
		employeeid=id;
		studentname=name;
		grade=note;
		}
		
		public static void main(String[] args) {
	
	   StudentsWeekendBatch stu1= new StudentsWeekendBatch();
	 
	   /* stu1.employeeid=101;
	   stu1.studentname = "Mike";
	   stu1.grade= 'B';
	   stu1.display();*/
			
		/*stu1.setData(101, "Mike", 'B');*/
	
	
		
		

		
	
	
	
	
	
	
	
	
	
	

	}

}
