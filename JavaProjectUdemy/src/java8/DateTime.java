package java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTime {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		System.out.println("day"+d.getDayOfMonth());
		
		LocalDate d1 = LocalDate.of(1993, Month.JULY, 17);
		System.out.println(d1);
		
		LocalTime t = LocalTime.now();
		System.out.println("t:"+t);
		
		LocalTime t1 = LocalTime.of(5, 45);
		System.out.println("t1:"+t1);
		
		
		LocalTime t2 = LocalTime.now(ZoneId.of("Turkey")); 
		System.out.println("t2:"+t2);
		
	}

}
