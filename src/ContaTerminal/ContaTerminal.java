/**
 * 
 */
package ContaTerminal;

import java.util.Scanner;

/**
 * @author Victor
 *
 */
public class ContaTerminal {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello World");
		
		String agencia, nomeCliente;
		int numero;
		double saldo;
		
		System.out.println("Por favor, digite o número da Agência !");
		agencia = scan.nextLine();


		System.out.println("Por favor, digite o número da Conta !");
		numero = scan.nextInt();

		System.out.println("Por favor, digite o Nome do Cliente !");
		nomeCliente = scan.next();

		System.out.println("Por favor, digite o Saldo do Cliente !");
		saldo = scan.nextDouble();

		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

	}
}
