package service;

import model.Autor;

// GRASP - Low Coupling: esta classe evita que outras partes do sistema dependam diretamente da estrutura de Autor.
public class LivroService {

    public void cadastrarLivro(Autor autor, String titulo, int ano) {
        autor.adicionarLivro(titulo, ano);
        System.out.println("Livro cadastrado com sucesso!");
    }

    public void listarLivros(Autor autor) {
        System.out.println("Livros de " + autor.getNome() + ":");
        autor.getLivros().forEach(livro -> System.out.println("- " + livro));
    }
}
