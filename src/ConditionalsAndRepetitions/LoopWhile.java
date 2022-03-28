package ConditionalsAndRepetitions;

import java.util.Arrays;

public class LoopWhile {
	public void inscriptions() {
		String[] inscritos = {
				"MARCOS",
				"ALINE",
				"LUCAS",
				"PATRICIA",
				"JOAO",
		};
		
		final int numeroVagas = 3;
		
		String[] vagas = new String[numeroVagas];
		
		int vagaAtual = 0;
		StringBuilder stringBuilder = new StringBuilder();
		String inscrito = "Indefinido";
		StringBuilder log = null;
		
		while (vagaAtual < numeroVagas) {
			inscrito = inscritos[vagaAtual];
			
			log = stringBuilder
					.append("Adicionando a inscrição: ").append(inscrito)
					.append("\nNa vaga: ").append(vagaAtual + 1)
					.append("\n--------\n\n");
			
			vagas[vagaAtual] = inscrito;
			vagaAtual += 1;
		}

		System.out.println("Array com os 3 primeiros nomes: " + Arrays.toString(vagas) + "\n");
		System.out.println(log);
	}
}
