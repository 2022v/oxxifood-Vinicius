package br.com.ifpe.oxxifoodVinicius.modelo.cliente;

import javax.transaction.Transactional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifpe.oxxifoodVinicius.modelo.produto.CategoriaProduto;
import br.com.ifpe.oxxifoodVinicius.modelo.produto.CategoriaProdutoRepository;
import br.com.ifpe.oxxifoodVinicius.util.entity.GenericService;
import br.com.ifpe.oxxifoodVinicius.util.exception.EntityAlreadyExistsException;

@Service
public class ClienteService extends GenericService{
	
	@Autowired
    private ClienteRepository repository;

	@Transactional
    public Cliente save(Cliente cliente) {
		super.preencherCamposAuditoria(cliente);
		return repository.save(cliente);
	    }
}

