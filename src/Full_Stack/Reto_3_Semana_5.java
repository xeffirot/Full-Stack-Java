package Full_Stack;

public class Reto_3_Semana_5 {
public static void main(String[]args) {
	int numero=987654321;
	String numString=Integer.toString(numero);
	for (int i=numString.length();i>0;i--) {
		System.out.println(numString.substring(0,i));	
	}
}
}
