/**
 * 
 * @author Tolga Ozgun
 * @version 1.5, 10/03/2021
 *
 */
public class CompanyTester {

	public static void main( String[] args ) {
		Company company;
		Customer custOne;
		Customer custTwo;
		Package pack;
		Item item;
		Item itemTwo;
		Mail mail;
		Employee employee;

		item = new Item( 1.0, "I use Arch btw" );
		itemTwo = new Item( 2.95, "Java World!" );
		employee = new Employee( 0, "Cool FedEx Guy" );
		custOne = new Customer( "John Doe" );
		custTwo = new Customer( "Jane Doe" );
		company = new Company( -5, -4 );
		mail = new Mail( "Hello World!", custOne, custTwo, 0 );
		pack = new Package( item, custOne, custTwo, 93303 );

		/*
		 * Item class test
		 */
		System.out.println( "--- Item Class Test ---\n" );
		System.out.println( "-> Item 1 <-" );
		System.out.println( "Item Content: " + item.getContent() );
		System.out.println( "Item Weight: " + item.getWeight() );
		System.out.println( "Item: " + item.toString() );

		System.out.println( "\n-> Item 2 <-" );
		System.out.println( "Item Content: " + itemTwo.getContent() );
		System.out.println( "Item Weight: " + itemTwo.getWeight() );
		System.out.println( "Item: " + itemTwo.toString() );
		System.out.println( "--- Item Class Test Over ---\n" );

		/**
		 * Employee class test
		 */
		System.out.println( "--- Employee Class Test ---\n" );
		System.out.print( employee.getName() + "'s salary: " );
		System.out.println( employee.getSalary() );
		System.out.println( "Setting salary to 999.99" );
		employee.adjustSalary( 999.99 );
		System.out.print( employee.getName() + "'s salary: " );
		System.out.println( employee.getSalary() );

		System.out.print( employee.getName() + "'s availability: " );
		System.out.println( employee.getAvailability() );

		System.out.println( "Giving max amount of delivery to this employee" );
		for ( int i = 0; i < 5; i++ ) {
			employee.addJob( item, custOne, custTwo, i );
		}
		System.out.print( employee.getName() + "'s availability: " );
		System.out.println( employee.getAvailability() );
		System.out.println( "Delivering packages.." );
		employee.deliverPackages();
		System.out.print( employee.getName() + "'s availability: " );
		System.out.println( employee.getAvailability() );
		System.out.println( "--- Employee Class Test Over ---\n" );

		/*
		 * Company class test
		 */
		System.out.println( "--- Company Class Test ---\n" );
		System.out.println( "Company: " + company );
		System.out.println( "Adding employee: " + employee );
		System.out.println( "Operation: " + company.addEmployee( employee ) );
		System.out.print( "Creating delivery 6 times (should fail at 6th):" );
		for ( int i = 0; i < 6; i++ ) {
			System.out.println(
					company.createDeliverable( item, custOne, custTwo ) );
		}
		System.out.println( "Delivering deliveries... " );
		company.deliverPackages();
		System.out.print( "Terminating 0 from company: " );
		System.out.println( company.terminateContract( 0 ) );
		System.out.print( "Terminating 0 from company (again!): " );
		System.out.println( company.terminateContract( 0 ) );
		company.addCustomer( custOne );
		System.out.println( "Company now: " + company );
		System.out.println( "--- Company Class Test Over ---\n" );

		/**
		 * Customer class test
		 */
		System.out.println( "--- Customer Class Test ---\n" );
		System.out.print( custOne.getName() + "'s item in hand: " );
		System.out.println( custOne.getCurrentItem() );

		System.out.println( "Setting item in hand to " + item );
		custOne.setCurrentItem( item );
		System.out.print( custOne.getName() + "'s item in hand: " );
		System.out.println( custOne.getCurrentItem() );
		System.out.println( "--- Customer Class Test Over ---\n" );

		/**
		 * Mail class test
		 */
		System.out.println( "--- Mail Class Test ---\n" );
		System.out.println( "Mail: " + mail );
		System.out.println( "Mail weight: " + mail.getWeight() );
		System.out.println( "Mail package no: " + mail.getPackageNo() );
		System.out.println( "Mail receiver: " + mail.getReceiver() );
		System.out.println( "Mail sender: " + mail.getSender() );
		System.out.println( "--- Customer Class Test Over ---\n" );

		/**
		 * Package class test
		 */
		System.out.println( "--- Package Class Test ---\n" );
		System.out.println( "Package: " + pack );
		System.out.println( "Package weight: " + pack.getWeight() );
		System.out.println( "Package package no: " + pack.getPackageNo() );
		System.out.println( "Package receiver: " + pack.getReceiver() );
		System.out.println( "Package sender: " + pack.getSender() );
		System.out.println( "--- Customer Class Test Over ---\n" );

	}

}
