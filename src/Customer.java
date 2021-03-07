/**
 * 
 * @author Tolga Ozgun
 * @version 1.4, 07/03/2021
 *
 */
public class Customer extends Person {

	Item currentItem;

	/**
	 * Default constructor that accepts name.
	 * 
	 * @param name String value of name
	 */
	public Customer( String name ) {
		super( name );
	}

	/**
	 * Returns the current item the customer has in their hand.
	 * 
	 * @return Item object of current item.
	 */
	public Item getCurrentItem() {
		return currentItem;
	}

	/**
	 * Sets the current item in customer's hand to provided parameter.
	 * 
	 * @param currentItem Item object of new item.
	 */
	public void setCurrentItem( Item currentItem ) {
		this.currentItem = currentItem;
	}

	/**
	 * Makes the customer send an item via a company to a receiver. If a
	 * customer has an item in their hands, the item parameter is ignored.
	 * 
	 * @param company  Company object of mailing company.
	 * @param item     Item object of item to be sent.
	 * @param receiver Customer object of receiver.
	 * @return Boolean whether creating delivery was successful.
	 */
	public boolean sendItem( Company company, Item item, Customer receiver ) {
		if ( currentItem != null ) {
			item = currentItem;
		}
		return company.createDeliverable( item, this, receiver );
	}

	/**
	 * {@inheritDoc} Also prints the current item in hand.
	 */
	@Override
	public String toString() {
		return super.toString() + " item: " + currentItem;
	}

}
