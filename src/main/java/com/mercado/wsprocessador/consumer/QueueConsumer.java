package com.mercado.wsprocessador.consumer;

import com.mercado.ws.entity.Pedido;
import com.mercado.ws.entity.dto.AtualizarStatusPedidoDTO;
import com.mercado.wsprocessador.constants.FilaConstants;
import com.mercado.wsprocessador.service.PedidoService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueueConsumer {

    private PedidoService pedidoService;

    @Autowired
    public QueueConsumer(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @RabbitListener(queues = FilaConstants.FILA_PEDIDOS)
    public void receberPedido(Pedido pedido) {
        pedidoService.processarPedido(pedido);
    }

    @RabbitListener(queues = FilaConstants.FILA_ATUALIZAR_PEDIDO)
    public void atualizarPedido(AtualizarStatusPedidoDTO atualizarStatusPedido) {
        pedidoService.atualizarStatusPedido(atualizarStatusPedido);
    }

}
