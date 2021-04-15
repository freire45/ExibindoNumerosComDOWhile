package br.com.erickfreire.exibindonumeroscomdowhile;

/**
 * Programa em Java que exibi os valores de 1 a 10 com Do while
 * @author Erick Freire
 * @version 1 - Criado em 15-04-2021 as 15:25
 */

public class ExibindoNumerosComDOWhile {

	public static void main(String[] args) {
		
		int contador = 1;
		
		do
		{
			System.out.printf("%d ", contador);
			++contador;
		} while (contador <= 10);
		
		System.out.println();

	}

}
