package Getter_and_Setter;

public class Access {
	public static void main(String[] args) {
	Employdetails e=new Employdetails();
	e.setEmp_id(111);
	e.setEmp_salary(30000);
	e.setEmp_name("Raj");
	
	System.out.println("Emp_id: " +e.getEmp_id());
	System.out.println("Emp_salary: " +e.getEmp_salary());
	System.out.println("Emp_name: " +e.getEmp_name());
	
			
	
}

}
