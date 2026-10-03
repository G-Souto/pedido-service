package br.com.fiap.microservices.pedido.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "cliente-service",
        url = "${app.cliente-service.url}"
)
public interface ClienteFeignClient {
    @GetMapping("/api/clientes/{id}")
    ClienteDTO buscarClientePorId(@PathVariable Long Id);
}
