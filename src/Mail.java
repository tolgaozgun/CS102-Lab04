/**
 * Mail is a subclass of Delivery class, which implements a String type of
 * content.
 * 
 * @see Delivery
 * @author Tolga Ozgun
 * @version 1.5, 10/03/2021
 *
 */
public class Mail extends Delivery {

	String content;

	/**
	 * Default constructor that accepts content, sender, receiver and package
	 * no.
	 * 
	 * @param content   String value of content
	 * @param sender    Customer object of sender
	 * @param receiver  Customer object of receiver
	 * @param packageNo Integer value of package no
	 */
	public Mail( String content, Customer sender, Customer receiver,
			int packageNo ) {
		super( sender, receiver, packageNo );
		this.content = content;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double getWeight() {
		return 0.1;
	}

	/**
	 * {@inheritDoc} Also prints out the weight of current mail.
	 * 
	 * @return String representation of this mail.
	 */
	@Override
	public String toString() {
		return super.toString() + " weight: " + getWeight();
	}

}
