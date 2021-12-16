package day18;

import java.util.Calendar;
import java.util.Date;

public class ExcCalendarDateEx1 {

	public static void main(String[] args) {
		/* Calendar瑜� Date濡� */
		Calendar cal = Calendar.getInstance();

		Date date = new Date(cal.getTimeInMillis());
		System.out.println(date);

		/* Date瑜� Calendar濡�*/
		Date date2 = new Date();
		Calendar cal2 = Calendar.getInstance();
		//date2媛� Calendar濡� 諛붾�먭구 援щ텇�븷 �닔 �엳寃� cal2�쓽 �뀈�룄瑜� 2022濡� �닔�젙
		cal2.set(Calendar.YEAR, 2022);
		cal2.setTime(date2);
		System.out.println(cal2);
	}

}