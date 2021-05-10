package br.pucpcaldas.acoes.dominio;

import org.junit.Test;

import br.pucpcaldas.acoes.CadastroProduto;
import br.pucpcaldas.acoes.Vendas;
public class CadastroProdutoTeste {
    
    @Test(expected = IllegalArgumentException.class)

    public void deveRetornarErroParaValorCustoMenorQueZero(){
        // Arranjo, Ação, Asserção
        CadastroProduto umProduto = new CadastroProduto("Notebook Dell", 0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroParaProdutoInexistente(){
        // Arranjo, Ação, Asserção
        CadastroProduto umProduto = new CadastroProduto("Notebook Samsung", 2000);
    }
}
