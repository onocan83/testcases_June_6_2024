package homework_java;

public class Employee {

	private String name;
	private int salary;
	private int yearsWorked;
	private boolean isFTE;
	
	Employee(String employeename, int employeesalary, int employeeyearsWorked, boolean employeeisFTE){
		
		name=employeename;
		salary=employeesalary;
		yearsWorked=employeeyearsWorked;
		isFTE=employeeisFTE;
	}
	
	public String getName() {
		return name;
	}	
	
	public void setName(String name) {
		this.name = name;
	}	
		
		public int getSalary() {
		return salary;
	}
		
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
     public int getYearsWorked() {
		return yearsWorked;
	}
	
	public void setYearsWorked(int yearsWorked) {
		this.yearsWorked = yearsWorked;
	}
	
     public boolean isFTE() {
		return isFTE;
	}

      public void setFTE(boolean isFTE) {
		this.isFTE = isFTE;
	}
      //isFTE = true ,yearsWorked=8, salary=25000
       public void promote() {
    	   if (yearsWorked>5 && !isFTE) { 
    		      salary += 5000;
    		      isFTE = true;
    		   }

    		  else if(yearsWorked>5 && isFTE) { 
    		      salary += 10000;
    		  }
       }
    	      
       public String toString() {
           return name + " is a " + (isFTE ? "full-time employee" : "contractor") +
                   " at Alpha company.\n" +
                   "They have worked here for " + yearsWorked + " years.\n" +
                   "Their salary will now be $" + salary + ".";
       }
    
       public static void main(String[] args) {

        Employee emp1 = new Employee("John", 50000, 6, true);
       
     System.out.println(emp1);
   
   
    

      
        

		/*class name: Employee
		attributes: String name, int salary, int yearsWorked, boolean isFTE 
		methods:
		- constructor (includes name, salary, yearsWorked, isFTE)
		- getter methods for name, salary and isFTE
		- setter method for salary 
		- void promote()... If an employee has worked more than 5 years at the company (yearsWorked > 5) and is a contractor (isFTE = false) then they will get a $5,000 salary raise and will be an full time employee. If any employee has worked more than 5 years at the company and is a full time employee, then they will get a $10,000 salary raise
		- String toString() in this format:
		is a at Alpha company. 
		has worked here for . 
		's salary will now be . */


	}

}

	







	
		






	







	







	






	







	







	
		
		
		
		
		
