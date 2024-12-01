package Full_Stack;
import java.util.Scanner;
public class Reto_3_Semana_4 {
public static void main(String[]args) {
	Scanner s = new Scanner(System.in);
	int numeros;
	int suma;
	int acumulacion=0;
	System.out.println("¿Cuántos números vas a sumar?:");
    numeros=s.nextInt();
    for (int i=0;i<numeros;i++) {
    	int num=1;
        System.out.println("Introduce el "+num+"º número");
        suma=s.nextInt();
        num++;
        acumulacion+=suma;
    }
    System.out.println("La suma total de los números es "+acumulacion);
}
}
