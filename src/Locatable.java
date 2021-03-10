/**
 * 
 * Locatable interface is inherited by classes which implement positions.
 * 
 * @author Tolga Ozgun
 * @version 1.5, 10/03/2021
 *
 */

public interface Locatable {

	/**
	 * Returns the x position of the current object.
	 * 
	 * @return Integer x value
	 */
	int getX();

	/**
	 * Returns the y position of the current object.
	 * 
	 * @return Integer y value
	 */
	int getY();

	/**
	 * Sets the current position.
	 * 
	 * @param posX Integer value of new x
	 * @param posY Integer value of new y
	 */
	void setPos( int posX, int posY );

}
