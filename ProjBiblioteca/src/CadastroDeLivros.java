public class CadastroDeLivros {
    public static void main(String[] args) {
        Livro arteDaGuerra = new Livro(
            "A Arte da Guerra",
            "Sun Tzu",
            "Nesta edição o leitor encontrará os profundos e eficazes ensinamentos de Sun Tzu, ensinamentos que transcendem os limites dos campos de batalha e nos ajudam que a melhor enfrentar e vencer as adversidades tanto do trabalho quanto da vida cotidiana.",
            22.90f,
            "244-34-45912-34-2"
        );

        arteDaGuerra.mostrarDetalhes();

        Livro ostraFelizNFazPerola = new Livro(
            "Ostra Feliz Não Faz Pérola",
            "Rubem Alves",
            "O autor define seu livro: Pessoas felizes não sentem necessidade de criar. O ato criador, seja na ciência ou arte, surge sempre de uma dor. Não é preciso que seja uma dor doída. Por vezes, a dor aparece como aquela coceira que tem o nome de curiosidade.",
            24.50f,
            "234-76-65637-57-3"
        );

        ostraFelizNFazPerola.mostrarDetalhes();

        Livro naoNascemosProntos = new Livro(
            "Não Nascemos Prontos!",
            "Mario Sergio Cortella",
            "O autor mostra que quando estamos insatisfeitos somos capazes de inovar, mudar e nos construir aos poucos, pois o grande desafio humano é não se satisfazer com as coisas como estão.",
            9f,
            "123-45-76267-62-0"
        );

        naoNascemosProntos.mostrarDetalhes();

        System.out.println("------------------------------");
    }
}
