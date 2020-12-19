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
public class Conta_Corrente_Basica extends Conta{
    
    //atributos
    //atributos já existem na classe mãe Conta
    
    //metodos
    public boolean sacar(float valor) throws Exception {
        float saldo_conta_basica = this.getSaldo();
        if (valor < 0) throw new Exception("Valor não pode ser negativo");
        if (saldo_conta_basica < valor) throw new Exception("Valor não disponível para o Saque");
        if((saldo_conta_basica - valor) > 0){
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
            return false;
    }
    
    public float sacarValor(float valor) throws Exception {
        float saldo_conta_basica = this.getSaldo();
        if (valor < 0) throw new Exception("Valor não disponível para o Saque");
        if (saldo_conta_basica < valor) throw new Exception("Valor não disponível para o Saque");
        if((saldo_conta_basica - valor) > 0){
            this.setSaldo(this.getSaldo() - valor);
        }
        return valor;
    }
   
    
    @Override
    public String getTipoDaConta() {
        return "Conta Corrente Básica";
    }
    
}
