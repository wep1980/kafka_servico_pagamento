package br.com.wepdev.service.impl;

import java.io.Serializable;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import br.com.wepdev.model.Pagamento;
import br.com.wepdev.service.PagamentoService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor // Cria construtor
@Log4j2
@Service
public class PagamentoServiceImpl implements PagamentoService{
	
	
	private final KafkaTemplate<String, Serializable> kafkaTemplate;

	@SneakyThrows // O comando de Thread chamado abaixo pode gerar uma exception, com essa annotattion evitar ser feito esse tratamento aqui
	@Override
	public void enviarPagamento(Pagamento pagamento) {

		log.info("Recebi o pagamento {}", pagamento);
		Thread.sleep(1000);
		
		log.info("Enviando pagamento... ");
		kafkaTemplate.send("pagamento-topic", pagamento);
	}

}
