/**
 * 
 * @author Tolga Ozgun
 * @version 1.3, 07/03/2021
 *
 */
public class Mail extends Delivery {

	String content;

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
	
	//TODO: Check here

	/**
	 * {@inheritDoc}
	 * Also prints out the weight of current mail.
	 * @return String representation of this mail.
	 */
	@Override
	public String toString() {
		return super.toString() + " weight: " + getWeight();
	}

}
