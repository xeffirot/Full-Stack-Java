package Full_Stack;
import java.util.Scanner;
public class Reto_3_Semana_3 {
public static void main(String[]args) {
	int numero;
	int total=0;
	Scanner s = new Scanner(System.in);
	do {
	System.out.println("Introduce un número del 1 al 100:");
	numero=s.nextInt();
	total+=numero;
	if (numero <=100 && numero >0) {
	System.out.println("Recuento de Suma: "+total);
	}
	}while(numero<=100 && numero>0);
	if (numero == 0) {
		System.out.println("Has salido del bucle.");
	}
	else if(numero>100) {
			System.out.println("El número introducido es demasiado grande.");
		}else if(numero<0) {
			System.out.println("El número introducido es demasiado pequeño.");
		}
	}
}

