package Full_Stack;
import java.util.Scanner;
public class Reto_4_Semana_Matriz {
public static void main(String[]args) {
	String [][] mi_matriz=new String [9][10];
	mi_matriz[0][7]="[DAW]";
	mi_matriz[1][3]="[DAW]";
	mi_matriz[1][6]="[DAW]";
	mi_matriz[2][1]="[DAM]";
	mi_matriz[2][4]="[DAM]";
	mi_matriz[2][8]="[DAM]";
	mi_matriz[3][0]="[DAW]";
	mi_matriz[3][6]="[DAM]";
	mi_matriz[4][1]="[DAM]";
	mi_matriz[4][4]="[DAW]";
	mi_matriz[5][2]="[DAW]";
	mi_matriz[5][3]="[DAW]";
	mi_matriz[5][6]="[DAM]";
	mi_matriz[5][9]="[DAW]";
	mi_matriz[6][2]="[DAW]";
	mi_matriz[7][3]="[DAM]";
	mi_matriz[7][5]="[DAM]";
	mi_matriz[7][7]="[DAM]";
	mi_matriz[8][1]="[DAM]";
	mi_matriz[8][8]="[DAW]";
	
	int dam=0;
	int daw=0;
	
    for (int i = 0; i < mi_matriz.length; i++) {
        for (int j = 0; j < mi_matriz[i].length; j++) {
            if (mi_matriz[i][j] == null) {
                mi_matriz[i][j]="[   ]";
            }
            System.out.print(mi_matriz[i][j]);
            if (mi_matriz[i][j].equals("[DAM]")) {
            	dam++;
            }
            if (mi_matriz[i][j].equals("[DAW]")) {
            	daw++;
            }
        }
        System.out.println("_________________________________________________");
    }
    System.out.println();
    System.out.println("Elementos con DAM:"+dam+".Elementos con DAW:"+daw);
    System.out.println();
    
    for (int i = 0; i < mi_matriz.length; i++) {
        for (int j = 0; j < mi_matriz[i].length; j++) {
        	System.out.println(mi_matriz[i][j]);
        }
        }
    System.out.println("_________________________________________________");
    for (int i = 0; i < mi_matriz.length; i++) {
        for (int j = 0; j < mi_matriz[i].length; j++) {
        	if (mi_matriz[i][j].equals("[DAM]")) {
        		mi_matriz[i][j]="[Multiplataforma]";
        	}
        	if (mi_matriz[i][j].equals("[DAW]")) {
        		mi_matriz[i][j]="[WEB]";
        	}
        	System.out.println(mi_matriz[i][j]);
        }
        }
    System.out.println("_________________________________________________");
    Scanner s = new Scanner(System.in);
    String fila,columna;
    int filaInt,columnaInt;
    String texto;
    String respuesta;
    
    do {
    System.out.println("Introduce el número de fila:");
    fila=s.nextLine();
    if (fila.equals("salir")) break;
    filaInt=Integer.parseInt(fila);
    System.out.println("Introduce el número de columna:");
    columna=s.nextLine();
    if (columna.equals("salir")) break;
    columnaInt=Integer.parseInt(columna);
    System.out.println("Introduce el texto:");
    texto=s.nextLine();
    if (columna.equals("salir")) break;
    
   
    if (!mi_matriz[filaInt][columnaInt].equals("[   ]")) {
    	System.out.println("¿Deseas cambiar el texto "+mi_matriz[filaInt][columnaInt]+" por "+texto+"?: si / no ");
    	respuesta=s.nextLine();
    	if (respuesta.equals("si")) {
    		mi_matriz[filaInt][columnaInt]=texto;
    	}
    }
    if (mi_matriz[filaInt][columnaInt].equals("[   ]")) {
    	mi_matriz[filaInt][columnaInt]=texto;
    }
    }while(true);

for (int i = 0; i < mi_matriz.length; i++) {
    for (int j = 0; j < mi_matriz[i].length; j++) {
    	System.out.print(mi_matriz[i][j]);
    }
    System.out.println("");
    }
}
}


/* 1º Representa en JAVA la siguiente matriz con los datos y posicionados según la imagen.
2º Saca por la terminal el número de elementos con DAM y DAW que existen en la matriz.
3ª Imprime todos los datos de la matriz
4º Remplaza los textos DAM por el texto Multiplataforma y los DAW por WEB
5º Vuelve a imprimir los datos de la matriz
6ª Pide por la terminal un numero de fila y un numero de columna, luego el texto que quieres incluir. Pedirá nuevas inserciones hasta que pongamos salir.
Ejemplo: Columna: 0
 Fila: 3
 Texto: Hola.
Si ya existe algún texto en la Matriz indicará si queremos remplazar el texto (poniendo cual 
contiene por el nuevo).
 Ejemplo: Deseas cambiar el texto DAM por Hola? (S/N).
7º Imprime el resultado final de la matriz. */
