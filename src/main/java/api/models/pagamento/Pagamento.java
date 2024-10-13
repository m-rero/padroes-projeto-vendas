package api.models.pagamento;

import api.models.pagamento.enums.TipoPagamento;


public class Pagamento {
    private Integer id;
    private TipoPagamento tipo;
    private DadosPagamento dadosPagamento;
    private Double valor;

    public Pagamento(TipoPagamento tipo, DadosPagamento dadosPagamento, Double valor) {
        this.tipo = tipo;
        this.dadosPagamento = dadosPagamento;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public TipoPagamento getTipo() {
        return tipo;
    }

    public DadosPagamento getDadosPagamento() {
        return dadosPagamento;
    }

    public Double getValor() {
        return valor;
    }
}