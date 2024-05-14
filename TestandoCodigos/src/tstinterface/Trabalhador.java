package tstinterface;

public class Trabalhador {
    String nome;
    int idade;
    //String cargo;

    public static void main(String[] args) {
        Telemarketing worker1 = new Telemarketing(
            "Wellington", 
            23
        );

        Trabalhador.Telemarketing worker2 = new Trabalhador.Telemarketing(
            "Ana Tereza",
            38
        );

        worker1.irAoTrabalho("6hrs", "Metrô");
        worker1.trabalhando();
        worker1.voltaPraCasa("18hrs", "Uber moto");
        worker1.surpresa();

        System.out.println();

        worker2.irAoTrabalho("5hrs", "Carro");
        worker2.trabalhando();
        worker2.voltaPraCasa("13hrs", "Carro");
        worker2.surpresa();
    }
    
    static class Telemarketing extends Trabalhador implements Trabalhadores {
        Telemarketing(String nome, int idade){
            super.nome = nome;
            super.idade = idade;
        }
        
        @Override
        public void irAoTrabalho(String horario, String meioDeLocomocao) {
            System.out.format("%s vai para o trabalho às %s de %s.\n", nome, horario, meioDeLocomocao.toLowerCase());
        }
    
        @Override
        public void trabalhando(){
            System.out.format("%s está trabalhando.\n", nome);
        }

        @Override
        public void voltaPraCasa(String horario, String meioDeLocomocao){
            System.out.format("%s está indo para casa de %s, saindo às %s.\n", nome, meioDeLocomocao.toLowerCase(), horario);
        }

        public void surpresa(){
            System.out.format("No final do dia... %s chega em casa cansado e tem um festa supresa de seu aniversário! %s estah completando %d anos!\n", nome, nome, idade+1);
        }
    }
}

