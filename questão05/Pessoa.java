package questão05;

public class Pessoa {
    private String nome;
    protected int idade;

    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
 public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

   public class estudante extends Pessoa {
    public estudante(String nome , int idade) {
        super(nome, idade);
    

        }
    }
}
