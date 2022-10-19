package Ordenacion;
import java.util.*;
public class PorInsercion {

    
		public static void ordenamientoPorInsercion(int A[], int n) {
			
			
			for (int i = 1; i < n; i++) {
				int valorC = A[i];
				int posicion = i;
				while((posicion > 0) && (A[posicion - 1] > valorC)) {
					A[posicion] = A[posicion - 1];
					posicion = posicion -1;
				}
				A[posicion] = valorC;
			}
			
			
		}
		
		public static void mostrarArreglo(int A [], int n) {
			for (int i = 0; i < n; i++) {
				System.out.println(A[i]+ "");
				
			}
			System.out.println();
		}
		public static void main(String[]args) {
			
         int cant;
		Scanner n=new Scanner(System.in);	
         
         
		do {	
			System.out.println("Cuantos datos desea digitar? max");
			cant=n.nextInt();
			if(cant<=0) {
				System.out.println("Error");
			}
		}while(cant<=0);
		
		switch (cant) {
		
		case 1:
		
			break;
		
		
		}
		
		System.out.println("Arreglo Original: ");
		
		mostrarArreglo(, A.length);
		
		
		}
		
	}


