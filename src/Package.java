/**
 * 
 * @author Tolga Ozgun
 * @version 1.4, 07/03/2021
 *
 */
public class Package extends Delivery {

	Item packedItem;

	/**
	 * Default constructor that accepts item, sender, receiver and package no.
	 * 
	 * @param content   Item object of the content.
	 * @param sender    Customer object of the sender.
	 * @param receiver  Customer object of the receiver.
	 * @param packageNo Integer value of package no.
	 */
	public Package( Item content, Customer sender, Customer receiver,
			int packageNo ) {
		super( sender, receiver, packageNo );
		packedItem = content;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double getWeight() {
		return packedItem.getWeight();
	}

	/**
	 * {@inheritDoc} Also provides the content of the current item.
	 */
	@Override
	public String toString() {
		return super.toString() + " content: " + packedItem.toString();
	}

}
