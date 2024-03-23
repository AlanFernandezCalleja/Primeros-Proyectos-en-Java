package conjeturaCollatz;
import java.util.*;
public class mainc {

	public static void main(String[] args) {
		
		//ArrayList<Integer>vectorus = new ArrayList<Integer>();
		System.out.print("Series de collatz : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int vec []= new int [1000];
		int mat [][] = new int [num][1000];
		for (int i = 0 ; i < num ;i++) {
			for (int j = 0 ; j < 1000 ;j++) {
				vec = serie_collatz(i+2);
				mat [i][j]= vec[j];
			}
		}
		for (int i = 0 ; i < num ;i++) {
			System.out.print("Serie " + (i+2) + " : ");
			for (int j = 1 ; j < 1000 ;j++) {
				if (mat[i][j]!=0) {
					
					System.out.print(mat[i][j]+" ");
				}
			}
			System.out.println();
		}
				
		
	}
	public static int [] serie_collatz(int num){
		int vector []= new int[1000];
		int i = 0;
		while (num>1) 
		{
			if (num % 2 == 0) {
				vector[i]= num/2;
				num = num/2;
				//System.out.println(num);
				
			}else {
				vector[i]=(num*3)+1;
				num =(num*3)+1;
				//System.out.println(num);
			}
			i++;
		}
		return vector;
	}

}
