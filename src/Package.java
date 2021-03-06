/**
 * 
 * @author Tolga Ozgun
 * @version 1.3, 07/03/2021
 *
 */
public class Package extends Delivery{

	Item packedItem;
	
	public Package( Item content, Customer sender, Customer receiver, int packageNo ) {
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
	
	@Override
	public String toString() {
		return super.toString() + " content: " + packedItem.toString();
	}

}
