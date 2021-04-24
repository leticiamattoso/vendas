package Vendas;
import org.joda.time.LocalDate;

public class VendasBuilder {

    private String _produto;
    private double _preco;
    private double _quantidade;
    private double _precoTotal;
    private LocalDate _data;

    public VendasBuilder produto(String produto) {
        this._produto = produto;
        return this;
    }

    public VendasBuilder preco(double preco) {
        this._preco = preco;

        return this;
    }

    public VendasBuilder quantidade(double quantidade) {
        this._quantidade = quantidade;

        return this;
    }

    public VendasBuilder precoTotal(double precoTotal) {
        this._precoTotal = precoTotal;

        return this;
    }


    public VendasBuilder data(LocalDate data) {
        this._data = data;
        return this;
    }

    public Vendas build() {
        return new Vendas(this._produto, this._preco, this._quantidade, 
            this._precoTotal, this._data);
    }
}