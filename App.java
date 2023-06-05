package prjtCalculadora;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		Scanner in = new Scanner(System.in);
		
		int operacao;
		
		System.out.println("Digite o Primeiro Número: "); 
		calc.numero1 = in.nextInt();
		
		System.out.println("Digite o Segundo Número" );
		calc.numero2 = in.nextInt();
		
		System.out.print("\nDigite 1 para + \nDigite 2 para - \nDigite 3 para ÷ \nDigite 4 para x \n" );
		operacao = in.nextInt();
		
		switch (operacao) {
		case 1:
			calc.somar();
			break;
		case 2:
			calc.subtrair();
			break;
		case 3:
			calc.dividir();
			break;
		case 4:
			calc.multiplicar();
			break;
			default:
				System.out.println("Operador inválido");
		}
		
		System.out.println(calc.resultado);

	}

}
