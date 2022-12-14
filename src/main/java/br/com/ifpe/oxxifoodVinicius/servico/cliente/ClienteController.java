package br.com.ifpe.oxxifoodVinicius.servico.cliente;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxxifoodVinicius.modelo.cliente.Cliente;
import br.com.ifpe.oxxifoodVinicius.modelo.cliente.ClienteService;
import br.com.ifpe.oxxifoodVinicius.modelo.produto.CategoriaProduto;
import br.com.ifpe.oxxifoodVinicius.modelo.produto.CategoriaProdutoService;
import br.com.ifpe.oxxifoodVinicius.servico.produto.CategoriaProdutoRequest;
import br.com.ifpe.oxxifoodVinicius.util.entity.GenericController;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController extends GenericController {
	 @Autowired
	    private ClienteService clienteService;

	    @PostMapping
	    public ResponseEntity<Cliente> save(@RequestBody @Valid ClienteRequest request) {

		Cliente clienteRequisicao = request.buildCliente();
		Cliente clienteSalvo = clienteService.save(clienteRequisicao);
		return new ResponseEntity<Cliente>(clienteSalvo, HttpStatus.CREATED);
	    }

	}
