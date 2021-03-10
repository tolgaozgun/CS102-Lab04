/**
 * Item is a class that accepts weight and content values. This item is an item
 * that can be delivered by the delivery companies.
 * 
 * @author Tolga Ozgun
 * @version 1.5, 10/03/2021
 *
 */
public class Item {

	double weight;
	String content;

	/**
	 * Default constructor that accepts weight and content
	 * 
	 * @param weight  Double value of weight
	 * @param content String value of content
	 */
	public Item( double weight, String content ) {
		this.weight = weight;
		this.content = content;
	}

	/**
	 * Returns the weight of the current item.
	 * 
	 * @return Double value of weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Returns the content of the current item.
	 * 
	 * @return String value of the content.
	 */
	public String getContent() {
		return content;
	}

	/**
	 * {@inheritDoc} Also returns weight and content values.
	 */
	@Override
	public String toString() {
		return "[" + getClass().getName() + "] with weight: " + weight
				+ " and content: " + content;
	}
}
