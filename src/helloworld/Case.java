package helloworld;

public class Case {

	public static void main(String[] args) {
		String sexo = "Lula";

		switch (sexo) {
		case ("Masculino"):
			System.out.println("Masc");
			break;
		case ("Feminino"):
			System.out.println("Fem");
			break;
		case ("N�o_Binario"):
			System.out.println("N�o bin");
			break;
			default:
				System.out.println("Default");
		}

	}

}
