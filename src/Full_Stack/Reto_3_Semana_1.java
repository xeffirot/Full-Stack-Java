package Full_Stack;
import java.util.Scanner;
public class Reto_3_Semana_1 {
public static void main(String[]args) {
	Scanner s = new Scanner(System.in);
	String nombre="";
	String quit="quit";
	int recuento=0;
	do {
	System.out.println("Introduce un nombre:");
	nombre=s.nextLine();
	recuento++;
	}while (!nombre.equals(quit));
	System.out.println("Recuento total:"+(recuento-1));
}
}
