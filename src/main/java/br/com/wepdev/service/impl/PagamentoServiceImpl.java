package br.com.wepdev.service.impl;

import org.springframework.stereotype.Service;

import br.com.wepdev.model.Pagamento;
import br.com.wepdev.service.PagamentoService;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class PagamentoServiceImpl implements PagamentoService{

	@Override
	public void enviarPagamento(Pagamento pagamento) {

		log.info("PAGAMENTO_SERVICE_IMPL ::: Recebi o pagamento {}", pagamento);
	}

}
