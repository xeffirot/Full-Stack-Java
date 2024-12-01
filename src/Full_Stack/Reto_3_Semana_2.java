package Full_Stack;
import java.util.Scanner;
public class Reto_3_Semana_2 {
public static void main(String[]args) {
	int variable=1000;
	Scanner s = new Scanner(System.in);
	int numero;
	do {
	System.out.println("Introduce un número:");
	numero=s.nextInt();
	variable=variable-numero;
	System.out.println("Quedan "+variable);
	}while(variable<=1000 && variable>0);
	if(variable==0) {
		System.out.println("Ha llegado a 0!");
	}
	else {
		System.out.println("Se ha salido de rango!");
	}
}
}
