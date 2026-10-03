package br.com.fiap.microservices.pedido.service;

import br.com.fiap.microservices.pedido.dto.CriarPedidoDTO;
import br.com.fiap.microservices.pedido.feign.CatalogFeignClient;
import br.com.fiap.microservices.pedido.feign.ClienteFeignClient;
import br.com.fiap.microservices.pedido.model.Pedido;
import br.com.fiap.microservices.pedido.repository.PedidoRepository;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PedidoService {
    private static final Logger logger = LoggerFactory.getLogger(PedidoService.class);

    private final PedidoRepository pedidoRepository;
    private final CatalogFeignClient catalogFeignClient;
    private final ClienteFeignClient clienteFeignClient;

    public PedidoService(PedidoRepository pedidoRepository,
                         CatalogFeignClient catalogFeignClient,
                         ClienteFeignClient clienteFeignClient){
        this.pedidoRepository = pedidoRepository;
        this.catalogFeignClient = catalogFeignClient;
        this.clienteFeignClient = clienteFeignClient;
    }
    @Transactional
    public Pedido criar(CriarPedidoDTO dto){
        logger.info("Criando novo pedido para um cliente ID:{}", dto.clienteId());


    }
}
