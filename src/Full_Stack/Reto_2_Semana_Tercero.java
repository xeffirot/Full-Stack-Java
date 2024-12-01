package Full_Stack;
import java.util.Scanner;
public class Reto_2_Semana_Tercero {
public static void main(String[]args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Indica en que año nació un niño (2020-2030):");
	int año=s.nextInt();
	
	if (año==2020) {
		System.out.println("Su signo es una rata");
	}
	else if (año==2021) {
		System.out.println("Su signo es un buey");
	}
	else if (año==2022) {
		System.out.println("Su signo es un tigre");
	}
	else if (año==2023) {
		System.out.println("Su signo es un conejo");
	}
	else if (año==2024) {
		System.out.println("Su signo es un dragón");
	}
	else if (año==2025) {
		System.out.println("Su signo es una serpiente");
	}
	else if (año==2026) {
		System.out.println("Su signo es un caballo");
	}
	else if (año==2027) {
		System.out.println("Su signo es una cabra");
	}
	else if (año==2028) {
		System.out.println("Su signo es un mono");
	}
	else if (año==2029) {
		System.out.println("Su signo es un gallo");
	}
	else if (año==2030) {
		System.out.println("Su signo es un perro");
	}
	else {
		System.out.println("El año introducido es incorrecto.");
	}
}
}
