/*
 * NegativeNumberArgumentException.java
 *
 * Copyright (C) 2023 DoxCode Tecnologia e Informação LTDA 
 *
 * Outras informações podem ser obtidas em:
 *     https://www.doxcode.dev.br 
 *
 * Autor(es): Marcio Alves (marcioalv@yahoo.com.br)
 *
 * Criado em 02/Fevereiro/2023 por Marcio Alves (versão 1.0.0).
 */

package br.dev.doxcode.framework.exception;

/**
 * Exceção lançada para número negativos.
 * 
 * @author Marcio Alves
 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
 */
public class NegativeNumberArgumentException extends RuntimeException {
	/**
	 * Constante de serialização da classe.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Construtor padrão que inicializa mensagem.
	 * 
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	public NegativeNumberArgumentException(String message) {
		super(message);
	}
}