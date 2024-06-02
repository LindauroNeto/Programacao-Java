package tstpoo;

public class tstMainClasse {
    static void linhas(){
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        // Classe SerHumano
        linhas();
        
        SerHumano pessoa1 = new SerHumano("Pietro", 27, "Engenheiro de Software");
        System.out.printf("Nome: %s\nIdade: %d\nProfissão: %s\n", pessoa1.nome, pessoa1.idade, pessoa1.profissao);
        linhas();
        
        SerHumano pessoa2 = new SerHumano("Joabe", 43);
        System.out.printf("Nome: %s\nIdade: %d\n", pessoa2.nome, pessoa2.idade);
        linhas();
        
        SerHumano pessoa3 = new SerHumano("Karlos");
        System.out.printf("Nome: %s\n", pessoa3.nome);
        linhas();
        
        SerHumano pessoa4 = new SerHumano();
        System.out.printf("Nome: %s\nIdade: %d\nProfissão: %s\n", pessoa4.nome, pessoa4.idade, pessoa4.profissao);       
        linhas();
        
        // POO - ENCAPSULAMENTO
        // Classe conta bancária
        ContaBancaria conta1 = new ContaBancaria (
            "Paulo",
            98709812356l,
            834.65f,
            99991,
            329445056,
            "PicPay"
        );

        System.out.println(conta1.getNome() + " tem sua conta vinculada ao banco: " + conta1.getInstituicao());
        conta1.setInstituicao("Bradesco");
        System.out.println("Mas agora, " + conta1.getNome() + " vai para o " + conta1.getInstituicao());
        System.out.println("Com um saldo de R$ " + conta1.getSaldo());

        System.out.println();
        
        ContaBancaria conta2 = new ContaBancaria();
        
        System.out.println(conta2.getNome() + " tem sua conta vinculada ao banco: " + conta2.getInstituicao());
        conta2.setInstituicao("Banco do Brasil");
        System.out.println("Mas agora, " + conta2.getNome() + " vai para o " + conta2.getInstituicao());
        System.out.println("Com um saldo de R$ " + conta2.getSaldo());

        // POO - HERANCA
        // Super humano
        linhas();
        SuperHumano heroi1 = new SuperHumano(
            "Elielson",
            12,
            "Herói",
            "Eletricidade",
            "Chocante"
        );

        System.out.format("%s é um %s com %d anos de idade, com o poder da %s.\n", heroi1.nomeFicticio, heroi1.profissao.toUpperCase(), heroi1.idade, heroi1.poder.toLowerCase());
        
        
        SuperHumano vilao1 = new SuperHumano(
            "Laercio",
            22,
            "Vilão",
            "Manipulação de Ácido",
            "Acid"
        );

        System.out.format("%s é um %s com %d anos de idade, com o poder da %s.\n", vilao1.nomeFicticio, vilao1.profissao.toUpperCase(), vilao1.idade, vilao1.poder.toLowerCase());
        
        System.out.format("Shhhhhh... Eh segredo, mas os verdadeiros nomes deles são %s(%s) e %s(%s).", heroi1.nome, heroi1.nomeFicticio, vilao1.nome, vilao1.nomeFicticio);
    }
}
