package printDate;

public class Shapes {
	
	
	public int ShapeInfo(String ShapeName , int x , int y) {
		
		int area;
		
		if (ShapeName == "square")
			{
				 area = x*x;
			}
		else 
		{
			area=x*y;
		}
		
		return area;
	}
		
}
