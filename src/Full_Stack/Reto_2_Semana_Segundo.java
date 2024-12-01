package Full_Stack;
import java.util.Scanner;
public class Reto_2_Semana_Segundo {
public static void main(String[]args) {
	Scanner s = new Scanner(System.in);
	int bits;
	System.out.println("Introduce el número de bits a los que funciona la consola:");
	bits=s.nextInt();
	if (bits==1) {
		System.out.println("”Este tipo de consolas se crearón entre 1972-1983");
	}
	else if (bits==4) {
		System.out.println("Este tipo de consolas se crearón entre 1976-1992");
	}
	else if (bits==8) {
		System.out.println("Este tipo de consolas se crearón entre 1983-1988");
	}
	else if (bits==16) {
		System.out.println("Este tipo de consolas se crearón entre 1987-2003");
	}
	else if (bits==32) {
		System.out.println("Este tipo de consolas se crearón entre 1993-2006");
	}
	else if (bits==64) {
		System.out.println("Este tipo de consolas se crearón entre 1993-2006");
	}
	else if (bits==128) {
		System.out.println("”Este tipo de consolas se crearón entre 1998 hasta el dia de hoy");
	}
	else {
		System.out.println("El valor introducido es incorrecto");
	}
}
}
