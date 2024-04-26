package tstPOO;

public class ContaBancaria {
    private String nome;
    private long cpf;
    private float saldo;
    private int agencia;
    private int conta;
    private String instituicao;

    ContaBancaria(){
        this("NaN", 0, 0, 0, 0, "NaN");
    }

    //Getters
    public String getNome(){
        return this.nome;
    }
    public long getCpf(){
        return this.cpf;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public int getConta(){
        return this.conta;
    }

    public String getInstuicao(){
        return this.instituicao;
    }

    //Setters
    public String setNome(String nome){
        return this.nome = nome;
    }

    public long setCpf(long cpf){
        return this.cpf = cpf;
    }

    public float setSaldo(float saldo){
        return this.saldo = saldo;
    }

    public int setAgencia(int agencia){
        return this.agencia = agencia;
    }

    public int setConta(int conta){
        return this.conta = conta;
    }

    public String setInstuicao(String instituicao){
        return this.instituicao = instituicao;
    }


    ContaBancaria(String nome, long cpf, float saldo, int agencia, int conta, String instituicao){
        setNome(nome);
        setCpf(cpf);
        setSaldo(saldo);
        setAgencia(agencia);
        setConta(conta);
        setInstuicao(instituicao);
    }
}
