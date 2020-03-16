
public class TestaCondicioal2 {

	public static void main(String[] args) {

		System.out.println("testando condicionais");

		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;

		System.out.println("valor de acompanhando = " + acompanhado);

		if (idade >= 18 || acompanhado) {
			System.out.println("seja bem vindos");
		} else {
			System.out.println("infelizmente voce nao pode entrar");
		}

	}
}