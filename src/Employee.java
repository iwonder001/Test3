import java.math.BigDecimal;
import java.util.Date;

public class Employee {
	
	public String name;
	public String ssn; //use as a String because Im not doing math with it
	public BigDecimal salary;
	public Date hiredate;
	
	public Employee (String n, String s, BigDecimal sal, Date h) {
		name = n;
		ssn = s;
		salary = sal;
		hiredate = h;
		
	}//closes constructor
	//Making methods (getters/setters) to interact with the objects
		//Make method to get name.  Has a return type (it will return a name - a String)
		public String getName(){
			return name;
		}
		//Make method to set a name.  Also we need a parameter to give a value and we dont need a return so use the void value
		public void setName(String n){
			name =n; //name the instance variable is equal to n
		}
		public String getSsn(){
			return ssn;
		}
		public void setSsn(String s){
			ssn =s;
		}
		public BigDecimal getSalary(){
			return salary;
		}
		public void setSalary(BigDecimal sal){
			salary =sal;
		}
		public Date getHiredate(){
			return hiredate;
		}
		public void setHiredate(Date h){
			hiredate = h;
		}
}//closes Employee class
