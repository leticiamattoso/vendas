package br.pucpcaldas.acoes.dominio;


import static org.junit.Assert.assertTrue;

import org.joda.time.LocalDate;
import org.junit.Ignore;
import org.junit.Test;

public class VendasBuilderTest {
    
    @Test
    public void deveRetornarUmaCompra(){
        VendasBuilder builder = new VendasBuilder();

        Vendas umaVenda = builder.produto("Notebook Dell").preco(2000).quantidade(2).precoTotal(4000)
        .data(LocalDate.now()).build();
    }
}
