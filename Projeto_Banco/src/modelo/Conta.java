/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Giu
 */
abstract public class Conta {
    
    //atributos
    private String nome_cliente;
    private int numero_conta;
    private float saldo = 0.00f;
    
    //metodos
    public Conta(){}
    public Conta(String nome_cliente, int numero_conta, float saldo)
     throws Exception{
        this.nome_cliente = nome_cliente;
        if(numero_conta<0) throw new Exception("Número da conta não pode ser negativa");
        this.numero_conta = numero_conta;
        this.saldo = saldo;
    }
    
    /**
     * @return the nome_cliente
     */
    public String getNome_cliente() {
        return nome_cliente;
    }

    /**
     * @param nome_cliente the nome_cliente to set
     */
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    /**
     * @return the numero_conta
     */
    public int getNumero_conta() {
        return numero_conta;
    }

    /**
     * @param numero_conta the numero_conta to set
     */
    public void setNumero_conta(int numero_conta) throws Exception {
        if(numero_conta<0) throw new Exception("Número da conta não pode ser negativa");
        this.numero_conta = numero_conta;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
       
    

    @Override
    public String toString(){
        return "Saldo: " + saldo +
               "Número da Conta: " + numero_conta;
    }
    
    public boolean depositar (float valor) throws Exception {
        if(valor<0) throw new Exception("Não pode depositar um valor negativo");
        if((valor)>0){    
        saldo += valor;
            return true;
        }
            return false;
    }
    
    public float depositarvalor (float valor) throws Exception {
        if(valor<0) throw new Exception("Não pode depositar um valor negativo");
        saldo += valor;
        return saldo;
    }
    
    public boolean sacar(float valor) throws Exception {
        if(valor>saldo) throw new Exception("Não possui saldo suficiente");
        if(valor<0) throw new Exception("Não pode sacar um valor negativo");
        if((valor)>0){
            saldo-=valor;
            return true;
        }
            return false;
    }
    
    public float sacarvalor(float valor) throws Exception {
        if(valor>saldo) throw new Exception("Não possui saldo suficiente");
        if(valor<0) throw new Exception("Não pode sacar um valor negativo");
        if((valor-valor)>0){
            saldo-=valor;
    } return saldo;
    }
      
    
    public abstract String getTipoDaConta();
    //public abstract float deposito();
    //public abstract float saque();

    
    
    
}
