/*
 * Usuario.java
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

package br.dev.doxcode.framework.sistema;

/**
 * Interface pública representando um usuário do sistema para o framework padrão
 * Java da DoxCode.
 * 
 * @author Marcio Alves
 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
 */
public interface Usuario {
	/**
	 * Método público para atribuir o ID do usuário.
	 * 
	 * @param id O ID do usuário.
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	public void setId(int id);

	/**
	 * Método público para recuperar o ID do usuário.
	 * 
	 * @return O ID do usuário.
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	public int getId();

	/**
	 * Método público para atribuir o código do usuário.
	 * 
	 * @param codigo O código do usuário.
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	public void setCodigo(String codigo);

	/**
	 * Método público para recuperar o código do usuário.
	 * 
	 * @return O código do usuário.
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	public String getCodigo();

	/**
	 * Método público para atribuir o nome do usuário.
	 * 
	 * @param nome O nome do usuário.
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	public void setNome(String nome);

	/**
	 * Método público para recuperar o nome do usuário.
	 * 
	 * @return O nome do usuário.
	 * @author Marcio Alves
	 * @version 1.0.0 Criado em 02/Fevereiro/2023 por Marcio Alves.
	 */
	public String getNome();
}