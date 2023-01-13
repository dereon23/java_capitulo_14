package Capitulo14;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio3 {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Generando excepcion aleatoria");
		int aleat=(int)(Math.random()*5);
		switch(aleat) {
		case 0:
			throw new NumberFormatException();
		case 1:
			throw new IOException();
		case 2:
			throw new FileNotFoundException();
		case 3:
			throw new IndexOutOfBoundsException();
		case 4:
			throw new ArithmeticException();
		}
		
	}
	
}
