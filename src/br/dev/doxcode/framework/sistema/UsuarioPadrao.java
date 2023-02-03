/*
 * UsuarioPadrao.java
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

import br.dev.doxcode.framework.exception.NegativeNumberArgumentException;
import br.dev.doxcode.framework.exception.MaximumNumberArgumentException;
import br.dev.doxcode.framework.exception.LengthArgumentException;

/**
 * Classe pública implementando um usuário padrão.
 * 
 * @author Marcio Alves
 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
 */
public abstract class UsuarioPadrao implements Usuario {
	/**
	 * Atributo privado com o ID do usuário padrão.
	 * 
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	private int id;

	/**
	 * Atributo privado com o código do usuário padrão.
	 * 
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	private String codigo;

	/**
	 * Atributo privado com o nome do usuário padrão.
	 * 
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	private String nome;

	/**
	 * Atributo privado com o login do usuário padrão.
	 * 
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	private String login;

	/**
	 * Atributo privado com a senha do usuário padrão.
	 * 
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	private String senha;

	/**
	 * Constante pública indicando a quantidade máxima de dígitos para o ID do
	 * usuário padrão.
	 * 
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	public static final int QUANTIDADE_MAXIMA_DIGITOS_ID = 6;
	
	/**
	 * Constante pública indicando a quantidade máxima de caracteres para o código do
	 * usuário padrão.
	 * 
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	public static final int QUANTIDADE_MAXIMA_CARACTERES_CODIGO = 25;
	
	/**
	 * Constante pública indicando a quantidade máxima de caracteres para o nome do
	 * usuário padrão.
	 * 
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	public static final int QUANTIDADE_MAXIMA_CARACTERES_NOME = 100;
	
	/**
	 * Constante pública indicando a quantidade máxima de caracteres para o login do
	 * usuário padrão.
	 * 
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	public static final int QUANTIDADE_MAXIMA_CARACTERES_LOGIN = 75;
	
	/**
	 * Constante pública indicando a quantidade máxima de caracteres para a senha do
	 * usuário padrão.
	 * 
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	public static final int QUANTIDADE_MAXIMA_CARACTERES_SENHA = 75;

	/**
	 * Construtor padrão somente limpa atributos.
	 * 
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	public UsuarioCorporativo() {
		this.limpar();
	}

	/**
	 * Método público para atribuir o ID do usuário padrão.
	 * Válido somente para números entre 0 e 999999.
	 * 
	 * @param id O ID do usuário corporativo.
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	@Override
	public void setId(int id) {
		if (id < 0) {
			throw new NegativeNumberArgumentException("O ID do usuário não deve ser um número negativo!");
		}
		
		if (id > 999999) {
			throw new MaximumNumberArgumentException("O número máximo para um ID do usuáriofoi excedido!");
		}
		
		this.id = id;
	}

	/**
	 * Método público para recuperar o ID do usuário padrão.
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
	 * Método público para atribuir o código do usuário padrão.
	 * 
	 * @param codigo O código do usuário.
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	@Override
	public void setCodigo(String codigo) {
		if (codigo.length() > UsuarioCorporativo.QUANTIDADE_MAXIMA_CARACTERES_CODIGO) {
			throw new LengthArgumentException("O tamanho máximo para o código do usuário foi excedido!");
		}

		this.codigo = codigo;
	}

	/**
	 * Método público para recuperar o código do usuário padrão.
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
	 * Método público para atribuir o nome do usuário padrão.
	 * 
	 * @param nome O nome do usuário.
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	@Override
	public void setNome(String nome) {
		if (nome.length() > UsuarioCorporativo.QUANTIDADE_MAXIMA_CARACTERES_NOME) {
			throw new LengthArgumentException("O tamanho máximo para o nome do usuário foi excedido!");
		}

		this.nome = nome;
	}

	/**
	 * Método público para recuperar o nome do usuário padrão.
	 * 
	 * @return O nome do usuário.
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	@Override
	public String getNome() {
		return this.nome;
	}

	/**
	 * Método público para atribuir o login do usuário padrão.
	 * 
	 * @param login O login do usuário.
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	@Override
	public void setLogin(String login) {
		if (login.length() > UsuarioCorporativo.QUANTIDADE_MAXIMA_CARACTERES_LOGIN) {
			throw new LengthArgumentException("O tamanho máximo para o login do usuário foi excedido!");
		}

		this.login = login;
	}

	/**
	 * Método público para recuperar o login do usuário padrão.
	 * 
	 * @return O login do usuário.
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	@Override
	public String getLogin() {
		return this.login;
	}
	
	/**
	 * Método público para atribuir a senha do usuário padrão.
	 * 
	 * @param senha A senha do usuário.
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	@Override
	public void setSenha(String senha) {
		if (senha.length() > UsuarioCorporativo.QUANTIDADE_MAXIMA_CARACTERES_SENHA) {
			throw new LengthArgumentException("O tamanho máximo para a senha do usuário foi excedido!");
		}

		this.senha = senha;
	}

	/**
	 * Método público para recuperar a senha do usuário padrão.
	 * 
	 * @return A senha do usuário.
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	@Override
	public String getSenha() {
		return this.senha;
	}	

	/**
	 * Método público para limpar os atributos de um usuário padrão.
	 * 
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	@Override
	public void limpar() {
		this.id = 0;
		this.codigo = "";
		this.nome = "";
		this.login = "";
		this.senha = "";
	}
}
