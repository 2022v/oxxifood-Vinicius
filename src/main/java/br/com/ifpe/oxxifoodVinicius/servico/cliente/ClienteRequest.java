package br.com.ifpe.oxxifoodVinicius.servico.cliente;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.ifpe.oxxifoodVinicius.modelo.cliente.Cliente;
import br.com.ifpe.oxxifoodVinicius.modelo.produto.CategoriaProduto;
import br.com.ifpe.oxxifoodVinicius.servico.produto.CategoriaProdutoRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRequest {
	
private String chaveEmpresa;
    
    private String nome;
    
    private String cpf;
    
    private String fone;
    
    private String foneAlternativo;
    
    public Cliente buildCliente() {

	return Cliente.builder()
		.chaveEmpresa(chaveEmpresa)
		.nome(nome)
		.cpf(cpf)
		.fone(fone)
		.foneAlternativo(foneAlternativo)
		.build();
    }

}
