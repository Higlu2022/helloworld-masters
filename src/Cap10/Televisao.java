package Cap10;

public class Televisao implements Eletrodomesctico {

	@Override
	public void ligar() {
		System.out.println("Ligando a televis�o");

	}

	@Override
	public void desligar() {
		System.out.println("Desligando a televis�o");

	}

	public void trocarCanal() {
		System.out.println("Trocando de canal");

	}

}
