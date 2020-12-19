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
public class Conta_Corrente_Limite extends Conta_Corrente_Basica{
    
    //atributos
    private float conta_limite;
    
    //metodos

    /**
     * @return the conta_limite
     */
    public float getConta_limite() {
        return conta_limite;
    }

    /**
     * @param conta_limite the conta_limite to set
     */
    public float setConta_limite(float conta_limite) {
       return this.conta_limite = conta_limite;
    }
    
    @Override
    public String toString(){
        return "Limite: " + conta_limite;
    }
    
    public boolean sacar(float valor) throws Exception {
        if(valor<0) throw new Exception("Não pode sacar um valor negativo");
        if(valor>conta_limite) throw new Exception("Você não pode sacar mais do que o Limite");
        if(valor>this.getSaldo()) throw new Exception("Não possui saldo suficiente");
        float saldo_com_Limite = this.getSaldo() + conta_limite;
        if((saldo_com_Limite - valor) >= 0){
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
            return false;
    }
    
    public float sacarValor(float valor) throws Exception {
        if(valor<0) throw new Exception("Não pode sacar um valor negativo");
        if(valor>conta_limite) throw new Exception("Você não pode sacar mais do que o Limite");
        if(valor>this.getSaldo()) throw new Exception("Não possui saldo suficiente");
        float saldo_com_Limite = this.getSaldo() + conta_limite;
        if((saldo_com_Limite - valor) >= 0){
            this.setSaldo(this.getSaldo() - valor);
        }
            return this.getSaldo();
    }
    
        
    @Override
    public String getTipoDaConta() {
        return "Conta Corrente com Limite";
    }
    
}
