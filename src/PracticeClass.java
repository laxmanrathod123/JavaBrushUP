import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PracticeClass {
	
	public static void main (String []args) {
		
	Calendar cal= Calendar.getInstance();
	SimpleDateFormat sdf= new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
	System.out.println(sdf.format(cal.getTime()));
	System.out.println();
	
    System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		
	}



}
