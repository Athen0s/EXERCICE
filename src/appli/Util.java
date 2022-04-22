package appli;

import java.util.Calendar;
import java.util.Date;

public class Util
{
	public static Date makeDate(int year, int month, int day)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, day, 0, 0);
		return calendar.getTime();
	}
}
