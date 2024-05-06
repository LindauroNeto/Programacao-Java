package tstinterface;

interface Trabalhadores {
    public void irAoTrabalho(String horario, String meioDeLocomocao);
    public void trabalhando();
    public void voltaPraCasa(String horario, String meioDeLocomocao);
}

public class Trabalhador {
    String nome;
    int idade;

    public static void main(String[] args) {
        Telemarketing worker1 = new Telemarketing(
            "Wellington", 
            23
        );

        worker1.irAoTrabalho("6hrs", "Metrô");
        worker1.trabalhando();
        worker1.voltaPraCasa("18hrs", "Uber moto");
        worker1.apresentacao();
    }
    
    static class Telemarketing extends Trabalhador implements Trabalhadores {
        Telemarketing(String nome, int idade){
            super.nome = nome;
            super.idade = idade;
        }
        
        @Override
        public void irAoTrabalho(String horario, String meioDeLocomocao) {
            System.out.format("%s vai para o trabalho às %s de %s\n", nome, horario, meioDeLocomocao.toLowerCase());
        }
    
        @Override
        public void trabalhando(){
            System.out.format("%s está trabalhando.\n", nome);
        }

        @Override
        public void voltaPraCasa(String horario, String meioDeLocomocao){
            System.out.format("%s está indo para casa de %s, saindo às %s\n", nome, meioDeLocomocao.toLowerCase(), horario);
        }

        public void apresentacao(){
            System.out.format("No final do dia... %s chega em casa cansado e tem um festa supresa de seu aniversário! Ele completa %d anos!\n", nome, idade+1);
        }
    }
}

