package Full_Stack;
import java.util.Scanner;
public class Reto_2_Semana_Primero {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int edad;
	System.out.println("Dime una edad entre 0 y 100");
	edad=sc.nextInt();
	if (edad>0 && edad<18) {
		System.out.println("Eres menor de edad, te faltan "+(18-edad)+ " años para ser mayor de edad.");
	}
	if (edad >=18 && edad<=100) {
		System.out.println("Eres mayor de edad, te faltan "+(100-edad)+" años para llegar al siglo.");
	}
}
}
