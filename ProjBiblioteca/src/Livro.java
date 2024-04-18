public class Livro {
    String nome;
    String autor;
    String sinopse;
    float preco;
    String isbn;

    public void mostrarDetalhes() {
        System.out.println("------------------------------");
        System.out.println("Mostrando detalhes do livro");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Autor: %s\n", autor);
        System.out.printf("Sinopse: %s\n", sinopse);
        System.out.println("Preço: R$ "+ preco);
        System.out.printf("ISBN: %s\n", isbn);
    }

    // V Construtor V
    Livro(String nome, String autor, String sinopse, float preco, String isbn){
        this.nome = nome;
        this.autor = autor;
        this.sinopse = sinopse;
        this.preco = preco;
        this.isbn = isbn;
    }
}
