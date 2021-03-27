package br.com.tinnova.avaliacao.util;

public class Calculo {
	public static Integer fatorial(int valor) {
		if (valor < 0) {
			return null;
		} else {
			if (valor == 0 || valor == 1) {
				return 1;
			} else {
				return valor * fatorial(valor - 1);
			}
		}
	}
}
