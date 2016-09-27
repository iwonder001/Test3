import java.math.BigDecimal;
import java.time.LocalDate;
//import java.util.Date;

public class MainApp {

	public static void main(String[] args) {
		//when using Date & BigDecimal have to create the new object first
		BigDecimal payment = new BigDecimal("50000"); 
		//Date month = new Date(9/01/2016);
		LocalDate date = LocalDate.of(2014, 2, 15);
		
		Employee p1 = new Employee("Grant", "555-55-5555", payment, date); //only valid way to make this person object
		System.out.println(p1.getName());
		System.out.println(p1.getSsn());
		System.out.println(p1.getSalary());
		System.out.println(p1.getHire());
		p1.setName("Elle");//changed name
		
		System.out.println(p1.getName());
		p1.setSsn("222-22-2222");//changed ssn
		System.out.println(p1.getSsn());
		
	    payment = new BigDecimal("100000"); 
		p1.setSalary(payment);//changed salary
		System.out.println(p1.getSalary());
		
		date = LocalDate.of(2016, 11, 15);
		p1.setHire(date);
		System.out.println(p1.getHire());
		
	}

}
