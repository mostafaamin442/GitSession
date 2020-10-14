package callFirstClass;

import printDate.ParentClass;

public class ChildClass extends ParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass child = new ChildClass();
		int result = child.sumTwoNum(3, 4);
		System.out.println(result);
		
		int resultMult = child.multipleTwoNum(6, 7);
		System.out.println(resultMult);
		
	}	

}
