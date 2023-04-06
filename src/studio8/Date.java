package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int day;
	private int month;
	private int year;
	private boolean holiday;
	
	/** 
	 * 
	 * @param d the day (0 or 30)
	 * @param m the month (0 of 11)
	 * @param y the year (any positive 4 digit integer)
	 * @param h whether the day is a holiday 
	 */
	 public Date (int d, int m, int y, boolean h) {
	    	this.day = d;
	    	this.month = m;
	    	this.year = y;
	    	this.holiday = h;
	    	 	
	 }
	 
public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isHoliday() {
		return holiday;
	}

	public void setHoliday(boolean holiday) {
		this.holiday = holiday;
	}

	 public String toString() {
	 return this.day + "/" +  this.month + "/"  + this.year;
			
 }
	 
    public static void main(String[] args) {
    	Date today= new Date(3, 4, 2023, true);
    	System.out.println(today.toString());
		
    	Date one= new Date(3, 5, 2023, true);

    	System.out.println(today.equals(one));	

    	Date two = new Date(3, 4, 2023, true);
    	
    	System.out.println(today.equals(two));
    	
    	Date three = new Date (5, 6, 1983, true);
    	
    	System.out.println(today.equals(three));

    	
    	 LinkedList<Date> list = new LinkedList<Date>(); 
    	 list.add(today);
    	 list.add(one);
    	 list.add(two);
    	 list.add(three);
    	 System.out.println(list);
    	
    	 HashSet<Date> set = new HashSet<Date>();
    	 set.add(today);
    	 set.add(one);
    	 set.add(two);
    	 set.add(three);
    	 System.out.println(set);
    }
    
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (this.hashCode()==obj.hashCode()){
		return true;
		} 
		
		return day == other.day && month == other.month && year == other.year;
		
	

	}

	
	}

