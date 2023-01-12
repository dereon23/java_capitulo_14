package Capitulo14;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		boolean continuar=true;
		Scanner s = new Scanner(System.in);
		int num, nummax=0;
		
		for(int i=0; i<6;i++) {
			continuar=true;
			while(continuar) {
				try {
				continuar=true;
				System.out.println("Introduzca un numero");
				num=Integer.parseInt(s.nextLine());
				if(i==0) {
					nummax=num;
				}else {
					if(num>nummax) {
						nummax=num;
					}
				}
				continuar=false;
				}catch(NumberFormatException e) {
					System.out.println("Hay que ingresar un numero entero. Intente de nuevo");
				}
			}
		}
		System.out.println("El mayor es: "+nummax);
	}
	
}
