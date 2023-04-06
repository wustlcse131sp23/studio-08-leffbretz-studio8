package studio8;


public class Time {

	private int hour;
	private int minute;
	private boolean timeType;
	
/**
 * 
 * @param h hours in the day
 * @param m minutes in an hour
 * @param t whether it is in military time 
 */
	public Time (int h, int m, boolean t) {
		this.hour = h;
		this.minute =m;
		this.timeType=t;
	}

	
	public int getHour() {
	return hour;
}


public void setHour(int hour) {
	this.hour = hour;
}


public int getMinute() {
	return minute;
}


public void setMinute(int minute) {
	this.minute = minute;
}


public boolean isTimeType() {
	return timeType;
}


public void setTimeType(boolean timeType) {
	this.timeType = timeType;
}

	public String toString() {
		return this.hour + ":" + this.minute;
}

	public static void main(String[] args) {
		Time timeNow = new Time(12, 14, true); 
		System.out.print(timeNow.toString());
    	
    }

}