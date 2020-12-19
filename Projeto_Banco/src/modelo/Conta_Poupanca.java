/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;

/**
 *
 * @author Giu
 */
public class Conta_Poupanca extends Conta{
    
    //atributos
    private int dia_rendimento_dinheiro;
    
    //metodos
    public Conta_Poupanca(){
        super();
    }
    
    public Conta_Poupanca(String nome_cliente, int numero_conta, float saldo, int dia_rendimento_dinheiro)
    throws Exception{
        super(nome_cliente, numero_conta, saldo);
        if(dia_rendimento_dinheiro <= 0) throw new Exception("O dia do Rendimento não pode ser <= 0");
        if(numero_conta<0) throw new Exception("Número da conta não pode ser negativa");
        this.dia_rendimento_dinheiro = dia_rendimento_dinheiro;
    }

    /**
     * @return the dia_rendimento_dinheiro
     */
    public int getDia_rendimento_dinheiro() {
        return dia_rendimento_dinheiro;
    }

    /**
     * @param dia_rendimento_dinheiro the dia_rendimento_dinheiro to set
     */
    public void setDia_rendimento_dinheiro(int dia_rendimento_dinheiro) {
        this.dia_rendimento_dinheiro = dia_rendimento_dinheiro;
    }
    
    @Override
    public String toString(){
        return "Dia Rendimento: " + dia_rendimento_dinheiro;
    }
    
    public boolean calcularNovoSaldo(float taxaRendimento) throws Exception {
        Calendar hoje = Calendar.getInstance();
        //o saldo * a taxa de rendimento
        //o rendimento depende do dia escolhido
    if (dia_rendimento_dinheiro <= 0) throw new Exception("O dia do Rendimento não pode ser <= 0");
    if (dia_rendimento_dinheiro == hoje.get(Calendar.DAY_OF_MONTH)){
        this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
        return true;
    }
        return false;
    }
    
    public float calcularNovoSaldoValor(float taxaRendimentoValor) throws Exception {
    Calendar hoje = Calendar.getInstance();
    if (dia_rendimento_dinheiro <= 0) throw new Exception("O dia do Rendimento não pode ser <= 0");
    if (dia_rendimento_dinheiro == hoje.get(Calendar.DAY_OF_MONTH)){
    this.setSaldo(this.getSaldo()+((taxaRendimentoValor/100)*this.getSaldo()));
    }
    return taxaRendimentoValor;
    }
    
    
    
    @Override
    public String getTipoDaConta() {
        return "Conta Poupança";
    }
    
    /*@Override
    public float deposito() {
        return 0;
    }
    
    @Override
    public float saque() {
        return 0;
    }*/

    
}
