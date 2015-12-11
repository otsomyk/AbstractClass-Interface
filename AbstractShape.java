package shapes;

import java.awt.Graphics;

public abstract class AbstractShape implements Drawable{

	private String color;

	public AbstractShape() {

	}

	public String getColor() {
		return color;
	}

	public void setNewColor(String color) {
		this.color = color;
	}

	public void draw(Graphics g) {
		throw new IllegalStateException("I can't draw this shape");
	}

	public void printSelf() {
		System.out.println("shape");
	}
}
