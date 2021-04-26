package br.pucpcaldas.acoes;

public class CadastroProduto {

    public String nomeProduto;
    public float valorCustoProduto;
    public float valorFinalProduto;
    
    public CadastroProduto(String nomeProduto, float valorCustoProduto) {
        this.nomeProduto = nomeProduto;
        this.valorCustoProduto = valorCustoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getValorCustoProduto() {
        return valorCustoProduto;
    }

    public void setValorCustoProduto(float valorCustoProduto) {
        this.valorCustoProduto = valorCustoProduto;
    }

    public float getValorFinalProduto() {
        return valorFinalProduto;
    }

    public void setValorFinalProduto(float valorFinalProduto) {
        this.valorFinalProduto = valorFinalProduto;
    }
    
    public float calculaValorFinalProduto(){
        
        valorFinalProduto = valorCustoProduto + ((valorCustoProduto * 30)/100);
        return valorFinalProduto;
    }
    
}
