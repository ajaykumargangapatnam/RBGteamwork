package rougjWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Test1 {
	public static void main(String args[]) throws ParseException {
//		SimpleDateFormat df1= new SimpleDateFormat("M/d/yyyy");
//		String sdate="2/14/2020";
//		System.out.println("date: "+sdate);
//		Date dateTobeSelected= df1.parse(sdate);
//		String month=new SimpleDateFormat("M/d").format(dateTobeSelected);
//		System.out.println(month);
//       	SimpleDateFormat df = new SimpleDateFormat("hh:mm a");
//        df.setTimeZone(TimeZone.getTimeZone("UTC"));
//        Date d1 = df.parse("2:10 PM"); //date 1
//        Date d2 = df.parse("1:00 AM"); // date 2
//        long sum = d1.getTime() + d2.getTime();
//        System.out.println(df.format(new Date(sum)));
//        String consolidatedTime="12:10 PM"+" - "+df.format(new Date(sum))+" "+month;;
////        12:21 PM - 1:21 PM 03/18 MDT
//        System.out.println(consolidatedTime);
//        
////        
		String string = "MAC00232";

		for (int i = 0; i < string.length (); ++i) {
		    char c = string.charAt(i);
		    System.out.println(c);
		    int j = 0+c;
		    System.out.println("ASCII OF "+c +" = " + j + ".");
		}


		
}
	public static void setTime() throws Throwable
	{
		SimpleDateFormat df1= new SimpleDateFormat("M/d/yyyy");
		String sdate="2/14/2020";
		System.out.println("date: "+sdate);
		Date dateTobeSelected= df1.parse(sdate);
		String month=new SimpleDateFormat("M/d").format(dateTobeSelected);
		System.out.println(month);
       	SimpleDateFormat df = new SimpleDateFormat("hh:mm a");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date d1 = df.parse("12:10 PM"); //date 1
        Date d2 = df.parse("1:00 AM"); // date 2
        long sum = d1.getTime() + d2.getTime();
        System.out.println(df.format(new Date(sum)));
        String consolidatedTime="1:10 AM"+df.format(new Date(sum));
	}
}
