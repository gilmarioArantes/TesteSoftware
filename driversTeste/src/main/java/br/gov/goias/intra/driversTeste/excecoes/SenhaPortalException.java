/**
 * Classe definida para disparar mensagem de erro relativamente à obtenção da senha do usuário do portal.
 * Data: 16/10/2015.
 * @author gilmar-fa
 *
 */
package br.gov.goias.intra.driversTeste.excecoes;

import br.gov.goias.intra.driversTeste.util.Mensagem;

public class SenhaPortalException extends Exception{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Construtor parametrizado
	 *
	 */
	public SenhaPortalException(){
		super(Mensagem.SENHA_PORTAL);
	}

}
