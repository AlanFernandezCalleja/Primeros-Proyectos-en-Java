package Ejercicio1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//una matriz de 3x3  del 1 al nueve
		Scanner s = new Scanner (System.in);
		System.out.println("Inserte cantidad de columnas: ");
		int col =s.nextInt();
		System.out.println("Inserte cantidad de filas: ");
		int fil =s.nextInt();
		
		int [][]Matriz = new int [fil+1][col+1];
		int ind2=0;
		int ind1=0;
		
		for (int i = 0 ; i< fil+1; i++) {
			for (int j = 0 ;j<col+1;j++) {
				if (j*i==0) {
					Matriz[i][j]=ind1;
					ind1++;
					Matriz [i][0]=ind2;
					if (j==0) {
						ind2++;
					}
					
					
					
				}else {
					
					Matriz[i][j]=i*j;
	
				}
				
				
			}
			
			
			
			
		}
		
		
		for (int i = 0 ; i< Matriz.length ; i++) {
			for (int j = 0 ;j<Matriz[i].length;j++) {
				if (i==0 && j==0) {
					System.out.print("X\t");
				}else {
					System.out.print(Matriz[i][j]+"\t");
				}
				
			}
			System.out.println();
		}
		
		
	}
	
	
}
