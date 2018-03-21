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
	
	public String checkMonth() {
		
		String corectMonth;
		
		switch(this.month) {
		case 1://next
		case 3://next
		case 5://next
		case 7://next
		case 8://next
		case 10://next
		case 12:
			if(this.day<=31 && this.day>0) {
			corectMonth="El mes es de 31 dias y es correcto";
			}else {
				corectMonth="El mes deberia de tener 31 dias";
			}
			break;
		case 4://next
		case 6://next
		case 9://next
		case 11:
			if(this.day<=30 && this.day>0) {
				corectMonth="El mes es de 0 dias y es correcto";
				}else {
					corectMonth="El mes deberia de tener 30 dias";
				}
			break;
		case 2:
			if(this.day<=28 && this.day>0) {
				corectMonth="El mes es de 28 dias y es correcto";
				}else {
					corectMonth="El mes deberia de tener 28 dias";
				}
			break;
			default:
				corectMonth="No existe ese mes";
		}
		return corectMonth;
	}
	
	
	
	
}
