package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
/**
 * this is a generic Utility Class 
 * @author Jashwanth
 */
public class JavaUtility {
	
	/**
	 * this is a method to get calander details
	 * @param patran (dd-MM-YY hh.mm.ss)
	 * @return
	 */
	
	public String getCalanderDetails(String patran)
	{
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(patran);
		String value = sdf.format(date);
		return value;
	}
	
	
	/**
	 * this is a generic method used to generate random number
	 * @param bound
	 * @return
	 */
	public int generateRandomNumber(int bound)
	{
		Random r = new Random();
		int num=r.nextInt(bound);
		return num;
	}

}