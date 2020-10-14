package printDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;
import java.time.chrono.HijrahChronology;
import java.time.chrono.HijrahDate;

public class GregorianHijriDate {

	public static void main(String[] args) {
			
		System.out.println("welcome to our program which calc the current Gregorian and Hijri Date");
		}
	
	
	//First Method which print current date in Gregorian 
	public void Gregorian()
	{
		SimpleDateFormat GregorianDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date Gregorian = new Date();
		System.out.println("The Gregorian Date is : "+GregorianDate.format(Gregorian));
		
	}
	
	//Second Method which print current date in Hijri
	public void Hijri()
	{
		Date date = new Date(); // Gregorian date

		Calendar cl=Calendar.getInstance();
		cl.setTime(date);
		    
		HijrahDate islamyDate = HijrahChronology.INSTANCE.date(LocalDate.of(cl.get(Calendar.YEAR),cl.get(Calendar.MONTH)+1, cl.get(Calendar.DATE)));
		System.out.println(islamyDate);

		//OUTPUT: Hijrah-umalqura AH 1436-02-03 
	}
	}

