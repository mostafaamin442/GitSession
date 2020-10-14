package callFirstClass;

import printDate.Shapes;

public class Area extends Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Area child = new Area();
		int result = child.ShapeInfo("square", 2, 5);
		System.out.println("The area of the shape is : " + result);
	}

}
