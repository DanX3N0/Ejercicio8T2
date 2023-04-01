package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int valorDecimal = scan.nextInt();
		
		String resultado = convertToHex(valorDecimal);
		
		for(int i = resultado.length() - 1; i >= 0; i--) {
			System.out.print(resultado.charAt(i));
		}
	} 
	
	static String convertToHex(int value) {
		String resultado = "";
		int base = 16;
		int residuo = base + 1;
		
		while(value >= base) {
			
			residuo = value % base;
			if(residuo == 10) {
				resultado += "A";
			}else if(residuo == 11) {
				resultado += "B";
			}else if(residuo == 12) {
				resultado += "C";
			}else if(residuo == 13) {
				resultado += "D";
			}else if(residuo == 14) {
				resultado += "E";
			}else if(residuo == 15) {
				resultado += "F";
			}else {
				resultado += Integer.toString(residuo);
			}
			value /= base;
			
		}
		if(value == 10) {
			resultado += "A";
		}else if(value == 11) {
			resultado += "B";
		}else if(value == 12) {
			resultado += "C";
		}else if(value == 13) {
			resultado += "D";
		}else if(value == 14) {
			resultado += "E";
		}else if(value == 15) {
			resultado += "F";
		}else {
			resultado += Integer.toString(value);
		}	
		return resultado;
	}
		
}
