import java.util.Arrays;

public class Employee extends Person {

	final int MAX_JOBS = 5;
	int currentJobs;
	Delivery[] deliveries;
	double salary;
	int employeeNo;
	boolean available;

	public Employee( int employeeNo, String name ) {
		super( name );
		this.employeeNo = employeeNo;
		currentJobs = 0;
	}

	public void adjustSalary( double value ) {
		salary = value;
	}

	public boolean getAvailability() {
		return available;
	}

	public void addJob( Item sendItem, Customer sender, Customer receiver,
			int packageNo ) {

	}

	public void deliverPackages() {
		for( Delivery delivery: deliveries ) {
			if( delivery.getSender() == null || delivery.getReceiver() == null ) {
				System.out.println( "Failed to deliver!" );
			}
			System.out.println( "Delivery No: " + delivery.getPackageNo() );
			System.out.println( "Delivery Sender: " + delivery.getSender() );
			System.out.println( "Delivery Receiver: " + delivery.getReceiver() );
		}
	}

	@Override
	public String toString() {
		return super.toString() + " Employee No: " + employeeNo 
				+ " Salary: " + salary 
				+ " Is Available: " + available 
				+ " Deliveries: " + Arrays.toString( deliveries ) 
				+ " Current Jobs: " + currentJobs;
	}

}
