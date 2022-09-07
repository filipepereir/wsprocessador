package com.mercado.wsprocessador.service;

import com.mercado.ws.entity.Pedido;
import com.mercado.ws.entity.dto.AtualizarStatusPedidoDTO;
import com.mercado.ws.entity.enums.StatusPedido;
import com.mercado.wsprocessador.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    public PedidoRepository pedidoRepository;

    @Autowired
    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public void processarPedido(Pedido pedido) {
        var pedidoBuscado = buscarPedido(pedido.getCodigo());
        pedidoBuscado.setStatusPedido(StatusPedido.EM_ANDAMENTO);
        atualizarPedido(pedidoBuscado);
    }

    public void atualizarStatusPedido(AtualizarStatusPedidoDTO atualizarStatusPedido) {
        var pedidoBuscado = buscarPedido(atualizarStatusPedido.getCodigoPedido());
        pedidoBuscado.setStatusPedido(atualizarStatusPedido.getStatus());
        atualizarPedido(pedidoBuscado);
    }

    private Pedido buscarPedido(String codigo) {
        return pedidoRepository.findById(codigo).orElse(null);
    }

    public void atualizarPedido(Pedido pedido) {
        pedidoRepository.save(pedido);
    }
}
