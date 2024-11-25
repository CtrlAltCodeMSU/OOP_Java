package BankAccount;

public class Days {
	private int day;
	private int month;
	private int year;

	 int[] daysInMonth = {31,28,31,30,31,30,31,30,31,30,31,30};

	public Days(int day , int month ,int year){
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	public int getDaysInMonth(){
		return daysInMonth[month-1];
	}

	public void setDay(int day){
		if (day<1 || day>getDaysInMonth()){
			System.out.println("Invalid Day: " + day);
		} else {
			this.day = day;
		}
	}
	public void setMonth(int month){
		if (month<1 || month>12){
			System.out.println("Invalid Month: " + month);
		}
		this.month = month;
		if (day>getDaysInMonth()){
			day = getDaysInMonth();
		}
	}
	public void setYear(int year){
		if (year<0){
			System.out.println("Invalid Year: " + year);
		}
		else  {
			this.year = year;
		}
	}
	public void advance(){
		day++;
		if (day>getDaysInMonth()){
			day=1;
			month++;
			if (month>12){
				month = 1 ;
				year++;
			}
		}
	}
	public String displayData(){
//		if (day<10){
//			System.out.println("0" + day);
//		}
//		else {
//			System.out.println(day);
//		}
//		if (month<10){
//			System.out.println("0"+month);
//		}
//		else {
//			System.out.println(month);
//		}
		String dayString = (day<10) ? "0" +day : String.valueOf(day);
		String monthString = (month<10) ? "0" +month: String.valueOf(month);
		return (dayString + "/" + monthString +"/"+ year);
	}

	public static void main(String[] args) {
		Days date = new Days(5,2,2023);
		System.out.println(date.displayData());
		date.advance();
		System.out.println(date.displayData());

		date.setDay(28);
		date.setMonth(2);
		date.setYear(2023);
		System.out.println(date.displayData());
		date.advance();
		System.out.println(date.displayData());
	}
}
