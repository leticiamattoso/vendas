package Vendas;
import org.joda.time.LocalDate;

/**
 * Um objeto da classe <code>Vendas</code> armazena o nome do produto, preço,
 * do item, quantidade de itens, preço total e data 
 * 
 * @author Rodrigo | Letícia | Marcelo
 * @since 2020-04-24
 * @version 1.0
 */
public class Vendas {
    private final String produto;
    private final double preco;
    private final double quantidade;
    private final double precoTotal;
    private final LocalDate data;

    /**
     * Construtor da classe.
     * 
     * @param produto    Nome do produto
     * @param preco      preço do produto
     * @param quantidade quantidade de itens
     * @param precoTotal preço total
     * @param data       data da negociação
     */
    public Vendas(String produto, double preco, double quantidade, double precoTotal, LocalDate data) {

        if ((preco <= 0) || (precoTotal <= 0) || (quantidade <= 0) || (precoTotal <= 0))
            throw new IllegalArgumentException("valores negativos ou igual a zero não são permitidos.");

        if (precoTotal < preco)
            throw new IllegalArgumentException("preço total deve ser maior ou igual ao preço.");

        if (data == null)
            throw new IllegalArgumentException("data não pode ser nula.");

        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
        this.precoTotal = precoTotal;
        this.data = data;
    }

    /**
     * Retorna o nome do produto.
     * 
     * @return nome do produto
     */
    public String getProduto() {
        return produto;
    }

    /**
     * Retorna o preço.
     * 
     * @return preço do produto
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Retorna a quantidade.
     * 
     * @return quantidade
     */
    public double getQuantidade() {
        return quantidade;
    }

    /**
     * Retorna o preço total.
     * 
     * @return preço total.
     */
    public double getPrecoTotal() {
        return precoTotal;
    }

    
    /**
     * Retorna a data da compra
     * 
     * @return data da compra
     */
    public LocalDate getData() {
        return data;
    }

  
}