
public abstract class Person implements Locatable {

	String name;
	int posX;
	int posY;

	public Person( String name, int posX, int posY ) {
		this.name = name;
		this.posX = posX;
		this.posY = posY;
	}

	public Person( String name ) {
		this.name = name;
		this.posX = 0;
		this.posY = 0;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	@Override
	public int getX() {
		return posX;
	}

	@Override
	public int getY() {
		return posY;
	}

	@Override
	public void setPos( int posX, int posY ) {
		this.posX = posX;
		this.posY = posY;
	}
	
	@Override
	public String toString() {
		return getClass() + " Name: " + name + " X: " + posX + " Y: " + posY;
	}
}
