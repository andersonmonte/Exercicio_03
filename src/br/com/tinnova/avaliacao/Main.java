package br.com.tinnova.avaliacao;

import br.com.tinnova.avaliacao.util.Calculo;

public class Main {

	public static void main(String[] args) {
		int valor = 5;
		System.out.println("Fatorial de " + valor + "! = "
				+ (Calculo.fatorial(valor) == null ? "Valor Inválido" : Calculo.fatorial(valor)));
	}

}
