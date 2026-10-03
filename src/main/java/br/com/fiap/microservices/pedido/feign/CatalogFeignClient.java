package br.com.fiap.microservices.pedido.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name ="Catalogo-service",
        url="${app.catalogo-service.url}"
)
public interface CatalogFeignClient {
    @GetMapping("/api/catalogo/produtos/{id}")
    ProdutoDTO buscarProdutoPorId(@pathvariable Long id);
}
