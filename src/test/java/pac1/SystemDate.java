package pac1;

import java.time.LocalDateTime;
import java.util.Date;

public class SystemDate {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date.getMonth()+1);
		System.out.println(date.getYear());
		System.out.println(date.getDate());
		
		System.out.println("----------------");
		String[] dateArr = date.toString().split(" ");
        String DD = dateArr[2];
        System.out.println(DD);
        String YYYY = dateArr[5];   
        System.out.println(YYYY);
        int MM = date.getMonth()+1;
        System.out.println(MM);
        System.out.println("----------------");
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.toString());
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getMonth());
		System.out.println(ldt.getYear());
	}

}
