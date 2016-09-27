import java.math.BigDecimal;
import java.util.Date;

public class MainApp {

	public static void main(String[] args) {
		//when using Date & BigDecimal have to create the new object first
		BigDecimal payment = new BigDecimal("50000"); 
		Date month = new Date(9/01/2016);
		
		Employee p1 = new Employee("Grant", "555-55-5555", payment, month); //only valid way to make this person object
		System.out.println(p1.getName());
		System.out.println(p1.getSsn());
		System.out.println(p1.getSalary());
		p1.setName("Elle");//changed name
		System.out.println(p1.getName());
		p1.setSsn("222-22-2222");//changed ssn
		System.out.println(p1.getSsn());
	}

}
