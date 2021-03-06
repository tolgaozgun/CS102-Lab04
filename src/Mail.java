
public class Mail extends Delivery {

	String content;

	public Mail( String content, Customer sender, Customer receiver,
			int packageNo ) {
		super( sender, receiver, packageNo );
		this.content = content;
	}

	public double getWeight() {
		return 0.1;
	}

	@Override
	public String toString() {
		return super.toString() + " weight: " + getWeight();
	}

}
