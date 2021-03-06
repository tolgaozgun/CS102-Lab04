import java.util.ArrayList;
import java.util.Arrays;

public class Company implements Locatable {

	final int EMPLOYEE_CAPACITY = 15;
	Employee[] employees;
	ArrayList<Customer> customers;
	int numOfEmployees;
	int employeeNo;
	int packageNo;
	int posX;
	int posY;

	public Company( int posX, int posY ) {
		this.posX = posX;
		this.posY = posY;
	}

	@Override
	public int getX() {
		return posX;
	}

	@Override
	public int getY() {
		return posY;
	}

	@Override
	public void setPos( int posX, int posY ) {
		this.posX = posX;
		this.posY = posY;
	}

	public boolean addEmployee( Employee candidate ) {
		return true;
	}

	public void addCustomer( Customer customer ) {

	}

	public boolean terminateContract( int employeeIndex ) {
		return true;
	}

	public Item createDeliverable( Item sendItem, Customer sender,
			Customer receiver ) {
		for ( Employee employee : employees ) {
			if ( employee.getAvailability() ) {

			}
		}
		return null;
	}

	public void deliverPackages() {

	}

	@Override
	public String toString() {
		return "Number of Employees: " + numOfEmployees + " Customers: " // +
																			// TODO:
				+ " Employees: " + Arrays.toString( employees ) + " X: " + posX
				+ " Y: " + posY;
	}
}
