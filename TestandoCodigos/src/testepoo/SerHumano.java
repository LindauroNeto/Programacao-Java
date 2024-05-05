package testepoo;

public class SerHumano {
    String nome;
    int idade;
    String profissao;

    SerHumano(){
        this("NaN", 0, "NaN");
    }

    SerHumano(String nome){
        this.nome = nome;
    }

    SerHumano(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    SerHumano(String nome, int idade, String profissao){
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

}