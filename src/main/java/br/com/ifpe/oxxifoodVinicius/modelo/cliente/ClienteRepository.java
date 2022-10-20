package br.com.ifpe.oxxifoodVinicius.modelo.cliente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import br.com.ifpe.oxxifoodVinicius.modelo.produto.CategoriaProduto;

public interface ClienteRepository extends JpaRepository<Cliente, Long>, JpaSpecificationExecutor<Cliente>{
	
	

}
