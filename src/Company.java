import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * Company is a class that holds Customer's, Employee's, Delivery's and also
 * implements Locatable interface. A Company can make its employees deliver
 * deliveries, fire and hire employees, and gain customers.
 * 
 * @see Customer
 * @see Employee
 * @see Delivery
 * @see Locatable
 * 
 * @author Tolga Ozgun
 * @version 1.5, 10/03/2021
 *
 */
public class Company implements Locatable {

	final int EMPLOYEE_CAPACITY = 15;
	Employee[] employees;
	ArrayList<Customer> customers;
	int numOfEmployees;
	int employeeNo;
	int packageNo;
	int posX;
	int posY;

	/**
	 * Default constructor that accepts x and y values for position
	 * 
	 * @param posX Integer value of x value.
	 * @param posY Integer value of y value.
	 */
	public Company( int posX, int posY ) {
		this.posX = posX;
		this.posY = posY;
		employees = new Employee[ EMPLOYEE_CAPACITY ];
		customers = new ArrayList<Customer>();
		numOfEmployees = 0;
		packageNo = 0;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getX() {
		return posX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getY() {
		return posY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setPos( int posX, int posY ) {
		this.posX = posX;
		this.posY = posY;
	}

	/**
	 * Adds an employee to this company if there is a space for a new employee.
	 * 
	 * @param candidate Employee object of new employee.
	 * @return Boolean whether the operation was successful.
	 */
	public boolean addEmployee( Employee candidate ) {
		if ( numOfEmployees < EMPLOYEE_CAPACITY ) {
			employees[ numOfEmployees ] = candidate;
			numOfEmployees++;
			return true;
		}
		return false;
	}

	/**
	 * Adds a customer to this company
	 * 
	 * @param customer Customer object of the customer.
	 */
	public void addCustomer( Customer customer ) {
		customers.add( customer );
	}

	/**
	 * Kicks an employee from the company if they are currently working.
	 * 
	 * @param employeeIndex Integer index value of the employee.
	 * @return Boolean whether the operation was successful.
	 */
	public boolean terminateContract( int employeeIndex ) {
		if ( numOfEmployees > employeeIndex ) {

			while ( numOfEmployees > employeeIndex + 1 ) {
				employees[ employeeIndex ] = employees[ employeeIndex + 1 ];
				employeeIndex++;
			}
			employees[ employeeIndex ] = null;
			numOfEmployees--;
			return true;
		}
		return false;
	}

	/**
	 * Creates a new job for an available employee if there is an employee
	 * available to take the job.
	 * 
	 * @param sendItem Item object of the item to be sent.
	 * @param sender   Customer object of the sender.
	 * @param receiver Customer object of the receiver.
	 * @return Boolean whether the delivery is accepted.
	 */
	public boolean createDeliverable( Item sendItem, Customer sender,
			Customer receiver ) {
		Employee employee;
		for ( int i = 0; i < EMPLOYEE_CAPACITY; i++ ) {
			if ( employees[ i ] != null ) {
				employee = employees[ i ];
				if ( employee.getAvailability() ) {
					employee.addJob( sendItem, sender, receiver, packageNo );
					packageNo++;
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Delivers the packages of all employees working in this company. Prints
	 * out the delivery information.
	 * 
	 * @see Employee#deliverPackages()
	 */
	public void deliverPackages() {
		for ( Employee employee : employees ) {
			if ( employee != null ) {
				employee.deliverPackages();
			}
		}
	}

	/**
	 * Provides information about number of employees, customers, employees, x
	 * and y value of position.
	 * 
	 * @return String representation of current company.
	 */
	@Override
	public String toString() {
		return "[" + getClass().getName() + "] Number of Employees: "
				+ numOfEmployees + " Customers: " + customers.toString()
				+ " Employees: " + Arrays.toString( employees ) + " X: " + posX
				+ " Y: " + posY;
	}
}
