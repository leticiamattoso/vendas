package br.pucpcaldas.acoes.dominio;


import org.joda.time.LocalDate;

import org.junit.Test;

import br.pucpcaldas.acoes.Vendas;

public class VendasTeste {
    
    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroParaProdutoInexistente(){
        // Arranjo, Ação, Asserção
        Vendas umaVenda = new Vendas("Notebook Samsung", 1000, 2, 2000, LocalDate.now());
    }
    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroParaPrecoNegativo(){
        // Arranjo, Ação, Asserção
        Vendas umaVenda = new Vendas("Notebook Dell", -1000, 2, 2000, LocalDate.now());
    }
    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroParaPrecoNulo(){
        // Arranjo, Ação, Asserção
        Vendas umaVenda = new Vendas("Notebook Dell", 0, 2, 2000, LocalDate.now());
    }
    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroParaQuantidadeNegativaOuNula(){
        // Arranjo, Ação, Asserção
        Vendas umaVenda = new Vendas("Notebook Dell", 1000, 0, 2000, LocalDate.now());
    }
    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroParaPrecoTotalNegativo(){
        // Arranjo, Ação, Asserção
        Vendas umaVenda = new Vendas("Notebook Dell", 1000, 2, -2000, LocalDate.now());
    }
    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroParaDataNula(){
        // Arranjo, Ação, Asserção
        Vendas umaVenda = new Vendas("Notebook Dell", 1000, 2, 2000, null);
    }
}
