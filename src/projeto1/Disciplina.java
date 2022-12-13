/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto1;

import java.util.ArrayList;

/**
 * A classe classe <b>Disciplina</b> armazena os atributos necessários para se criar uma disciplina da Universidade
 * @author Enrico Nunes
 * @since novembro 2022
 * @version 1.0
 */
public class Disciplina {
    private String nome;
    private int ects;
    private String idioma;
    private ArrayList<Professor> professores;
    private int quantProfessores = 0;
    
    /**
     * Construtor sem parametros que intancia um array do tipo objeto Professor sempre que uma nova disciplina for instanciada.
     */
    public Disciplina(){
        professores = new ArrayList<>();
    }
    /**
     * Construtor com o parametro <b>nome</b> que intancia um array do tipo objeto Professor sempre que uma nova disciplina for instanciada<br>
     * e define o nome da disciplina atraves do parametro nome.
     * @param nome utilizado para definir o nome da disciplina no momento de instanciar um objeto do tipo Disciplina
     */
    public Disciplina(String nome) {
        professores = new ArrayList<>();
        this.nome = nome;
    }
    
    /**
     * Recebe um objeto Professor como parametro e o adiciona no array do tipo Professor
     * @param objeto objeto do tipo Professor que referencia o objeto que sera adicionado ao array de professores
     */
    public void adicionarProfessor(Professor objeto){
        this.professores.add(objeto);
        this.quantProfessores++;
    }
    
    /**
     * Recebe um objeto Professor como parametro e o remove do array do tipo Professor com a funçao .remove
     * @param objeto objeto do tipo Professor que referencia o objeto que sera removido do array de professores
     */
    public void removerProfessor(Professor objeto){
        this.professores.remove(objeto);
        this.quantProfessores--;
    }
    
    /**
     * Metodo que recebe uma String para refenciar o nome de um professor e confere se esse nome existe dentro da lista do tipo Professor<br>
     * Se este nome existir, significa que existe um professor com este nome e, se nao existir, significa que este professor nao existe.
     * @param nome
     * @return Retorna false se o professor nao existir ou retorna true se o professor existir
     */
    public boolean conferirProfessor(String nome){
        for (int x = 0; x < professores.size(); x++){
            if (nome.equals(professores.get(x).getNome())){
                return true;
            }            
        }
        return false;
        }

    /**
     * Este metodo recebe um index como parametro e retorna o atributo 'nome' do objeto do tipo Professor que está contido no array do tipo Professor
     * Metodo usado para fazer o print do nome de todos os professores existentes na lista quando é utilizado em um laço de repetiçao
     * @param index identificador da posicao do array
     * @return
     */
    public String nomeProfessores(int index){
        return professores.get(index).getNome();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }
    
    
    
    /**
     * Metodo utilizado para mostrar todos os professores existentes na lista Professor, assim como todos os seus atributos
     * @param index identificador da posicao do array
     */
    public void verProfessorIndice(int index){
        System.out.println("*\nNome: " + this.professores.get(index).getNome());
        System.out.println("Cargo: " + this.professores.get(index).getCargo());
        System.out.println("Email: " + this.professores.get(index).getEmail());
        System.out.println("Telemovel: " + this.professores.get(index).getTelemovel());
    }
    
    /**
     * Metodo utilizado para identificar a quantidade de professores que existem dentro do array Professor
     * @return quantidade de elementos no array Professor
     */
    public int getQuantProfessores() {
        return this.professores.size(); //mudança return quantProfessores para return professores.size()
    }

    public void setQuantProfessores(int quantProfessores) {
        this.quantProfessores = quantProfessores;
    }
    
    /**
     * Este metodo recebe como parametro uma lista de objetos do tipo Professor e uma String do tipo nome<br>
     * Com isso, o metodo utiliza o parametro 'nome' para identificar qual objeto do array de objetos do tipo Professor possui o atributo 'nome' igual ao parametro 'nome'
     * Ao identificar qual objeto possui esta similaridade, este objeto passa a ser inserido no array do tipo Professor desta classe Disciplina
     * Metodo utilizado para fazer a leitura de dados do ficheiro de texto professores.txt
     * @param professores array que contem objetos do tipo Professor
     * @param nome String que define o nome do professor que deve ser adicionado ao array de objetos do tipo Professor desta classe Disciplina
     */
    public void setProfessorNome(ArrayList<Professor> professores, String nome){
        for(int x = 0; x < professores.size(); x++){
            if(nome.equals(professores.get(x).getNome())){
                this.professores.add(professores.get(x));
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + nome + ", ects=" + ects + ", idioma=" + idioma + ", professores=" + professores + ", quantProfessores=" + quantProfessores + '}';
    }
    
}
