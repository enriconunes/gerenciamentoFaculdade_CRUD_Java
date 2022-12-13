/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto1;

import java.util.ArrayList;

/**
 * A classe classe <b>Curso</b> armazena os atributos necessários para se criar um curso da Universidade
 * @author Enrico Nunes
 * @since novembro 2022
 * @version 1.0
 */
public class Curso {
    private String nome;
    private ArrayList<Disciplina> disciplinas;
    
    /**
     * Construtor sem parametros que instancia um array de disciplinas do tipo Disciplina
     */
    public Curso(){
        disciplinas = new ArrayList<>();
    }
    
    /**
     * Construtor com parametro 'nome' que instancia um array de disciplinas do tipo Disciplina e atribui um nome ao objeto do tipo Curso
     * @param nome
     */
    public Curso(String nome){
        this.nome = nome;
        disciplinas = new ArrayList<>();
    }
    
    /**
     * Recebe um objeto do tipo Disciplina e o adiciona no array 'disciplinas'
     * @param objeto
     */
    public void adicionarDisciplina(Disciplina objeto){
        this.disciplinas.add(objeto);
    }
    
    public void verNomeDisciplinaIndex(int index){
        System.out.println("- " + disciplinas.get(index).getNome());
    }
    
    public void removerDisciplina(String nome){
        for(int x = 0; x < this.disciplinas.size(); ++x){
            if (nome.equals(this.disciplinas.get(x).getNome())){
                this.disciplinas.remove(x);
            }
        }
        }
    
    /**
     * Metodo para identificar a quantidade de disciplinas dentro deste objeto do tipo Curso
     * @return quantidade de disciplinas
     */
    public int quantidadeDisciplinas(){
        return disciplinas.size();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    /**
     * Metodo que recebe uma String 'nome' e confere se existe alguma disciplina no array 'disciplinas' com este nome
     * @param nome nome da disciplina a ser conferida
     * @return
     */
    public boolean conferirDisciplina(String nome){
        for (int x = 0; x < this.disciplinas.size(); x++){
            if (nome.equals(this.disciplinas.get(x).getNome())){
                return true;
            }            
        }
        return false;
        }

    /**
     * Recebe um array 'disciplinas' do tipo Disciplina e uma String 'nome' para adicionar, quando for encontrada, a disciplina
     * correspondente ao nome passado pelo parametro
     * @param disciplinas
     * @param nome
     */
    public void setDisciplinaNome(ArrayList<Disciplina> disciplinas, String nome){
        for(int x = 0; x < disciplinas.size(); x++){
            if(nome.equals(disciplinas.get(x).getNome())){
                this.disciplinas.add(disciplinas.get(x));
                break;
            }
        }
    }
    
    public String nomeUmaDisciplina(){
        return disciplinas.get(0).getNome();
    }
    
    public String nomeDisciplinas(int index){
        return disciplinas.get(index).getNome();
    }
    
    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", disciplinas=" + disciplinas + '}';
    }
    
    
}
