package callFirstClass;

import printDate.GregorianHijriDate;

public class CallingFirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an object from the "GregorianHijriDate" class 

		GregorianHijriDate Date = new GregorianHijriDate();
		
		//Call the first method which calc the Gregorian Date
		Date.Gregorian();
		
		//Call the second method which calc the Hijri Date
		Date.Hijri();

	}
	
	

}
