
public abstract class Delivery {

	int packageNo;
	Customer sender;
	Customer receiver;
	
	public Delivery(Customer sender, Customer receiver, int packageNo) {
		this.sender = sender;
		this.receiver = receiver;
		this.packageNo = packageNo;
	}
	
	public int getPackageNo() {
		return packageNo;
	}
	
	public Customer getSender() {
		return sender;
	}
	
	public Customer getReceiver() {
		return receiver;
	}
	
	abstract double getWeight();
	
	@Override
	public String toString() {
		return getClass() + " package no: " + packageNo + " sender: " + sender + " receiver: " + receiver;
	}
	
}
