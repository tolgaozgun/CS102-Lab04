
public class Item {

	double weight;
	String content;

	public Item( double weight, String content ) {
		this.weight = weight;
		this.content = content;
	}

	public double getWeight() {
		return weight;
	}
	
	public String getContent() {
		return content;
	}
	
	@Override
	public String toString() {
		return getClass() + " weight: " + weight + " content: " + content;
	}
}
