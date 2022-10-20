package br.com.wepdev.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.wepdev.model.Pagamento;

public interface PagamentoResource {

	
	@PostMapping
	ResponseEntity<Pagamento> pagamento(@RequestBody Pagamento pagamento);
}
