package br.com.wepdev.resource.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wepdev.model.Pagamento;
import br.com.wepdev.resource.PagamentoResource;
import br.com.wepdev.service.PagamentoService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/pagamentos")
public class PagamentoResourceImpl implements PagamentoResource{

	
	private final PagamentoService pagamentoService;
	
	
	@Override
	public ResponseEntity<Pagamento> pagamento(Pagamento pagamento) {
		pagamentoService.enviarPagamento(pagamento);
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
