package CalenderClassDemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderClassExample {
	
	public static void main(String[]args) {
		
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		
		System.out.println();
		
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println();
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.get(Calendar.MILLISECOND));
		
		
	}

}
