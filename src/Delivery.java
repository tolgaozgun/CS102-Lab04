/**
 * 
 * @author Tolga Ozgun
 * @version 1.4, 07/03/2021
 *
 */
public abstract class Delivery {

	int packageNo;
	Customer sender;
	Customer receiver;

	/**
	 * Default constructor
	 * 
	 * @param sender    Customer type object of sender
	 * @param receiver  Customer type object of receiver
	 * @param packageNo Integer value of package number.
	 */
	public Delivery( Customer sender, Customer receiver, int packageNo ) {
		this.sender = sender;
		this.receiver = receiver;
		this.packageNo = packageNo;
	}

	/**
	 * Returns the package number
	 * 
	 * @return Integer value of package number
	 */
	public int getPackageNo() {
		return packageNo;
	}

	/**
	 * Returns the sender.
	 * 
	 * @return Customer type object of sender
	 */
	public Customer getSender() {
		return sender;
	}

	/**
	 * Returns the receiver.
	 * 
	 * @return Customer type object of receiver
	 */
	public Customer getReceiver() {
		return receiver;
	}

	/**
	 * Returns the weight of current delivery.
	 * 
	 * @return Double value of weight
	 */
	abstract double getWeight();

	/**
	 * Overridden toString method with more information about the delivery.
	 * 
	 * @return String representation of this object.
	 */
	@Override
	public String toString() {
		return getClass() + " Package no: " + packageNo + " Sender: " + sender
				+ " Receiver: " + receiver;
	}

}
