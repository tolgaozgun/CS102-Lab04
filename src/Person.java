/**
 * 
 * @author Tolga Ozgun
 * @version 1.4, 07/03/2021
 *
 */
public abstract class Person implements Locatable {

	String name;
	int posX;
	int posY;

	/**
	 * Constructor of Person class with name, x and y value.
	 * 
	 * @param name The name of this person as String
	 * @param posX The integer value of this person's x.
	 * @param posY The integer value of this person's y.
	 */
	public Person( String name, int posX, int posY ) {
		this.name = name;
		this.posX = posX;
		this.posY = posY;
	}

	/**
	 * Constructor of Person class with only name.
	 * 
	 * @param name The name of this person as String
	 */
	public Person( String name ) {
		this.name = name;
		this.posX = 0;
		this.posY = 0;
	}

	/**
	 * Returns this person's name.
	 * 
	 * @return String value of name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets this person's name to specified parameter
	 * 
	 * @param name String value of name
	 */
	public void setName( String name ) {
		this.name = name;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getX() {
		return posX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getY() {
		return posY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setPos( int posX, int posY ) {
		this.posX = posX;
		this.posY = posY;
	}

	/**
	 * Overridden toString method with more information about the person.
	 * 
	 * @return String representation of this object
	 */
	@Override
	public String toString() {
		return getClass() + " Name: " + name + " X: " + posX + " Y: " + posY;
	}
}
