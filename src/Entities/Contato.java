package Entities;

public class Contato {
    private String nome;
    private int numero;

    public Contato(){}

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public boolean existeContato(String nome) {
        return this.nome.contains(nome);
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void addContato(String newContato, int novoNumero) {
        this.nome += newContato;
        this.numero += novoNumero;
    }

    public void removerContato(String contatoARemover) {
        // Remove um contato pelo nome
        if (existeContato(contatoARemover)) {
            this.nome = this.nome.replace(contatoARemover, "").trim();
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
    @Override
    public String toString() {
        return  getNome() + " " + getNumero();
    }
}
