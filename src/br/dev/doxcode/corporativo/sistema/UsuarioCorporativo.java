/*
 * UsuarioCorporativo.java
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

package br.dev.doxcode.corporativo.sistema;

import br.dev.doxcode.framework.sistema.Usuario;
import br.dev.doxcode.framework.exception.NegativeNumberArgumentException;
import br.dev.doxcode.framework.exception.MaximumNumberArgumentException;

/**
 * Classe pública implementando um usuário do sistema corporativo.
 * 
 * @author Marcio Alves
 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
 */
public class UsuarioCorporativo implements Usuario {
	/**
	 * Atributo privado com o ID do usuário corporativo.
	 * 
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	private int id;

	/**
	 * Atributo privado com o código do usuário corporativo.
	 * 
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	private String codigo;

	/**
	 * Atributo privado com o nome do usuário corporativo.
	 * 
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	private String nome;

	/**
	 * Constante pública indicando a quantidade máxima de dígitos para o ID do
	 * usuário corporativo.
	 * 
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	public static final int QUANTIDADE_MAXIMA_DIGITOS_ID = 6;

	/**
	 * Construtor padrão somente limpa atributos.
	 * 
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	public UsuarioCorporativo() {

	}

	/**
	 * Método público para atribuir o ID do usuário corporativo.
	 * Válido somente para números entre 0 e 999999.
	 * 
	 * 
	 * @param id O ID do usuário corporativo.
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	@Override
	public void setId(int id) {
		if (id < 0) {
			throw new NegativeNumberArgumentException("O ID do usuário corporativo não deve ser um número negativo!");
		}
		
		if (id > 999999) {
			throw new MaximumNumberArgumentException("O número máximo para um ID do usuário corporativo foi excedido!");
		}
		
		this.id = id;
	}

	/**
	 * Método público para recuperar o ID do usuário corporativo.
	 * 
	 * @return O ID do usuário corporativo.
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	@Override
	public int getId() {
		return this.id;
	}

	/**
	 * Método público para atribuir o código do usuário corporativo.
	 * 
	 * @param codigo O código do usuário.
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	@Override
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Método público para recuperar o código do usuário corporativo.
	 * 
	 * @return O código do usuário.
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	@Override
	public String getCodigo() {
		return this.codigo;
	}

	/**
	 * Método público para atribuir o nome do usuário corporativo.
	 * 
	 * @param nome O nome do usuário.
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Método público para recuperar o nome do usuário corporativo.
	 * 
	 * @return O nome do usuário.
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	@Override
	public String getNome() {
		return this.nome;
	}
}