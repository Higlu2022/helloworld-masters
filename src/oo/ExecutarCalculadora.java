package oo;

public class ExecutarCalculadora {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
			
//		System.out.println("A soma dos valores �: " + calculadora.somar(20, 20));
//		System.out.println("A subtra��o dos valores �: " + calculadora.subtrair(210, 10));
//		System.out.println("A multiplica��o dos valores �: " + calculadora.multiplicar(20, 20));
//		System.out.println("A divis�o dos valores �: " + calculadora.dividir(20.0, 20.0));
//		System.out.println("A soma de todos os valores �: " + calculadora.somar(10, 20, 30, 40, 50));
//		System.out.println("O valor " + calculadora.acharUmNumero (10, 20, 30, 40, 50, 6) + " tem na lista!!!");
		
		System.out.println("M�todos subtrair sobrecarregados: \n ");
		System.out.println("Chamando a vers�o de subtrair com 2 double: " + calculadora.subtrair(5.0, 2.0));
		System.out.println("Chamando a vers�o de subtrair com 1 double e 1 int: " + calculadora.subtrair(5.0, 2));
		System.out.println("Chamando a vers�o de subtrair com 1 int e 1 double: " + calculadora.subtrair(5, 2.0));
		
	}

}
