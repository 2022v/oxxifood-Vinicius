package br.com.ifpe.oxxifoodVinicius.modelo.produto;

import br.com.ifpe.oxxifoodVinicius.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class CategoriaProduto extends EntidadeAuditavel{

	private static final long serialVersionUID = -4813566749757286493L;
	
	private String chaveEmpresa;
	
	private String descricao;
	
	

}
