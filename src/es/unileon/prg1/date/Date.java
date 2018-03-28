package es.unileon.prg1.date;

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
	
	public Date() { //COntructor para cuando no se pasan parametros
		this.day=1;
		this.month=1;
		this.year=2018;
	}
	
	/**
	 * 
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year)throws DateException {//Constructor para parametros
		this.year = year;	
		
		this.month = month;
		if(month < 1 || month > 12) {
			throw new DateException("Mes " + month + "No valido, valores posibles entre 1 y 12");
		} else {
			this.month = month;
		}
		this.day = day;
		
		
	}
	
	public String toString() {
		StringBuffer output = new StringBuffer();
		output.append(day+"/"+month+"/"+year);
		return day + "/" + month + "/" + year;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}
	
	public boolean isSameDayIf(Date otherDate) {
		if ( this.day == otherDate.getDay() ){
			return true;
		}
		return false;
	}
	
	public boolean isSameMonthIf(Date otherDate) {
		if ( this.month == otherDate.getMonth() ){
			return true;
		}
		return false;
	}
	
	public boolean isSameYearIf(Date otherDate) {
		
		if ( this.year == otherDate.getYear() ){
			return true;
		}
		return false;
	}	
	
	public boolean isSameIf(Date otherDate) {
		
		boolean sameDate;
		
		if(this.day==otherDate.getYear() && this.month==otherDate.getYear() && this.year==otherDate.getYear()) {
			return true;
		}else {
				return false;
			}
		}
	
	public boolean isSameDay(Date otherDate) {
		boolean same;
		
		same=this.day==otherDate.getDay();
		
		return same;
		
	}
	
	public boolean isSameMonth(Date otherDate) {
		boolean same;
		
		same=this.month==otherDate.getMonth();
		
		return same;
	}
	
	public boolean isSameYear(Date otherDate) {
		boolean same;
		
		same=this.year==otherDate.getYear();
		
		return same;
		
	}	
	
	public boolean isSame(Date otherDate) {
		boolean same;
		same =this.day==otherDate.getYear() && this.month==otherDate.getYear() && this.year==otherDate.getYear();
		
		return same;
	}
	
	
	public String getMonthName() {
		
		String writedMonth;
		
		switch(this.month) {
		
		case 1:
			writedMonth="Enero ";
			break;
		case 2:
			writedMonth="Febrero ";
			break;
		case 3:
			writedMonth="Marzo ";
			break;
		case 4:
			writedMonth="Abril ";
			break;
		case 5:
			writedMonth="Mayo ";
			break;
		case 6:
			writedMonth="Junio ";
			break;
		case 7:
			writedMonth="Julio ";
			break;
		case 8: 
			writedMonth="Agosto ";
			break;
		case 9:
			writedMonth="Septiembre ";
			break;
		case 10: 
			writedMonth="Octubre ";
			break;
		case 11:
			writedMonth="Noviembre ";
			break;
		case 12:
			writedMonth="Diciembre ";
			break;
			default:
				writedMonth="El mes introducido no es correcto";
				break;	
		}
		return writedMonth;
	}
	
public int isDayRightAux() {
		
		int corectMonth;
		
		switch(this.month) {
		case 1://next
		case 3://next
		case 5://next
		case 7://next
		case 8://next
		case 10://next
		case 12:
			if(this.day<=31 && this.day>0) {
			corectMonth=31;
			}else {
				corectMonth=0;
			}
			break;
		case 4://next
		case 6://next
		case 9://next
		case 11:
			if(this.day<=30 && this.day>0) {
				corectMonth=30;
				}else {
					corectMonth=0;
				}
			break;
		case 2:
			if(this.day<=28 && this.day>0) {
				corectMonth=28;
				}else {
					corectMonth=0;
				}
			break;
			default:
				corectMonth=0;
		}
		return corectMonth;
	}

public boolean isDayRight() {
	
	boolean corectMonth;
	
	switch(this.month) {
	case 1://next
	case 3://next
	case 5://next
	case 7://next
	case 8://next
	case 10://next
	case 12:
		if(this.day<=31 && this.day>0) {
		corectMonth=true;
		}else {
			corectMonth=false;
		}
		break;
	case 4://next
	case 6://next
	case 9://next
	case 11:
		if(this.day<=30 && this.day>0) {
			corectMonth=true;
			}else {
				corectMonth=false;
			}
		break;
	case 2:
		if(this.day<=28 && this.day>0) {
			corectMonth=true;
			}else {
				corectMonth=false;
			}
		break;
		default:
			corectMonth=false;
	}
	return corectMonth;
}
	
	
	public String getSeasonName() {
		
		String season;
		
		switch(this.month) {
		
		case 3:
			if(this.day>=22) {//Equinocio de privamera
				season="Primavera";
			}else {
				season="Invierno";
			}
			break;
		case 4://next
		case 5:
			season="Primavera";
			break;
		case 6:
			if(this.day<=21) { //Solsticio de verano
				season="Primavera";
			}else {
				season="Verano";
			}
			break;
		case 7://next
		case 8:
			season="Verano";
			break;
		case 9:
			if(this.day<=22) { //Equinocio de otoño
				season="Verano";
			}else {
				season="Otoño";
			}
			break;
		case 10://Next
		case 11:
			season="Otoño";
		case 12:
			if(this.day<=22) { //Solsticio de invierno
				season="Otoño";
			}else {
				season="Invierno";
			}
			break;
		case 1://Next
		case 2:
			season="Invierno";
			break;
			default:
				season="Mes introducido incorrectamente";
				break;	
		}	
		return season;
	} 
	
	public String getMonthsEndYear() {
		
		StringBuilder tooEnd = new StringBuilder();
		
		for(int i=this.month + 1;i<=12;i++) {
			
			Date today=new Date(1,i,2018);
			tooEnd.append(today.getMonthName());
		}
		return tooEnd.toString();
	}
	
	public String getDaysLeftOfMonth() {
		
		StringBuilder missingDates = new StringBuilder();
		
		for(int i=this.day+1;i<=isDayRightAux();i++) {
			
			missingDates.append(i+"/"+this.month+"/"+this.year+" ");
		}
		return missingDates.toString();
		
	}
	
	public void sameDays() {
		
		for(int i=0;i<12;i++) {
			
			
			
		}
		
	}
	
	
	
	
}
