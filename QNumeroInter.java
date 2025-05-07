/*
 * QNumeroEntre.java
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class QNumeroInter {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		//Matheus de sousa do nascimento
		
		int num;
		int quantEntre = 0;
		int quantFora = 0;
		
		for(int x = 1; x<=10; x++){
			System.out.print("Digite um numero: ");
			num = entrada.nextInt();
			
			if(num >= 10 && num <= 20){
				quantEntre += 1;
			}else{
				quantFora += 1;
			}
				
		}
		System.out.print("A quantidade de numero entre 10 e 20 e "+ quantEntre+", e aquantidade fora desse intervalo "+ quantFora);
	}
}
