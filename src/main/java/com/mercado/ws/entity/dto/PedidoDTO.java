package com.mercado.ws.entity.dto;

import com.mercado.ws.entity.enums.StatusPedido;

import java.io.Serializable;

public class PedidoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String codigo;
    private Integer codUsuario;
    private Integer codMercado;
    private StatusPedido statusPedido;
    private String descricao;
    private Integer quantidade;
    private Double valor;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Integer getCodMercado() {
        return codMercado;
    }

    public void setCodMercado(Integer codMercado) {
        this.codMercado = codMercado;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
