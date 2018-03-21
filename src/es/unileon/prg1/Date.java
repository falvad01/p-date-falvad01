package es.unileon.prg1;

/**
 * 
 * @author falvad01
 * @version 1.0
 */

public class Date {

	/**
	 * Declaramos las variables
	 */
	
	private int day;
	private int month;
	private int year;
	
	/**
	 * 
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;	
	}
	
	public String toString() {
		StringBuffer output = new StringBuffer();
		output.append(day+"/"+month+"/"+year);
		
		return day + "/" + month + "/" + year;
	}
	
	public boolean isSameDay(int newDay) {
		boolean sameDay;
		if(this.day==newDay) {
			sameDay=true;
		}else {
			sameDay=false;
		}
		
		return sameDay;
	}
	
	public boolean isSameMonth(int newMonth) {
		boolean sameMonth;
		if(this.month==newMonth) {
			sameMonth=true;
		}else {
			sameMonth=false;
		}
		return sameMonth;
	}
	
	public boolean isSameYear(int newYear) {
		boolean sameYear;
		if(this.year==newYear) {
			sameYear=true;
		}else {
			sameYear=false;
		}
		return sameYear;
	}
	
	public String isSame(int newDay, int newMonth, int newYear) {
		
		String outSentence;
		
		if(day==newDay && month==newMonth && year==newYear) {
			outSentence=("La fecha es la misma");
		}else {
				outSentence=("Las fechas no coinciden");
			}
		return outSentence;
		}
		
	public String getMonth() {
		
		String writedMonth;
		
		switch(this.month) {
		
		case 1:
			writedMonth="Enero";
			break;
		case 2:
			writedMonth="Febrero";
			break;
		case 3:
			writedMonth="Marzo";
			break;
		case 4:
			writedMonth="Abril";
			break;
		case 5:
			writedMonth="Mayo";
			break;
		case 6:
			writedMonth="Junio";
			break;
		case 7:
			writedMonth="Julio";
			break;
		case 8: 
			writedMonth="Agosto";
			break;
		case 9:
			writedMonth="Septiembre";
			break;
		case 10: 
			writedMonth="Octubre";
			break;
		case 11:
			writedMonth="Noviembre";
			break;
		case 12:
			writedMonth="Diciembre";
			break;
			default:
				writedMonth="El mes introducido no es correcto";
				break;	
		}
		return writedMonth;
	}
	
	
	
	
}
