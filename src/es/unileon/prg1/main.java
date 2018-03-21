package es.unileon.prg1;

public class main {

	public static void main(String[] args) {
		
		Date today = new Date(21,3,2018);
		
		System.out.println("La fecha actual es: "+today);
		System.out.println("¿Estamos en el dia de la fecha introducida?"+today.isSameDay(1));
		System.out.println("¿Estamos en el mes de la fecha introducida?"+today.isSameMonth(3));
		System.out.println("¿Estamos en el dia de la fecha introducida?"+today.isSameYear(2018));
		System.out.println(today.isSame(1, 2, 2018));
		System.out.println("Estamos en "+today.getMonth());
		
	}

}
