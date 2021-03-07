import java.util.Arrays;

/**
 * 
 * @author Tolga Ozgun
 * @version 1.4, 07/03/2021
 *
 */

public class Employee extends Person {

	final int MAX_JOBS = 5;
	int currentJobs;
	Delivery[] deliveries;
	double salary;
	int employeeNo;
	boolean available;

	/**
	 * Default constructor that accepts employee no and name
	 * 
	 * @param employeeNo Integer value of employee no
	 * @param name       String value of name
	 */
	public Employee( int employeeNo, String name ) {
		super( name );
		this.employeeNo = employeeNo;
		currentJobs = 0;
		deliveries = new Delivery[ 5 ];
	}

	/**
	 * Sets the salary of this employee
	 * 
	 * @param value Double value of new salary.
	 */
	public void adjustSalary( double value ) {
		salary = value;
	}

	/**
	 * Checks if the current employee is available. Hence, can accept an another
	 * job.
	 * 
	 * @return Boolean value of availability.
	 */
	public boolean getAvailability() {
		// TODO: Add boolean available???
		return currentJobs < MAX_JOBS;
	}

	/**
	 * Adds a delivery job to this employee if they are available.
	 * 
	 * @param sendItem  Item object of the item to be sent
	 * @param sender    Customer object of the sender
	 * @param receiver  Customer object of the receiver
	 * @param packageNo Integer value of the package no
	 */
	public void addJob( Item sendItem, Customer sender, Customer receiver,
			int packageNo ) {
		Delivery delivery;
		if ( getAvailability() ) {
			if ( sendItem.getWeight() > 0.1 ) {
				delivery = new Package( sendItem, sender, receiver, packageNo );
			} else {
				delivery = new Mail( sendItem.getContent(), sender, receiver,
						packageNo );
			}
			deliveries[ currentJobs ] = delivery;
			currentJobs++;
		}
	}

	/**
	 * Employee delivers the packages they have in their job queue. Prints out
	 * information about deliveries.
	 */
	public void deliverPackages() {
		for ( Delivery delivery : deliveries ) {
			if ( delivery != null ) {

				// If either sender or receiver is null, delivery will fail.
				if ( delivery.getSender() == null
						|| delivery.getReceiver() == null ) {
					System.out.println( "Failed to deliver!" );
				}

				// Prints out delivery information.
				System.out.print( "Delivery No: " );
				System.out.println( delivery.getPackageNo() );
				System.out.print( "Delivery Sender: " );
				System.out.println( delivery.getSender() );
				System.out.print( "Delivery Receiver: " );
				System.out.println( delivery.getReceiver() );
			}
		}
		// Clears the delivery array and removes deliveries from the queue.
		deliveries = new Delivery[ 5 ];
		currentJobs = 0;
	}

	/**
	 * {@inheritDoc} Also provides information of employee no, salary,
	 * availability, deliveries and current jobs.
	 */
	@Override
	public String toString() {
		return super.toString() + " Employee No: " + employeeNo + " Salary: "
				+ salary + " Is Available: " + available + " Deliveries: "
				+ Arrays.toString( deliveries ) + " Current Jobs: "
				+ currentJobs;
	}

}
