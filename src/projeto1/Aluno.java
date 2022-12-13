/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto1;

import java.util.ArrayList;

/**
 * A classe classe <b>Aluno</b> é uma extensao da classe Pessoa e contem os atributos necessários para se criar um aluno para a Universidade
 * @author Enrico Nunes
 * @since novembro 2022
 * @version 1.0
 */
public class Aluno extends Pessoa{
    private static int contador = 0;
    private int numero;
    private int ects = 0;
    private Curso curso;
    private String nome, paisOrigem, uniOrigem;
    private ArrayList<Disciplina> disciplinas;

    /**
     * Construtor sem parametros que instancia um array de objetos do tipo Disciplina e atribui, de forma automatica, um numero ao aluno atraves de uma variavel de classe 'contador'
     */
    public Aluno(){
        disciplinas = new ArrayList<>();
        this.numero = contador;
        contador++;
        
    }
    /**
     * Construtor com parametros ('nome', 'paisOrigem' e 'uniOrigem') que instancia um array de objetos do tipo Disciplina e atribui, de forma automatica, um numero ao aluno atraves de uma variavel de classe 'contador'<br>
     * Alem disso, atraves dos parametros, os atributos 'nome', 'paisOrigem' e 'uniOrigem' sao definidos
     * @param nome nome do aluno
     * @param paisOrigem pais de origem do aluno
     * @param uniOrigem universidade de origem do aluno
     */
    public Aluno(String nome, String paisOrigem, String uniOrigem) {
        disciplinas = new ArrayList<>();
        this.nome = nome;
        this.numero = contador;
        contador++;
    }
    
    /**
     * @deprecated Construtor descontinuado
     * @param numero
     * @param curso
     * @param paisOrigem
     * @param uniOrigem
     */
    public Aluno(int numero, Curso curso, String paisOrigem, String uniOrigem) {
        this.numero = numero;
        this.curso = curso;
        this.paisOrigem = paisOrigem;
        this.uniOrigem = uniOrigem;
        
        this.numero = contador;
        contador++;
    }
    
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getUniOrigem() {
        return uniOrigem;
    }

    public void setUniOrigem(String uniOrigem) {
        this.uniOrigem = uniOrigem;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public int getEcts() {
        return ects;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Aluno.contador = contador;
    }
    
    
    
    public int quantidadeDisciplina(){
        return disciplinas.size();
    }

    /**
     * Metodo que recebe um nome do tipo String e o utiliza para conferir se existe alguma disciplina com este nome no array de disciplinas desta classe Aluno
     * @param nome String para referenciar um nome
     * @return Retorna true se existir alguma disciplina ou retorna false se nao existir alguma diciplina com o nome igual ao escrito no parametro 'nome'
     */
    public boolean conferirDisciplina(String nome){
        for (int x = 0; x < disciplinas.size(); x++){
            if (nome.equals(disciplinas.get(x).getNome())){
                return true;
            }            
        }
        return false;
        }
    
    /**
     * Recebe uma String 'nome' e adiciona um objeto do tipo Disciplina ao array de disciplinas da classe Aluno que possui o nome igual a 'nome'
     * @param nome String que referencia o nome da disciplina a ser adicionada
     */
    public void adicionarDisciplina(Disciplina nome){
        this.disciplinas.add(nome);
        this.ects = this.ects + nome.getEcts();
    }
    
    /**
     * Recebe uma String 'nome' e remove o objeto do tipo Disciplina do array de disciplinas da classe Aluno que possui o nome igual a 'nome'
     * @param nome String que referencia o nome da disciplina a ser removida
     */
    public void removerDisciplina(String nome){
        for(int x = 0; x < this.disciplinas.size(); ++x){
            if (nome.equals(this.disciplinas.get(x).getNome())){
                this.disciplinas.remove(x);
                this.ects = this.ects - this.disciplinas.get(x).getEcts();
            }
        }
        }
    
    /**
     * Recebe um parametro 'indice' e faz um print do nome da disciplina correspondente ao indice descrito no parametro
     * @param index posicao da disciplina a se fazer o print do nome
     */
    public void verDisciplinaIndice(int index){
        System.out.println("- " + disciplinas.get(index).getNome());
    }
    
    public String nomeDisciplinas(int index){
        return disciplinas.get(index).getNome();
    }
    
    /**
     * Metodo utilizado para conferir se o aluno possui a quantidade de ECTS correta.
     */
    public void verificaEcts(){
        if(this.ects < 12 || this.ects > 30){
            System.out.println("\nOBSERVACAO: Aluno com situacao IRREGULAR. Nao possui a quantidade de ECTS correcta.\n");
        }
        else{
            System.out.println("\nAluno com situacao REGULAR. Possui a quantidade de ECTS correcta.\n");
        }
    }
    
    /**
     * Metodo utilizado para fazer a leitura das disciplinas atraves do arquivo de texto alunos.txt
     * @param disciplinas Array com objetos do tipo Disciplina que deve conter todas as disciplinas disponiveis na faculdade
     * @param nome Nome que referencia o curso que deve ser adicionado ao array de disciplinas desta classe Aluno
     */
    public void setDisciplinaNome(ArrayList<Disciplina> disciplinas, String nome){
        for(int x = 0; x < disciplinas.size(); x++){
            if(nome.equals(disciplinas.get(x).getNome())){
                this.disciplinas.add(disciplinas.get(x));
                break;
            }
        }
    }
    
    public void setCursoNome(ArrayList<Curso> cursos, String nome){
        for(int x = 0; x < cursos.size(); x++){
            if(nome.equals(cursos.get(x).getNome())){
                this.setCurso(cursos.get(x));
                break;
            }
        }
    }
    
    public String verNomeCurso(){
        return this.curso.getNome();
    }

    @Override
    public String toString() {
        return "Aluno{" + "numero=" + numero + ", ects=" + ects + ", curso=" + curso.getNome() + ", nome=" + nome + ", paisOrigem=" + paisOrigem + ", uniOrigem=" + uniOrigem + ", disciplinas=" + disciplinas + '}';
    }
 
}
