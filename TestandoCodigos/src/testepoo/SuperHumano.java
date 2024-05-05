package testepoo;

public class SuperHumano extends SerHumano {
    String poder;
    String nomeFicticio;

    SuperHumano(String nome, int idade, String profissao, String poder, String nomeFicticio){
        super(nome, idade, profissao);
        this.poder = poder;
        this.nomeFicticio = nomeFicticio;
    }
}
