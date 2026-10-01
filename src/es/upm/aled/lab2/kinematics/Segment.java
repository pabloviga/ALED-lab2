package es.upm.aled.lab2.kinematics;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the segments of the exoskeletons
 */
public class Segment {
	
	//Atributos de la clase Segment
	
	private double length;
	private double angle;
	private List<Segment> children;
	
	//Métodos de la clase Segment
	
	/**
	 * Builds a new Segment with its length and its angle with respect to the previous segment (if its the root
	 * segment, its the angle with the reference coordinate system)
	 * @param length
	 * @param angle
	 */
	public Segment(double length, double angle) {
		this.length = length;
		this.angle = angle;
		this.children = new ArrayList<>();
	}
	
	/**
	 * Returns the length of the segment
	 * @return
	 */
	public double getLength() {
		return length;
	}
	
	/**
	 * Returns the angle of the segment with respect to the previous segment
	 * @return
	 */
	public double getAngle() {
		return angle;
	}
	
	/**
	 * Set the angle for a segment
	 * @param angle
	 */
	public void setAngle(double angle) {
		this.angle=angle;
	}
	
	/**
	 * Returns the Segments this one is connected to. The children Segments don't have a
	 * reference to the parent Node, so the connection is one-way.
	 * @return A List of all the children Segments
	 */
	public List<Segment> getChildren() {
		return children;
	}
	
	/**
	 * Adds a new Segment to the List of Segments this one is connected to. Each Segment can
	 * only appear as a child once.
	 * @param child The Segment to be added.
	 */
	public void addChild(Segment child) {
		if(!children.contains(child)) {
			children.add(child);
		}
	}
}
