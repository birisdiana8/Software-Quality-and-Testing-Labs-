package solid.o;

//import solid.o.resolved.FTEmployee;

public class ProgMainO {

	public static void main(String[] args) {
		
		Employee empMada  = new Employee(1, "Mada", "FTE", 2000);
		System.out.println(empMada.toString()+ " BONUS: " + empMada.calculateBonus());
		
		Employee empJohn  = new Employee(2, "John", "Vendor", 1800);
		System.out.println(empJohn.toString() + " BONUS: " + empJohn.calculateBonus());

		//Employee empMada  = new FTEmployee(1, "Mada", 2000);
	}

}