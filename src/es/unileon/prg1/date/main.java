package es.unileon.prg1;

public class main {

	public static void main(String[] args) {
		
		Date today = new Date(1,12,2018);
		
		System.out.println("La fecha actual es: "+today);
		System.out.println("¿Estamos en el dia de la fecha introducida?"+today.isSameDay(1));
		System.out.println("¿Estamos en el mes de la fecha introducida?"+today.isSameMonth(3));
		System.out.println("¿Estamos en el año de la fecha introducida?"+today.isSameYear(2018));
		System.out.println(today.isSame(1, 2, 2018));
		System.out.println("Estamos en "+today.getMonthName());
		System.out.println(today.checkMonth());
		System.out.println("Estamos en "+today.getSeason());
		System.out.println("Estamos en " +today.getMonthName()+ " y para que termine el año faltan "+today.getMonthsEndYear()+"para que termine el año");
		System.out.println("Faltan estas fechas para que termine le mes: "+today.getsDatesEndMonth());
	}

}
