/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto1;

/**
 * A classe classe <b>Professor</b> é uma extensão da classe Pessoa e armazena os atributos necessários para se criar um professor
 * @author Enrico Nunes
 * @since novembro 2022
 * @version 1.0
 */
public class Professor extends Pessoa{
    private String cargo;
    private String email;
    private int telemovel;

    /**
     * Construtor da classe Professor sem parametros
     */
    public Professor(){
        super();
    }
    /**
     * Construtor da classe Professor com paramentros, sendo eles: cargo, email e telemovel
     * @param cargo identifica o cargo do professor do tipo String
     * @param email identifica o email do professor do tipo String
     * @param telemovel identifica o telemovel do professor do tipo Integer
     */
    public Professor(String cargo, String email, int telemovel) {
        super();
        this.cargo = cargo;
        this.email = email;
        this.telemovel = telemovel;
    }
    
    /**
     *
     * @return Retorna o cargo do professor do tipo String
     */
    public String getCargo() {
        return cargo;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    /**
     *
     * @return Retorna o email do professor do tipo String
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return Retorna o telemovel do professor do tipo Integer
     */
    public int getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(int telemovel) {
        this.telemovel = telemovel;
    }

    /*
    public void verArrayProfessor(int index, ArrayList<Professor> objeto){
        System.out.println("\n");
        System.out.println("---------------------- PROFESSOR NUMERO " + index + " ----------------------");
        System.out.println("Nome do professor: " + objeto.get(index).getNome());
        System.out.println("Cargo do professor: " + objeto.get(index).getCargo());
        System.out.println("Telemovel do professor: " + objeto.get(index).getTelemovel());
        System.out.println("Email do professor: " + objeto.get(index).getEmail());
        System.out.println("----------------------------------------------------------------\n");
    }
    */

    @Override
    public String toString() {
        return "Professor{" +"nome= "+ getNome() + ", cargo=" + cargo + ", email=" + email + ", telemovel=" + telemovel + '}';
    }
    
    
    
}


