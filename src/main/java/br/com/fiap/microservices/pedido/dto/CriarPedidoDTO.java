package br.com.fiap.microservices.pedido.dto;

import br.com.fiap.microservices.pedido.model.ItemPedido;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

public record CriarPedidoDTO(
        @NotNull(message = "ID do cliente é obrigatorio ")
        Long clienteId,
        @NotEmpty(message = "Pedido deve ter apenas um item")
        List<ItemPedido> itens
) {
}
