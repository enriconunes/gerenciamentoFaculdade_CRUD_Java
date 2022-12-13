
package projeto1;

/**
 * A classe classe <b>Pessoa</b> é uma superclasse das classes Aluno e Professor
 * @author Enrico Nunes
 * @since novembro 2022
 * @version 1.0
 */
public class Pessoa{
    private String nome, sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + '}';
    }
    
    
}
