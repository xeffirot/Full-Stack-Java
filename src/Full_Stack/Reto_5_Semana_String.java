package Full_Stack;

import java.util.Scanner;

public class Reto_5_Semana_String {
 
	/**
	 * Metodo que pide un String por terminal	
	 * @return el texto introducido
	 */
	public static String pedirString(){
		Scanner sc = new  Scanner(System.in);
		sc.nextLine();
		String opcion = sc.nextLine();
		return opcion;		
	}
 
	/**
	 * Metodo que pide un int por terminal
	 * @return el número introducido
	 */
	public static int pedirNumero(){
		Scanner sc = new  Scanner(System.in);
 
		int num = sc.nextInt();
		return num;
		
	}
	
	/**
	 * Metodo que pregunta nombre a nombre los que se introducen en el Array
	 * @param lista
	 * @return el array con los nombres
	 */
	public static String[] Llennar(String[] lista){
		System.out.println("------ Escribe los nombres: ---------");
		Scanner sc = new  Scanner(System.in);
		String opcion;
		for(int i=0;i<lista.length;i++) {
			
			opcion= sc.nextLine();
			lista[i] = opcion;
		}

			return lista;
		
		}
	//Método que llena el Array sin duplicados
	public static String[] llenarSinDuplicados(String[] lista) {
		System.out.println("------- Escribe un nuevo nombre: -------");
		Scanner sc = new Scanner(System.in);
		String nombreNuevo;
		boolean valido = true;
		
		for (int i=0;i<lista.length;i++) {
			do {
				System.out.println(i+1+":");
				nombreNuevo=sc.nextLine();
				lista[i]=nombreNuevo;
				for (int j=0;j<lista.length;j++) {
					if (lista[j]==lista[i]) {
						valido=false;
					}
					j++;
				}
			}while(!valido);
		}
		return lista;
	}
	
		public static void imprimir(String[] lista){
		
	System.out.println("------ Los nombre son ---------");
		for(int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
		
		System.out.println("----------------------------");
		
	}
	
		 public static String[] cambiaTamano(String[] lista, int tamano) {
	
			 String[] aux = new String[tamano];
			 
			 for(int i=0;i<lista.length;i++) {
				 aux[i] = lista[i];
			 }
			 return aux;
		 }
		
		 public static String llenarNombre(String[]lista) {
			 System.out.println("Introduce un nombre:");
			 Scanner s = new Scanner (System.in);
			 String nombre = s.nextLine();
			 
			 return nombre;		 
		 }
		 
		 public static void cambiarLetra(String[] lista) {
			    Scanner s = new Scanner(System.in);
			    System.out.println("Introduce el caracter que quieres cambiar:");
			    char oldChar = s.nextLine().charAt(0);
			    System.out.println("Introduce el caracter por el que quieres cambiar:");
			    char newChar = s.nextLine().charAt(0);

			    for (int i = 0; i < lista.length; i++) {
			        String originalString = lista[i];
			        StringBuilder sb = new StringBuilder();
			        for (int j = 0; j < originalString.length(); j++) {
			            char currentChar = originalString.charAt(j);
			            if (currentChar == oldChar) {
			                sb.append(newChar);
			            } else {
			                sb.append(currentChar);
			            }
			        }
			        lista[i] = sb.toString();
			    }
			}
		 
		 public static int posicion(String[]lista) {
			 Scanner s = new Scanner(System.in);
			 System.out.println("Dime el nombre y te daré la posición:");
			 String nombre = s.nextLine();
			 int valor = 0;
			 for (int i=0;i<lista.length;i++) {
				 if (nombre.equals(lista[i])) {
					 valor=i;
				 }
			 }
			 System.out.println("La palabra se encuentra en la posición:"+(valor+1));
			 return valor;
		 }
		 public static void quitarEspacios(String[]lista) {
			 for (int i=0;i<lista.length;i++) {
				 lista[i]=lista[i].trim();
				 }
			 }
		 public static void toMayusculas(String[]lista) {
			 for (int i=0;i<lista.length;i++) {
				lista[i]=lista[i].toUpperCase();
			 }
		 }
		 public static void toMinus(String[]lista) {
			 for (int i=0;i<lista.length;i++) {
				 lista[i]=lista[i].toLowerCase();
			 }
		 }
		 public static void cambiarNombre(String[]lista) {
			 Scanner s = new Scanner (System.in);
			 System.out.println("Introduce el nuevo nombre:");
			 String new_nombre = s.nextLine();
			 System.out.println("Introduce el nombre que quieres cambiar:");
			 String old_nombre = s.nextLine();
			 for (int i=0;i<lista.length;i++) {
				 if (lista[i].equals(old_nombre)) {
					 lista[i]=new_nombre;
				 }
			 }
		 }
		 public static int posicion_nombre(String[]lista) {
			 Scanner s = new Scanner (System.in);
			 System.out.println("Introduce un nombre existente en el array:");
			 String nombre= s.nextLine();
			 int valor=-1;
			 for (int i=0;i<lista.length;i++) {
				 if (lista[i].equals(nombre)) {
					 valor=i;
				 }
				 
			 }
			 return valor;
		 }
		 public static void vaciarArray(String[]lista) {
			 for (int i=0;i<lista.length;i++) {
				 lista[i]="";
			 }
		 }
		 public static void reemplazarNombre(String[]lista) {
			 Scanner s = new Scanner (System.in);
			 System.out.println("Introduce el nuevo nombre:");
			 String nombre = s.nextLine();
			 System.out.println("Introduce la posicion:");
			 int posicion = s.nextInt();
			 lista[posicion-1]=nombre;
		 }
		 
		 public static void nuevaPalabra(String[]lista) {
		     	 String new_word="";
			 for (int i=0;i<lista.length;i++) {
				 char caracter = lista[i].charAt(0);
				 new_word+=caracter;
			 }
			 System.out.println("La palabra formada es "+new_word);
		 }
		 public static void dimeCaracteres(String[]lista) {
			 Scanner s = new Scanner (System.in);
			 System.out.println("Introduce una posición del Array y te diré cuantos caracteres tiene:");
			 int posicion = s.nextInt();
			 int longitud = lista[posicion].length();
			 System.out.println("La palabra del array en la posición "+posicion+" tiene "+longitud+" caracteres.");
		 }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int option;
		int tamano; 
		int i=0;
		
		
		System.out.println("Con cuantos nombres quieres trabajar");
 
		tamano = pedirNumero();
		String[] lista = new String[tamano];
	
		do {
		System.out.println("Selecciona una opción");
		System.out.println("----------------------");
		System.out.println("1. LLenar el Array");
		System.out.println("2. LLenar el Array sin duplicados");
		System.out.println("3. LLenar el Array uno a uno (insertar un solo nombre, despues del ultimo insertado");
		System.out.println("4. Cambia todas una letra en todo el array por la que le indiquemos.");
		System.out.println("5. Quita todos los espacios que tenga una palabra al principio y/o al final");
		System.out.println("6. Imprimir lista original");
		System.out.println("7. Remplazar un nombre dandole la posición");
		System.out.println("8. Imprimir toda la lista en mayusculas");
		System.out.println("9. Imprimir toda la lista en minusculas");
		System.out.println("10. Cambia un nombre que te doy por otro que tambien te doy");
		System.out.println("11. dame la posición de un nombre que te indico");
		System.out.println("12. Vacia el array poniendo una cadena vacia en cada posición");
		System.out.println("13. Te doy un nombre y una posición y la remplazas en el array");
		System.out.println("14. Escribe una palabra formada de la primera letra de cada una que tenemos en el array");
		System.out.println("15. Cambia el tamaño del array");
		System.out.println("16. Dime el número de caracteres que tiene una palabra si te doy su posición");
		System.out.println("17. Cuantos elementos tengo en el Array");
		System.out.println("0. Salir");
		
		option = pedirNumero();
		
		switch (option) {
		
		case 1 : 
			lista = Llennar(lista);			
			break;
		case 2 : 
			lista = llenarSinDuplicados(lista);
			
			break;
		case 3 :	
		    lista[i] = llenarNombre(lista);	
			i++;
			if(i==lista.length) {
				i=0;
			}					
			break;
		case 4 : 	
		    cambiarLetra(lista);		
			break;
		case 5 : 
			quitarEspacios(lista);
			break;
		case 6 :
			imprimir(lista);
			break;
		case 7 : 
			posicion(lista);
			break;
			
		case 8 :
			toMayusculas(lista);
			break;
      
        case 9 :
			toMinus(lista);
			break;	
			
        case 10 :
			cambiarNombre(lista);
			break;
			
        case 11 :
			int posicion=posicion_nombre(lista);
			System.out.println("El nombre se encuentra en la posición "+(posicion+1));
			break;
			
        case 12:
        	vaciarArray(lista);
        	break;
        	
        case 13:
            reemplazarNombre(lista);
            break;
            
        case 14:
        	nuevaPalabra(lista);
        	break;
			
		case 15:
			System.out.println("Dime el nuevo tamaño");
			lista = cambiaTamano(lista, pedirNumero());		
			break;
			
		case 16:
			dimeCaracteres(lista);
			break;
 
		case 17: 
			System.out.println("El tamaño es de: " + lista.length);
			break;
		}
		}while(option !=0);
				
	}
 
}