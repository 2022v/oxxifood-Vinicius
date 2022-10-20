package br.com.ifpe.oxxifoodVinicius.modelo.cliente;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.ifpe.oxxifoodVinicius.modelo.produto.CategoriaProduto;
import br.com.ifpe.oxxifoodVinicius.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Cliente")
@Where(clause = "habilitado = true")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends EntidadeAuditavel{
	private static final long serialVersionUID = 2398265627921787300L;
	


	@NotNull
    @Column(nullable = false)
    private String chaveEmpresa;
    
    @Column
    private String nome;
    
    @Column
    private String cpf;
    
    @Column
    private String fone;
    
    @Column
    private String foneAlternativo;
	
	
	
	
	
	
	

}
