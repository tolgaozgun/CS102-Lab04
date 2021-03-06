/**
 * 
 * @author Tolga Ozgun
 * @version 1.3, 07/03/2021
 *
 */
public class Customer extends Person {

	Item currentItem;

	public Customer( String name ) {
		super( name );
	}

	public Item getCurrentItem() {
		return currentItem;
	}

	public void setCurrentItem( Item currentItem ) {
		this.currentItem = currentItem;
	}

	public boolean sendItem( Company company, Item item, Customer receiver ) {
		if( currentItem != null ) {
			item = currentItem;
		}
		return company.createDeliverable( item, this, receiver );		
	}
	
	@Override
	public String toString() {
		return super.toString() + " item: " + currentItem;
	}

}
