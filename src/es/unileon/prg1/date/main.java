package es.unileon.prg1.date;

public class main {

	public static void main(String[] args) {
		
		
		try {
		Date today = new Date(28,5,2018);
		Date tomorrow = new Date(1,1,2018);
		

		System.out.println("La fecha actual es: "+today);
		System.out.println("La fecha de mañana es "+tomorrow);
		System.out.println("¿Estamos en el dia de la fecha introducida?if "+today.isSameDayIf(tomorrow));
		System.out.println("¿Estamos en el mes de la fecha introducida?if "+today.isSameMonthIf(tomorrow));
		System.out.println("¿Estamos en el año de la fecha introducida?if "+today.isSameYearIf(tomorrow));
		System.out.println("Es la fecha la mismaif "+today.isSameIf(tomorrow));
		System.out.println("¿Estamos en el dia de la fecha introducida?"+today.isSameDay(tomorrow));
		System.out.println("¿Estamos en el mes de la fecha introducida?"+today.isSameMonth(tomorrow));
		System.out.println("¿Estamos en el año de la fecha introducida?"+today.isSameYear(tomorrow));
		System.out.println("Es la fecha la misma "+today.isSame(tomorrow));
		System.out.println("Estamos en "+today.getMonthName());
		System.out.println("Los dias que le pasamos al mes actual son "+today.isDayRight());
		System.out.println("Estamos en "+today.getSeasonName());
		System.out.println("Estamos en " +today.getMonthName()+ " y para que termine el año faltan "+today.getMonthsEndYear()+"para que termine el año");
		System.out.println("Faltan estas fechas para que termine el mes: "+today.getDaysLeftOfMonth());
		
		}catch (DateException e) {
			System.out.println(e.getMessage());
		}
	}
}
