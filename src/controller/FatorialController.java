package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}
	
	public int fatorial(int num) {
		// Condição de parada: Quando o número for menor ou igual a 1, teremos percorrido todos os números anteriores ou a entrada inicial foi igual/menor a 1
		if (num <= 1) {
			return 1;
		}
		// Função para o termo n em função do termo anterior: Fatorial(N) = N * N(-1) * N(-2) ... * 1
		return num * fatorial(num - 1);
	}

}
