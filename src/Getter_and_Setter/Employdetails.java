package Getter_and_Setter;

public class Employdetails {
	private int Emp_id;
	private int Emp_salary;
	private String Emp_name;
	supplier sup;

	public void setEmp_id(int Emp_id) 
	{ 
	    this.Emp_id = Emp_id;
	}
	public int getEmp_id()
	{ 
	    return Emp_id;
	}
	public void setEmp_salary(int Emp_salary)
	{
		this.Emp_salary=Emp_salary;
	}
	public int getEmp_salary()   
	{
		return Emp_salary;
	}
	public void setEmp_name(String Emp_name)
	{
		this.Emp_name=Emp_name;
	}
	public String getEmp_name()
	{
		return Emp_name;
	}
	    
	    
}
public class supplier{
	private String Sup_name;
	private int mob_no;
	private int sup_id;
	
	public void setsup_name(String Sup_name)
	{
	  this.Sup_name = Sup_name;
	}
	public int getSup_name()
	{ 
	    return Sup_name;
	}
	public void mob_no(int mob_no)
	{
	  this.mob_no = mob_no;
	}
	public int getmob_no()
	{ 
	    return mob_no;
	}
	public void sup_id(int sup_id)
	{
	  this.sup_id = sup_id;
	}
	public int getsup_id()
	{ 
	    return sup_id;
	}
