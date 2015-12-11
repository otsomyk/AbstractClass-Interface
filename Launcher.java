package shapes;

public class Launcher {

	public static void main(String[] args) {
		AbstractShape[] shapes = new AbstractShape[] { new Circle(), new Rectangle(), new Triangle(), new Square()};
		new ShapesTemplate(shapes);
	}

}
