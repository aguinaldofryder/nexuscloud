package br.com.nexuscloud.cadastro.model;


public enum tiposEndereco {    
    PRINCIPAL(1), COBRANÇA(2), COMERCIAL(3), ENTREGA(4);
     
    private final int valor;
    tiposEndereco(int valorOpcao){
        valor = valorOpcao;
    }
    public int getValor(){
        return valor;
    }
}