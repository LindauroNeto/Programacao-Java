package tstPOO;

public class tstMainClasse {
    public static void linhas(){
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
        
        // Classe conta bancária
        ContaBancaria conta1 = new ContaBancaria (
            "Paulo",
            98709812356l,
            834.65f,
            99991,
            329445056,
            "PicPay"
        );

        System.out.println(conta1.getNome() + " tem sua conta vinculada ao banco: " + conta1.getInstuicao());
        System.out.println("Mas agora, " + conta1.getNome() + " vai para o " + conta1.setInstuicao("Bradesco"));
        System.out.println("Com um saldo de R$ " + conta1.getSaldo());

        ContaBancaria conta2 = new ContaBancaria();
        
        System.out.println(conta2.getNome() + " tem sua conta vinculada ao banco: " + conta2.getInstuicao());
        System.out.println("Mas agora, " + conta2.getNome() + " vai para o " + conta2.setInstuicao("Bradesco"));
        System.out.println("Com um saldo de R$ " + conta2.getSaldo());

    }
}
