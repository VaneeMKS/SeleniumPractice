package JavaInterviewPrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) throws ParseException {

		String entry = "01:00";
		String exit = "16:00";

		if (entry.isBlank() || exit.isBlank()) {
			System.out.println("Entry or exit time is blank");
			System.exit(0);
		}
		String pattern = "hh:mm";
		SimpleDateFormat sm = new SimpleDateFormat(pattern);

		Date date1 = sm.parse(entry);
		Date date2 = sm.parse(exit);

		String entryTime = sm.format(date1);
		String exitTime = sm.format(date2);
		if (date1.after(date2)) {
			System.out.println("Entry time should be before exit time");
			System.exit(0);
		}
		int entryHours = 0;
		entryHours = ((date1.getHours() * 60) + date1.getMinutes());
		System.out.println("Entry Time: " + entryTime);

		int exitHours = ((date2.getHours() * 60) + date2.getMinutes());
		System.out.println("Exit Time: " + exitTime);

		float val = 60.0f;

		float total = ((exitHours - entryHours) / val);
		double totalHours = Math.ceil(total);

		System.out.println("Total hours: " + totalHours);
		double totalBill = 0;
		totalBill = (totalHours * 4) + 1;
		System.out.println("Total Amount: " + totalBill);
	}

}
