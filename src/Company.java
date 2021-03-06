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
		employees = new Employee[ 15 ];
		customers = new ArrayList<Customer>();
		numOfEmployees = 0;
		packageNo = 0;
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
		if ( numOfEmployees < EMPLOYEE_CAPACITY ) {
			employees[ numOfEmployees ] = candidate;
			numOfEmployees++;
			return true;
		}
		return false;
	}

	public void addCustomer( Customer customer ) {
		customers.add( customer );
	}

	public boolean terminateContract( int employeeIndex ) {
		if ( numOfEmployees > employeeIndex ) {
			
			while( numOfEmployees > employeeIndex + 1 ) {
				employees[employeeIndex] = employees[employeeIndex + 1];
				employeeIndex++;
			}
			employees[employeeIndex] = null;
			numOfEmployees--;
			return true;
		}
		return false;
	}

	public boolean createDeliverable( Item sendItem, Customer sender,
			Customer receiver ) {
		for ( Employee employee : employees ) {
			if ( employee.getAvailability() ) {
				employee.addJob( sendItem, sender, receiver, packageNo );
				packageNo++;
				return true;
			}
		}
		return false;
	}

	public void deliverPackages() {
		for( Employee employee: employees ) {
			if( employee != null ) {
				employee.deliverPackages();
			}
		}
	}

	@Override
	public String toString() {
		return "Number of Employees: " + numOfEmployees + " Customers: " // +
				// TODO:
				+ " Employees: " + Arrays.toString( employees ) 
				+ " X: " + posX
				+ " Y: " + posY;
	}
}
