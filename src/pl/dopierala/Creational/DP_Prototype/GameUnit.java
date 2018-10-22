package pl.dopierala.Creational.DP_Prototype;

import javafx.geometry.Point3D;

/**
 * This class represents an abstract prototype & defines the clone method
 */
public abstract class GameUnit implements Cloneable {
	
	private Point3D position;
	
	public GameUnit() {
		position = Point3D.ZERO;
	}
	
	public GameUnit(float x, float y, float z) {
		position = new Point3D(x, y, z);
	}

	public void move(Point3D direction, float distance) {
		Point3D finalMove = direction.normalize();
		finalMove = finalMove.multiply(distance);
		position = position.add(finalMove);
	}
	
	public Point3D getPosition() {
		return position;
	}

	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		GameUnit unit=(GameUnit)super.clone();
		unit.initialize(); //reset values to beginning, default values
		return unit;
	}

	protected void initialize(){
		this.position = Point3D.ZERO; //reset position to origin
		reset();
	}

	//child object has to supply definition
	// it has to initialize, reset its own specific fields
	abstract protected void reset();
}
