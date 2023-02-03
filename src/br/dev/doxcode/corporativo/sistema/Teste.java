package br.dev.doxcode.corporativo.sistema;

import br.dev.doxcode.framework.sistema.Usuario;

public class Teste {

	public static void main(String[] args) {
        System.out.println("Iniciando...");
        
        Usuario usuario = new UsuarioCorporativo();
        usuario.setId(1000000);
        usuario.setCodigo("000.001");
        usuario.setNome("Administrador do sistema");
        
        System.out.println("...finalizando");
	}

}
