package br.pucpcaldas.acoes.dominio;



import org.joda.time.LocalDate;
import org.junit.Test;

import br.pucpcaldas.acoes.VendasBuilder;

public class VendasBuilderTest {
    

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroParaProdutoInexistente(){
        VendasBuilder builder = new VendasBuilder();

        new VendasBuilder().produto("camisa")
        .preco(2000)
        .quantidade(2)
        .precoTotal(4000)
        .data(LocalDate.now())
        .build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroParaPrecoNegativo(){
        VendasBuilder builder = new VendasBuilder();

        new VendasBuilder().produto("Notebook Asus")
        .preco(-2000)
        .quantidade(2)
        .precoTotal(4000)
        .data(LocalDate.now()).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroParaQuantidadeNegativa(){
        VendasBuilder builder = new VendasBuilder();

        new VendasBuilder().produto("Notebook Dell")
        .preco(2000)
        .quantidade(-2)
        .precoTotal(4000)
        .data(LocalDate.now()).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroParaPrecoTotalNegativo(){
        VendasBuilder builder = new VendasBuilder();

        new VendasBuilder().produto("Notebook Dell")
        .preco(2000)
        .quantidade(2)
        .precoTotal(-4000)
        .data(LocalDate.now()).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroParaDataNula(){
        VendasBuilder builder = new VendasBuilder();

        new VendasBuilder().produto("Notebook Dell")
        .preco(2000)
        .quantidade(2)
        .precoTotal(4000)
        .data(null).build();
    }
}
