import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar d = new GregorianCalendar();
		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH); //current month
		
		d.set(GregorianCalendar.DAY_OF_MONTH, 1); // set d to strt date of the month
		int weekday = d.get(Calendar.DAY_OF_WEEK);
		
		//get first day of a week .(Sunday in U.S.)
		int firstOfWeek = d.getFirstDayOfWeek();
		
		//determine the required indentation for the first line
		int indent = 0;
		while(weekday!=firstOfWeek){
			indent++;
			d.add(Calendar.DAY_OF_MONTH, -1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		}
		
		//print week names
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		do{
			System.out.printf("%4s", weekdayNames[weekday]);
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		}
		while(weekday!=firstOfWeek);
		
		System.out.println();
		for(int i=1; i<indent; ++i){
			System.out.println("	");
		}
		
		d.set(Calendar.DAY_OF_MONTH, 1);
		do{
			int day = d.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);
			if(day==today){
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
			
			if(weekday == firstOfWeek){
				System.out.println();
			}
		}
		while(d.get(Calendar.MONTH) == month);
		
		if(weekday!=firstOfWeek){
			System.out.println();
		}
	}

}
