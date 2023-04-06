package studio8;

import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	
	public Appointment(Date d, Time t) {
		this.date=d;
		this.time=t;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return date == other.date && time == other.time;
	}

	public static void main(String[] args) {
		Time timeNow = new Time(12, 14, true); 
    	Date today= new Date(3, 4, 2023, true);
    	Date one= new Date(3, 5, 2023, true);
    	Date two = new Date(3, 4, 2023, true);
    	Date three = new Date (5, 6, 1983, true);

		Appointment urgent = new Appointment (today, timeNow);
		Appointment notUrgent = new Appointment (one, timeNow);
		
    	System.out.println(urgent.equals(notUrgent));


	}

}
